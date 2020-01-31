package com.controller;

import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.napa.model.Customer;
import com.napa.model.CustomerDefaultVehicle;
import com.napa.model.CustomerVehicle;
import com.napa.model.Vehicle;
import com.service.VehicleService;

@Controller
public class VehicleController {

	@Autowired
	VehicleService vehicleService;
	
	@GetMapping("/addVehicle/{endecaMakeId}")
	public void addVehicle(@PathVariable("endecaMakeId")final String endecaMakeId, HttpServletRequest request) {
		
		HttpSession session= request.getSession(false);
		
		Customer customer= (Customer)session.getAttribute("currentCustomer");
		
		Vehicle vehicle= vehicleService.getVehicleByEndecaMakeId(endecaMakeId);
		
		CustomerDefaultVehicle customerDefaultVehicle= new CustomerDefaultVehicle();
		
		customerDefaultVehicle.setVehicle(vehicle);
		
		customer.setCustomerDefaultVehicle(customerDefaultVehicle);

		Set<CustomerVehicle> customerVehicles= customer.getCustomerVehicles();
		
		boolean found= false;
		
		for(CustomerVehicle customerVehicle: customerVehicles) {
			if(customerVehicle.getVehicle().equals(vehicle)) {
				found= true;
			}
		}
		
		if(!found) {
			customerVehicles.add(new CustomerVehicle(null, customer, vehicle));
		}
		
		session.setAttribute("currentCustomer", customer);
	}
}
