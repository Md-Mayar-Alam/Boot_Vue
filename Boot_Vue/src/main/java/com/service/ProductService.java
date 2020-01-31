package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.napa.model.Product;
import com.repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	ProductRepository productsRepository;
	
	public Product findProductByCode(String productCode) {
		return productsRepository.findByCode(productCode);
	}
}
