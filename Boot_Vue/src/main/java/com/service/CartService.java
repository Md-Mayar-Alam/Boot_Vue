package com.service;

import javax.servlet.http.HttpSession;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.napa.model.Cart;
import com.repository.CartRepository;

@Service
public class CartService {
	
	@Autowired
	CartRepository cartsRepository;
	
	/*@Autowired
	SessionFactory sessionFactory;*/
	
	public void addItemToCart() {
		
	}
	
	public Cart getSessionCart(HttpSession session) {
	 	//Session currentSession= sessionFactory.getCurrentSession();
	 	
	 	//Carts sessionCart= currentSession.
	 	
		Cart sessionCart= (Cart) session.getAttribute("cart");
		
		if(sessionCart == null) {
			//add new cart in session
			sessionCart= new Cart();
			session.setAttribute("cart", sessionCart);
		}
		
	 	return sessionCart;
	}
	
	
	public void saveCart(Cart cart) {
		cartsRepository.save(cart);
	}
	
}
