package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.napa.model.Vehicle;
import com.repository.VehicleRepository;

@Service
public class VehicleService {
	
	@Autowired
	VehicleRepository vehicleRepository;
	
	public Vehicle getVehicleByEndecaMakeId(String endecaMakeId) {
		return vehicleRepository.findByEndecaMakeId(endecaMakeId);
	}
}
