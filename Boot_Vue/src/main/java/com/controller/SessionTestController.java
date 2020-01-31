package com.controller;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SessionTestController {

	@RequestMapping(value= "/showSession", method= RequestMethod.GET)
	public String showSession(HttpSession httpSession) {
		
		httpSession.setAttribute("date", new Date());
		return "showSession";
	}
	
	@RequestMapping(value= "/requestSession", method= RequestMethod.GET)
	public String requestSession(HttpServletRequest request) {
	
		HttpSession session= request.getSession();
		session.setAttribute("date", new Date());
		return "requestSession";
	}
}
