package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class VueController {
	
	@RequestMapping(value= "/v-model", method= RequestMethod.GET)
	public String getVModel() {
		return "v-model";
	}
	
	@RequestMapping(value= "/vue-method", method= RequestMethod.GET)
	public String getVueMethod() {
		return "vue-method";
	}
}
