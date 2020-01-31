package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PdpController {
	
	@GetMapping("/pdp")
	public String getPdp() {
		return "pdp";
	}
	
}
