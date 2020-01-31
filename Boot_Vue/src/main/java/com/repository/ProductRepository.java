package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.napa.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{
	
	public Product findByCode(String productCode);
}
