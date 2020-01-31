package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PlpController {

	@GetMapping("/plp")
	public String getPlp() {
		return "plp";
	}
}
