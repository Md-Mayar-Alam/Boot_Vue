package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.napa.model.Customer;
import com.repository.CustomerRepository;

@Service
public class CustomerService {

	@Autowired
	CustomerRepository customerRepository;
	
	public Customer findCustomerByEmail(String email) throws Exception {
		
		return customerRepository.findByEmail(email).orElseThrow(() -> new Exception("Not Found") );
	}
}
