package com.controller;

import java.util.HashMap;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SplitTestController {

	enum Test{
		INPUT1("input1"),
		INPUT2("input2"),
		INPUT3("input3");
		
		String input;
		
		Test(String input){
			this.input= input;
		}
		
		public String getInput() {
			return this.input;
		}
	}
	
	@GetMapping("/splitString")
	public String getSplitString(Model model) {
		
		String string1= "First:This is first String";
		String string2= "Second:This is second String";
		String string3= "Third:This is third String";
		
		HashMap<Test, String> inputMap= new HashMap<>();
		
		inputMap.put(Test.INPUT1, string1);
		inputMap.put(Test.INPUT2, string2);
		inputMap.put(Test.INPUT3, string3);
		
		model.addAttribute("inputMap", inputMap);
		return "splitString";
	}
}
