package com.controller;

import java.util.Set;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.napa.form.AddToCartForm;
import com.napa.model.Cartentry;
import com.napa.model.Cart;
import com.napa.model.Product;
import com.service.CartService;
import com.service.ProductService;

@Controller
public class AddToCartController {
	
	@Autowired
	ProductService productsService;
	
	@Autowired
	CartService cartsService;
	
	@RequestMapping("/add/cart")
	public void addToCart(AddToCartForm addToCartForm, HttpSession session) {
		String productCode= addToCartForm.getName();
		
		Product product= productsService.findProductByCode(productCode);
		
		if(product != null) {
			Cart cart= cartsService.getSessionCart(session);
			Set<Cartentry> cartEntries= cart.getCartentries();
			
			Cartentry cartentry= new Cartentry();
			
			cartentry.setProduct(product);
			
			cartEntries.add(cartentry);
			
			cartsService.saveCart(cart);
		}
	}
}	
