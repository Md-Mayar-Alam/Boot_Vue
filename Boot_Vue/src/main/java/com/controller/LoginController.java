package com.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.napa.model.Customer;
import com.request.model.LoginRequest;
import com.request.model.RegisterRequest;
import com.service.CustomerService;

@Controller
public class LoginController {

	@Autowired
	CustomerService customerService;
	
	@GetMapping("/login")
	public String getLoginRegisterPage(Model model) {
		model.addAttribute("loginRequest", new LoginRequest());
		model.addAttribute("registerRequest", new RegisterRequest());
		
		return "loginRegister";
	}
	
	@PostMapping("/login")
	public String loginUser(@ModelAttribute("loginRequest") final LoginRequest loginRequest, HttpServletRequest request, Model model) throws Exception {
		
		HttpSession session= request.getSession(false);
		
		System.out.println("Hii");
		
		Customer customer= customerService.findCustomerByEmail(loginRequest.getEmail());
		
		session.setAttribute("currentCustomer", customer);
		
		return "homepage";
	}
	
	@PostMapping("register")
	public String registerUser(@ModelAttribute("registerRequest")  final RegisterRequest registerRequest, HttpServletRequest request, Model model) {
		
		HttpSession session= request.getSession(false);
		
		System.out.println("Inside register");
		
		model.addAttribute("loginRequest", new LoginRequest());
		model.addAttribute("registerRequest", new RegisterRequest());
		
		return "loginRegister";
	}
	
}
