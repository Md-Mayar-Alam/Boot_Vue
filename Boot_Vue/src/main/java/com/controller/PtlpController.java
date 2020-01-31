package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PtlpController {

	@RequestMapping(value= "/ptlp")
	public String getPtlp() {
		return "ptlp";
	}
	
	@RequestMapping(value= "/ptlpTest")
	public String getPtlpTest(@RequestParam("searchTerm") final String searchTerm, Model model) {
		model.addAttribute("searchTerm", searchTerm);
		return "ptlpTest";
	}
	
	@GetMapping("/homepage")
	public String getHomepage() {
		return "homepage";
	}
	
	
	
	@ResponseBody
	@RequestMapping(value="/getJSONResponse/{searchTerm}", method= RequestMethod.GET)
	public String getJSONResponse(@PathVariable final String searchTerm) {
		return "{  \r\n" + 
				"   \"NavigationData\":\"Nty=1&N=++2800065+2805769+2803198+2809193&Hybrid=True\",\r\n" + 
				"   \"PartTypes\":{  \r\n" + 
				"      \"PartTypes\":[  \r\n" + 
				"         {  \r\n" + 
				"            \"Category\":{  \r\n" + 
				"               \"ConditionName\":\"Category\",\r\n" + 
				"               \"ConditionEndecaValue\":\"Engine Parts & Gaskets\",\r\n" + 
				"               \"ConditionEndecaID\":\"2500010\"\r\n" + 
				"            },\r\n" + 
				"            \"SubCategory\":{  \r\n" + 
				"               \"ConditionName\":\"SubCategory\",\r\n" + 
				"               \"ConditionEndecaValue\":\"Oil Pumps, Oil Pans & Related Parts\",\r\n" + 
				"               \"ConditionEndecaID\":\"2601013\"\r\n" + 
				"            },\r\n" + 
				"            \"BoostTokens\":[  \r\n" + 
				"\r\n" + 
				"            ],\r\n" + 
				"            \"Filters\":[  \r\n" + 
				"\r\n" + 
				"            ],\r\n" + 
				"            \"NonVehicleConditions\":[  \r\n" + 
				"\r\n" + 
				"            ],\r\n" + 
				"            \"PartType\":\"2800065\",\r\n" + 
				"            \"PartTypeName\":\"Oil Pan\",\r\n" + 
				"            \"CategoryPath\":\"Engine Parts & Gaskets > Oil Pumps, Oil Pans & Related Parts > Oil Pan\",\r\n" + 
				"            \"NavigationData\":\"Nty=1&N=2500010+2601013+2800065&Score=0.9\",\r\n" + 
				"            \"PartTypeImage\":\"https://s7d9.scene7.com/is/image/GenuinePartsCompany/NWMTMB?$Product=GenuinePartsCompany/1869636\",\r\n" + 
				"            \"Score\":0.9,\r\n" + 
				"            \"RawScore\":1.0,\r\n" + 
				"            \"CategoryLevel\":3,\r\n" + 
				"            \"YMMTokenMatched\":\"\",\r\n" + 
				"            \"HasApps\":false\r\n" + 
				"         },\r\n" + 
				"         {  \r\n" + 
				"            \"Category\":{  \r\n" + 
				"               \"ConditionName\":\"Category\",\r\n" + 
				"               \"ConditionEndecaValue\":\"Ignition Parts & Engine Filters\",\r\n" + 
				"               \"ConditionEndecaID\":\"2500001\"\r\n" + 
				"            },\r\n" + 
				"            \"SubCategory\":{  \r\n" + 
				"               \"ConditionName\":\"SubCategory\",\r\n" + 
				"               \"ConditionEndecaValue\":\"Engine Filters & Related Parts\",\r\n" + 
				"               \"ConditionEndecaID\":\"2600103\"\r\n" + 
				"            },\r\n" + 
				"            \"BoostTokens\":[  \r\n" + 
				"\r\n" + 
				"            ],\r\n" + 
				"            \"Filters\":[  \r\n" + 
				"\r\n" + 
				"            ],\r\n" + 
				"            \"NonVehicleConditions\":[  \r\n" + 
				"\r\n" + 
				"            ],\r\n" + 
				"            \"PartType\":\"2805769\",\r\n" + 
				"            \"PartTypeName\":\"Oil Filter\",\r\n" + 
				"            \"CategoryPath\":\"Ignition Parts & Engine Filters > Engine Filters & Related Parts > Oil Filter\",\r\n" + 
				"            \"NavigationData\":\"Nty=1&N=2500001+2600103+2805769&Score=0.9\",\r\n" + 
				"            \"PartTypeImage\":\"https://s7d9.scene7.com/is/image/GenuinePartsCompany/NWMTMB?$Product=GenuinePartsCompany/1230441\",\r\n" + 
				"            \"Score\":0.9,\r\n" + 
				"            \"RawScore\":1.0,\r\n" + 
				"            \"CategoryLevel\":3,\r\n" + 
				"            \"YMMTokenMatched\":\"\",\r\n" + 
				"            \"HasApps\":false\r\n" + 
				"         },\r\n" + 
				"         {  \r\n" + 
				"            \"Category\":{  \r\n" + 
				"               \"ConditionName\":\"Category\",\r\n" + 
				"               \"ConditionEndecaValue\":\"Ignition Parts & Engine Filters\",\r\n" + 
				"               \"ConditionEndecaID\":\"2500001\"\r\n" + 
				"            },\r\n" + 
				"            \"SubCategory\":{  \r\n" + 
				"               \"ConditionName\":\"SubCategory\",\r\n" + 
				"               \"ConditionEndecaValue\":\"Engine Filters & Related Parts\",\r\n" + 
				"               \"ConditionEndecaID\":\"2600103\"\r\n" + 
				"            },\r\n" + 
				"            \"BoostTokens\":[  \r\n" + 
				"\r\n" + 
				"            ],\r\n" + 
				"            \"Filters\":[  \r\n" + 
				"\r\n" + 
				"            ],\r\n" + 
				"            \"NonVehicleConditions\":[  \r\n" + 
				"\r\n" + 
				"            ],\r\n" + 
				"            \"PartType\":\"2803198\",\r\n" + 
				"            \"PartTypeName\":\"Motor Oil - 1 Quart / 1 Liter\",\r\n" + 
				"            \"CategoryPath\":\"Ignition Parts & Engine Filters > Engine Filters & Related Parts > Motor Oil - 1 Quart / 1 Liter\",\r\n" + 
				"            \"NavigationData\":\"Nty=1&N=2500001+2600103+2803198&Score=0.89\",\r\n" + 
				"            \"PartTypeImage\":\"https://s7d9.scene7.com/is/image/GenuinePartsCompany/NWMTMB?$Product=GenuinePartsCompany/L3_3410753\",\r\n" + 
				"            \"Score\":0.89,\r\n" + 
				"            \"RawScore\":0.99,\r\n" + 
				"            \"CategoryLevel\":3,\r\n" + 
				"            \"YMMTokenMatched\":\"\",\r\n" + 
				"            \"HasApps\":false\r\n" + 
				"         },\r\n" + 
				"         {  \r\n" + 
				"            \"Category\":{  \r\n" + 
				"               \"ConditionName\":\"Category\",\r\n" + 
				"               \"ConditionEndecaValue\":\"Chemicals & Car Care Products\",\r\n" + 
				"               \"ConditionEndecaID\":\"2500057\"\r\n" + 
				"            },\r\n" + 
				"            \"SubCategory\":{  \r\n" + 
				"               \"ConditionName\":\"SubCategory\",\r\n" + 
				"               \"ConditionEndecaValue\":\"Oil, Grease & Lubricants\",\r\n" + 
				"               \"ConditionEndecaID\":\"2605717\"\r\n" + 
				"            },\r\n" + 
				"            \"BoostTokens\":[  \r\n" + 
				"\r\n" + 
				"            ],\r\n" + 
				"            \"Filters\":[  \r\n" + 
				"\r\n" + 
				"            ],\r\n" + 
				"            \"NonVehicleConditions\":[  \r\n" + 
				"\r\n" + 
				"            ],\r\n" + 
				"            \"PartType\":\"2809193\",\r\n" + 
				"            \"PartTypeName\":\"Motor Oil\",\r\n" + 
				"            \"CategoryPath\":\"Chemicals & Car Care Products > Oil, Grease & Lubricants > Motor Oil\",\r\n" + 
				"            \"NavigationData\":\"Nty=1&N=2500057+2605717+2809193&Score=0.88\",\r\n" + 
				"            \"PartTypeImage\":\"https://s7d9.scene7.com/is/image/GenuinePartsCompany/NWMTMB?$Product=GenuinePartsCompany/L3_15037\",\r\n" + 
				"            \"Score\":0.88,\r\n" + 
				"            \"RawScore\":0.9801,\r\n" + 
				"            \"CategoryLevel\":3,\r\n" + 
				"            \"YMMTokenMatched\":\"\",\r\n" + 
				"            \"HasApps\":false\r\n" + 
				"         },\r\n" + 
				"         {  \r\n" + 
				"            \"Category\":{  \r\n" + 
				"               \"ConditionName\":\"Category\",\r\n" + 
				"               \"ConditionEndecaValue\":\"Chemicals & Car Care Products\",\r\n" + 
				"               \"ConditionEndecaID\":\"2500057\"\r\n" + 
				"            },\r\n" + 
				"            \"SubCategory\":{  \r\n" + 
				"               \"ConditionName\":\"SubCategory\",\r\n" + 
				"               \"ConditionEndecaValue\":\"Oil, Grease & Lubricants\",\r\n" + 
				"               \"ConditionEndecaID\":\"2605717\"\r\n" + 
				"            },\r\n" + 
				"            \"BoostTokens\":[  \r\n" + 
				"\r\n" + 
				"            ],\r\n" + 
				"            \"Filters\":[  \r\n" + 
				"\r\n" + 
				"            ],\r\n" + 
				"            \"NonVehicleConditions\":[  \r\n" + 
				"\r\n" + 
				"            ],\r\n" + 
				"            \"PartType\":\"2809201\",\r\n" + 
				"            \"PartTypeName\":\"Gear Oil\",\r\n" + 
				"            \"CategoryPath\":\"Chemicals & Car Care Products > Oil, Grease & Lubricants > Gear Oil\",\r\n" + 
				"            \"NavigationData\":\"Nty=1&N=2500057+2605717+2809201&Score=0.82\",\r\n" + 
				"            \"PartTypeImage\":\"https://s7d9.scene7.com/is/image/GenuinePartsCompany/NWMTMB?$Product=GenuinePartsCompany/1809865\",\r\n" + 
				"            \"Score\":0.82,\r\n" + 
				"            \"RawScore\":0.9075,\r\n" + 
				"            \"CategoryLevel\":3,\r\n" + 
				"            \"YMMTokenMatched\":\"\",\r\n" + 
				"            \"HasApps\":false\r\n" + 
				"         },\r\n" + 
				"         {  \r\n" + 
				"            \"Category\":{  \r\n" + 
				"               \"ConditionName\":\"Category\",\r\n" + 
				"               \"ConditionEndecaValue\":\"Ignition Parts & Engine Filters\",\r\n" + 
				"               \"ConditionEndecaID\":\"2500001\"\r\n" + 
				"            },\r\n" + 
				"            \"SubCategory\":{  \r\n" + 
				"               \"ConditionName\":\"SubCategory\",\r\n" + 
				"               \"ConditionEndecaValue\":\"Engine Filters & Related Parts\",\r\n" + 
				"               \"ConditionEndecaID\":\"2600103\"\r\n" + 
				"            },\r\n" + 
				"            \"BoostTokens\":[  \r\n" + 
				"\r\n" + 
				"            ],\r\n" + 
				"            \"Filters\":[  \r\n" + 
				"\r\n" + 
				"            ],\r\n" + 
				"            \"NonVehicleConditions\":[  \r\n" + 
				"\r\n" + 
				"            ],\r\n" + 
				"            \"PartType\":\"2801491\",\r\n" + 
				"            \"PartTypeName\":\"Motor Oil - Bulk\",\r\n" + 
				"            \"CategoryPath\":\"Ignition Parts & Engine Filters > Engine Filters & Related Parts > Motor Oil - Bulk\",\r\n" + 
				"            \"NavigationData\":\"Nty=1&N=2500001+2600103+2801491&Score=0.81\",\r\n" + 
				"            \"PartTypeImage\":\"https://s7d9.scene7.com/is/image/GenuinePartsCompany/NWMTMB?$Product=GenuinePartsCompany/0\",\r\n" + 
				"            \"Score\":0.81,\r\n" + 
				"            \"RawScore\":0.8976,\r\n" + 
				"            \"CategoryLevel\":3,\r\n" + 
				"            \"YMMTokenMatched\":\"\",\r\n" + 
				"            \"HasApps\":false\r\n" + 
				"         },\r\n" + 
				"         {  \r\n" + 
				"            \"Category\":{  \r\n" + 
				"               \"ConditionName\":\"Category\",\r\n" + 
				"               \"ConditionEndecaValue\":\"Chemicals & Car Care Products\",\r\n" + 
				"               \"ConditionEndecaID\":\"2500057\"\r\n" + 
				"            },\r\n" + 
				"            \"SubCategory\":{  \r\n" + 
				"               \"ConditionName\":\"SubCategory\",\r\n" + 
				"               \"ConditionEndecaValue\":\"Oil, Grease & Lubricants\",\r\n" + 
				"               \"ConditionEndecaID\":\"2605717\"\r\n" + 
				"            },\r\n" + 
				"            \"BoostTokens\":[  \r\n" + 
				"\r\n" + 
				"            ],\r\n" + 
				"            \"Filters\":[  \r\n" + 
				"\r\n" + 
				"            ],\r\n" + 
				"            \"NonVehicleConditions\":[  \r\n" + 
				"\r\n" + 
				"            ],\r\n" + 
				"            \"PartType\":\"2805206\",\r\n" + 
				"            \"PartTypeName\":\"Motor Oil - 2.5 Gallon\",\r\n" + 
				"            \"CategoryPath\":\"Chemicals & Car Care Products > Oil, Grease & Lubricants > Motor Oil - 2.5 Gallon\",\r\n" + 
				"            \"NavigationData\":\"Nty=1&N=2500057+2605717+2805206&Score=0.8\",\r\n" + 
				"            \"PartTypeImage\":\"https://s7d9.scene7.com/is/image/GenuinePartsCompany/NWMTMB?$Product=GenuinePartsCompany/3018155\",\r\n" + 
				"            \"Score\":0.8,\r\n" + 
				"            \"RawScore\":0.88622068965517,\r\n" + 
				"            \"CategoryLevel\":3,\r\n" + 
				"            \"YMMTokenMatched\":\"\",\r\n" + 
				"            \"HasApps\":false\r\n" + 
				"         },\r\n" + 
				"         {  \r\n" + 
				"            \"Category\":{  \r\n" + 
				"               \"ConditionName\":\"Category\",\r\n" + 
				"               \"ConditionEndecaValue\":\"Ignition Parts & Engine Filters\",\r\n" + 
				"               \"ConditionEndecaID\":\"2500001\"\r\n" + 
				"            },\r\n" + 
				"            \"SubCategory\":{  \r\n" + 
				"               \"ConditionName\":\"SubCategory\",\r\n" + 
				"               \"ConditionEndecaValue\":\"Engine Filters & Related Parts\",\r\n" + 
				"               \"ConditionEndecaID\":\"2600103\"\r\n" + 
				"            },\r\n" + 
				"            \"BoostTokens\":[  \r\n" + 
				"\r\n" + 
				"            ],\r\n" + 
				"            \"Filters\":[  \r\n" + 
				"\r\n" + 
				"            ],\r\n" + 
				"            \"NonVehicleConditions\":[  \r\n" + 
				"\r\n" + 
				"            ],\r\n" + 
				"            \"PartType\":\"2804430\",\r\n" + 
				"            \"PartTypeName\":\"Motor Oil - 5 Gal\",\r\n" + 
				"            \"CategoryPath\":\"Ignition Parts & Engine Filters > Engine Filters & Related Parts > Motor Oil - 5 Gal\",\r\n" + 
				"            \"NavigationData\":\"Nty=1&N=2500001+2600103+2804430&Score=0.8\",\r\n" + 
				"            \"PartTypeImage\":\"https://s7d9.scene7.com/is/image/GenuinePartsCompany/NWMTMB?$Product=GenuinePartsCompany/3139369\",\r\n" + 
				"            \"Score\":0.8,\r\n" + 
				"            \"RawScore\":0.88622068965517,\r\n" + 
				"            \"CategoryLevel\":3,\r\n" + 
				"            \"YMMTokenMatched\":\"\",\r\n" + 
				"            \"HasApps\":false\r\n" + 
				"         },\r\n" + 
				"         {  \r\n" + 
				"            \"Category\":{  \r\n" + 
				"               \"ConditionName\":\"Category\",\r\n" + 
				"               \"ConditionEndecaValue\":\"Chemicals & Car Care Products\",\r\n" + 
				"               \"ConditionEndecaID\":\"2500057\"\r\n" + 
				"            },\r\n" + 
				"            \"SubCategory\":{  \r\n" + 
				"               \"ConditionName\":\"SubCategory\",\r\n" + 
				"               \"ConditionEndecaValue\":\"Oil, Grease & Lubricants\",\r\n" + 
				"               \"ConditionEndecaID\":\"2605717\"\r\n" + 
				"            },\r\n" + 
				"            \"BoostTokens\":[  \r\n" + 
				"\r\n" + 
				"            ],\r\n" + 
				"            \"Filters\":[  \r\n" + 
				"\r\n" + 
				"            ],\r\n" + 
				"            \"NonVehicleConditions\":[  \r\n" + 
				"\r\n" + 
				"            ],\r\n" + 
				"            \"PartType\":\"2809189\",\r\n" + 
				"            \"PartTypeName\":\"4-Cycle Oil\",\r\n" + 
				"            \"CategoryPath\":\"Chemicals & Car Care Products > Oil, Grease & Lubricants > 4-Cycle Oil\",\r\n" + 
				"            \"NavigationData\":\"Nty=1&N=2500057+2605717+2809189&Score=0.8\",\r\n" + 
				"            \"PartTypeImage\":\"https://s7d9.scene7.com/is/image/GenuinePartsCompany/NWMTMB?$Product=GenuinePartsCompany/2042181\",\r\n" + 
				"            \"Score\":0.8,\r\n" + 
				"            \"RawScore\":0.88620967741935,\r\n" + 
				"            \"CategoryLevel\":3,\r\n" + 
				"            \"YMMTokenMatched\":\"\",\r\n" + 
				"            \"HasApps\":false\r\n" + 
				"         },\r\n" + 
				"         {  \r\n" + 
				"            \"Category\":{  \r\n" + 
				"               \"ConditionName\":\"Category\",\r\n" + 
				"               \"ConditionEndecaValue\":\"Small Engine, Power Equipment & Lawn / Garden\",\r\n" + 
				"               \"ConditionEndecaID\":\"2500067\"\r\n" + 
				"            },\r\n" + 
				"            \"SubCategory\":{  \r\n" + 
				"               \"ConditionName\":\"SubCategory\",\r\n" + 
				"               \"ConditionEndecaValue\":\"Miscellaneous Product\",\r\n" + 
				"               \"ConditionEndecaID\":\"2606799\"\r\n" + 
				"            },\r\n" + 
				"            \"BoostTokens\":[  \r\n" + 
				"\r\n" + 
				"            ],\r\n" + 
				"            \"Filters\":[  \r\n" + 
				"\r\n" + 
				"            ],\r\n" + 
				"            \"NonVehicleConditions\":[  \r\n" + 
				"\r\n" + 
				"            ],\r\n" + 
				"            \"PartType\":\"2809189\",\r\n" + 
				"            \"PartTypeName\":\"4-Cycle Oil\",\r\n" + 
				"            \"CategoryPath\":\"Small Engine, Power Equipment & Lawn / Garden > Miscellaneous Product > 4-Cycle Oil\",\r\n" + 
				"            \"NavigationData\":\"Nty=1&N=2500067+2606799+2809189&Score=0.8\",\r\n" + 
				"            \"PartTypeImage\":\"https://s7d9.scene7.com/is/image/GenuinePartsCompany/NWMTMB?$Product=GenuinePartsCompany/2042181\",\r\n" + 
				"            \"Score\":0.8,\r\n" + 
				"            \"RawScore\":0.88620967741935,\r\n" + 
				"            \"CategoryLevel\":3,\r\n" + 
				"            \"YMMTokenMatched\":\"\",\r\n" + 
				"            \"HasApps\":false\r\n" + 
				"         },\r\n" + 
				"         {  \r\n" + 
				"            \"Category\":{  \r\n" + 
				"               \"ConditionName\":\"Category\",\r\n" + 
				"               \"ConditionEndecaValue\":\"Ignition Parts & Engine Filters\",\r\n" + 
				"               \"ConditionEndecaID\":\"2500001\"\r\n" + 
				"            },\r\n" + 
				"            \"SubCategory\":{  \r\n" + 
				"               \"ConditionName\":\"SubCategory\",\r\n" + 
				"               \"ConditionEndecaValue\":\"Engine Filters & Related Parts\",\r\n" + 
				"               \"ConditionEndecaID\":\"2600103\"\r\n" + 
				"            },\r\n" + 
				"            \"BoostTokens\":[  \r\n" + 
				"\r\n" + 
				"            ],\r\n" + 
				"            \"Filters\":[  \r\n" + 
				"\r\n" + 
				"            ],\r\n" + 
				"            \"NonVehicleConditions\":[  \r\n" + 
				"\r\n" + 
				"            ],\r\n" + 
				"            \"PartType\":\"2803725\",\r\n" + 
				"            \"PartTypeName\":\"4-Cycle Oil\",\r\n" + 
				"            \"CategoryPath\":\"Ignition Parts & Engine Filters > Engine Filters & Related Parts > 4-Cycle Oil\",\r\n" + 
				"            \"NavigationData\":\"Nty=1&N=2500001+2600103+2803725&Score=0.8\",\r\n" + 
				"            \"PartTypeImage\":\"https://s7d9.scene7.com/is/image/GenuinePartsCompany/NWMTMB?$Product=GenuinePartsCompany/0\",\r\n" + 
				"            \"Score\":0.8,\r\n" + 
				"            \"RawScore\":0.88620967741935,\r\n" + 
				"            \"CategoryLevel\":3,\r\n" + 
				"            \"YMMTokenMatched\":\"\",\r\n" + 
				"            \"HasApps\":false\r\n" + 
				"         },\r\n" + 
				"         {  \r\n" + 
				"            \"Category\":{  \r\n" + 
				"               \"ConditionName\":\"Category\",\r\n" + 
				"               \"ConditionEndecaValue\":\"Vision, Safety & Misc Interior/Exterior Parts\",\r\n" + 
				"               \"ConditionEndecaID\":\"2500009\"\r\n" + 
				"            },\r\n" + 
				"            \"SubCategory\":{  \r\n" + 
				"               \"ConditionName\":\"SubCategory\",\r\n" + 
				"               \"ConditionEndecaValue\":\"Horns & Misc. Interior & Exterior Parts\",\r\n" + 
				"               \"ConditionEndecaID\":\"2600901\"\r\n" + 
				"            },\r\n" + 
				"            \"BoostTokens\":[  \r\n" + 
				"\r\n" + 
				"            ],\r\n" + 
				"            \"Filters\":[  \r\n" + 
				"\r\n" + 
				"            ],\r\n" + 
				"            \"NonVehicleConditions\":[  \r\n" + 
				"\r\n" + 
				"            ],\r\n" + 
				"            \"PartType\":\"2818108\",\r\n" + 
				"            \"PartTypeName\":\"Oil Temperature Gauge\",\r\n" + 
				"            \"CategoryPath\":\"Vision, Safety & Misc Interior/Exterior Parts > Horns & Misc. Interior & Exterior Parts > Oil Temperature Gauge\",\r\n" + 
				"            \"NavigationData\":\"Nty=1&N=2500009+2600901+2818108&Score=0.79\",\r\n" + 
				"            \"PartTypeImage\":\"https://s7d9.scene7.com/is/image/GenuinePartsCompany/NWMTMB?$Product=GenuinePartsCompany/223446\",\r\n" + 
				"            \"Score\":0.79,\r\n" + 
				"            \"RawScore\":0.88171875,\r\n" + 
				"            \"CategoryLevel\":3,\r\n" + 
				"            \"YMMTokenMatched\":\"\",\r\n" + 
				"            \"HasApps\":false\r\n" + 
				"         },\r\n" + 
				"         {  \r\n" + 
				"            \"Category\":{  \r\n" + 
				"               \"ConditionName\":\"Category\",\r\n" + 
				"               \"ConditionEndecaValue\":\"Chemicals & Car Care Products\",\r\n" + 
				"               \"ConditionEndecaID\":\"2500057\"\r\n" + 
				"            },\r\n" + 
				"            \"SubCategory\":{  \r\n" + 
				"               \"ConditionName\":\"SubCategory\",\r\n" + 
				"               \"ConditionEndecaValue\":\"Oil, Grease & Lubricants\",\r\n" + 
				"               \"ConditionEndecaID\":\"2605717\"\r\n" + 
				"            },\r\n" + 
				"            \"BoostTokens\":[  \r\n" + 
				"\r\n" + 
				"            ],\r\n" + 
				"            \"Filters\":[  \r\n" + 
				"\r\n" + 
				"            ],\r\n" + 
				"            \"NonVehicleConditions\":[  \r\n" + 
				"\r\n" + 
				"            ],\r\n" + 
				"            \"PartType\":\"2809200\",\r\n" + 
				"            \"PartTypeName\":\"Dripless Oil\",\r\n" + 
				"            \"CategoryPath\":\"Chemicals & Car Care Products > Oil, Grease & Lubricants > Dripless Oil\",\r\n" + 
				"            \"NavigationData\":\"Nty=1&N=2500057+2605717+2809200&Score=0.79\",\r\n" + 
				"            \"PartTypeImage\":\"https://s7d9.scene7.com/is/image/GenuinePartsCompany/NWMTMB?$Product=GenuinePartsCompany/773663\",\r\n" + 
				"            \"Score\":0.79,\r\n" + 
				"            \"RawScore\":0.8775,\r\n" + 
				"            \"CategoryLevel\":3,\r\n" + 
				"            \"YMMTokenMatched\":\"\",\r\n" + 
				"            \"HasApps\":false\r\n" + 
				"         },\r\n" + 
				"         {  \r\n" + 
				"            \"Category\":{  \r\n" + 
				"               \"ConditionName\":\"Category\",\r\n" + 
				"               \"ConditionEndecaValue\":\"Tools & Equipment\",\r\n" + 
				"               \"ConditionEndecaID\":\"2500068\"\r\n" + 
				"            },\r\n" + 
				"            \"SubCategory\":{  \r\n" + 
				"               \"ConditionName\":\"SubCategory\",\r\n" + 
				"               \"ConditionEndecaValue\":\"Diagnostic Tools & Related Products\",\r\n" + 
				"               \"ConditionEndecaID\":\"2606809\"\r\n" + 
				"            },\r\n" + 
				"            \"BoostTokens\":[  \r\n" + 
				"\r\n" + 
				"            ],\r\n" + 
				"            \"Filters\":[  \r\n" + 
				"\r\n" + 
				"            ],\r\n" + 
				"            \"NonVehicleConditions\":[  \r\n" + 
				"\r\n" + 
				"            ],\r\n" + 
				"            \"PartType\":\"2815513\",\r\n" + 
				"            \"PartTypeName\":\"Motor Oil Analysis Kit\",\r\n" + 
				"            \"CategoryPath\":\"Tools & Equipment > Diagnostic Tools & Related Products > Motor Oil Analysis Kit\",\r\n" + 
				"            \"NavigationData\":\"Nty=1&N=2500068+2606809+2815513&Score=0.79\",\r\n" + 
				"            \"PartTypeImage\":\"https://s7d9.scene7.com/is/image/GenuinePartsCompany/NWMTMB?$Product=GenuinePartsCompany/507937\",\r\n" + 
				"            \"Score\":0.79,\r\n" + 
				"            \"RawScore\":0.87630967741935,\r\n" + 
				"            \"CategoryLevel\":3,\r\n" + 
				"            \"YMMTokenMatched\":\"\",\r\n" + 
				"            \"HasApps\":false\r\n" + 
				"         },\r\n" + 
				"         {  \r\n" + 
				"            \"Category\":{  \r\n" + 
				"               \"ConditionName\":\"Category\",\r\n" + 
				"               \"ConditionEndecaValue\":\"Tools & Equipment\",\r\n" + 
				"               \"ConditionEndecaID\":\"2500068\"\r\n" + 
				"            },\r\n" + 
				"            \"SubCategory\":{  \r\n" + 
				"               \"ConditionName\":\"SubCategory\",\r\n" + 
				"               \"ConditionEndecaValue\":\"Shop Equipment & Related Products\",\r\n" + 
				"               \"ConditionEndecaID\":\"2606822\"\r\n" + 
				"            },\r\n" + 
				"            \"BoostTokens\":[  \r\n" + 
				"\r\n" + 
				"            ],\r\n" + 
				"            \"Filters\":[  \r\n" + 
				"\r\n" + 
				"            ],\r\n" + 
				"            \"NonVehicleConditions\":[  \r\n" + 
				"\r\n" + 
				"            ],\r\n" + 
				"            \"PartType\":\"2813171\",\r\n" + 
				"            \"PartTypeName\":\"Oil Evacuation System\",\r\n" + 
				"            \"CategoryPath\":\"Tools & Equipment > Shop Equipment & Related Products > Oil Evacuation System\",\r\n" + 
				"            \"NavigationData\":\"Nty=1&N=2500068+2606822+2813171&Score=0.79\",\r\n" + 
				"            \"PartTypeImage\":\"https://s7d9.scene7.com/is/image/GenuinePartsCompany/NWMTMB?$Product=GenuinePartsCompany/1637989\",\r\n" + 
				"            \"Score\":0.79,\r\n" + 
				"            \"RawScore\":0.87352941176471,\r\n" + 
				"            \"CategoryLevel\":3,\r\n" + 
				"            \"YMMTokenMatched\":\"\",\r\n" + 
				"            \"HasApps\":false\r\n" + 
				"         },\r\n" + 
				"         {  \r\n" + 
				"            \"Category\":{  \r\n" + 
				"               \"ConditionName\":\"Category\",\r\n" + 
				"               \"ConditionEndecaValue\":\"Tools & Equipment\",\r\n" + 
				"               \"ConditionEndecaID\":\"2500068\"\r\n" + 
				"            },\r\n" + 
				"            \"SubCategory\":{  \r\n" + 
				"               \"ConditionName\":\"SubCategory\",\r\n" + 
				"               \"ConditionEndecaValue\":\"Lube Tools, Fluid Storage/Transfer & Related Prod\",\r\n" + 
				"               \"ConditionEndecaID\":\"2606814\"\r\n" + 
				"            },\r\n" + 
				"            \"BoostTokens\":[  \r\n" + 
				"\r\n" + 
				"            ],\r\n" + 
				"            \"Filters\":[  \r\n" + 
				"\r\n" + 
				"            ],\r\n" + 
				"            \"NonVehicleConditions\":[  \r\n" + 
				"\r\n" + 
				"            ],\r\n" + 
				"            \"PartType\":\"2813171\",\r\n" + 
				"            \"PartTypeName\":\"Oil Evacuation System\",\r\n" + 
				"            \"CategoryPath\":\"Tools & Equipment > Lube Tools, Fluid Storage/Transfer & Related Prod > Oil Evacuation System\",\r\n" + 
				"            \"NavigationData\":\"Nty=1&N=2500068+2606814+2813171&Score=0.79\",\r\n" + 
				"            \"PartTypeImage\":\"https://s7d9.scene7.com/is/image/GenuinePartsCompany/NWMTMB?$Product=GenuinePartsCompany/1637989\",\r\n" + 
				"            \"Score\":0.79,\r\n" + 
				"            \"RawScore\":0.87352941176471,\r\n" + 
				"            \"CategoryLevel\":3,\r\n" + 
				"            \"YMMTokenMatched\":\"\",\r\n" + 
				"            \"HasApps\":false\r\n" + 
				"         },\r\n" + 
				"         {  \r\n" + 
				"            \"Category\":{  \r\n" + 
				"               \"ConditionName\":\"Category\",\r\n" + 
				"               \"ConditionEndecaValue\":\"Vision, Safety & Misc Interior/Exterior Parts\",\r\n" + 
				"               \"ConditionEndecaID\":\"2500009\"\r\n" + 
				"            },\r\n" + 
				"            \"SubCategory\":{  \r\n" + 
				"               \"ConditionName\":\"SubCategory\",\r\n" + 
				"               \"ConditionEndecaValue\":\"Horns & Misc. Interior & Exterior Parts\",\r\n" + 
				"               \"ConditionEndecaID\":\"2600901\"\r\n" + 
				"            },\r\n" + 
				"            \"BoostTokens\":[  \r\n" + 
				"\r\n" + 
				"            ],\r\n" + 
				"            \"Filters\":[  \r\n" + 
				"\r\n" + 
				"            ],\r\n" + 
				"            \"NonVehicleConditions\":[  \r\n" + 
				"\r\n" + 
				"            ],\r\n" + 
				"            \"PartType\":\"2800400\",\r\n" + 
				"            \"PartTypeName\":\"Oil Pressure Gauge\",\r\n" + 
				"            \"CategoryPath\":\"Vision, Safety & Misc Interior/Exterior Parts > Horns & Misc. Interior & Exterior Parts > Oil Pressure Gauge\",\r\n" + 
				"            \"NavigationData\":\"Nty=1&N=2500009+2600901+2800400&Score=0.79\",\r\n" + 
				"            \"PartTypeImage\":\"https://s7d9.scene7.com/is/image/GenuinePartsCompany/NWMTMB?$Product=GenuinePartsCompany/1830204\",\r\n" + 
				"            \"Score\":0.79,\r\n" + 
				"            \"RawScore\":0.87352941176471,\r\n" + 
				"            \"CategoryLevel\":3,\r\n" + 
				"            \"YMMTokenMatched\":\"\",\r\n" + 
				"            \"HasApps\":false\r\n" + 
				"         },\r\n" + 
				"         {  \r\n" + 
				"            \"Category\":{  \r\n" + 
				"               \"ConditionName\":\"Category\",\r\n" + 
				"               \"ConditionEndecaValue\":\"Engine Parts & Gaskets\",\r\n" + 
				"               \"ConditionEndecaID\":\"2500010\"\r\n" + 
				"            },\r\n" + 
				"            \"SubCategory\":{  \r\n" + 
				"               \"ConditionName\":\"SubCategory\",\r\n" + 
				"               \"ConditionEndecaValue\":\"Oil Pumps, Oil Pans & Related Parts\",\r\n" + 
				"               \"ConditionEndecaID\":\"2601013\"\r\n" + 
				"            },\r\n" + 
				"            \"BoostTokens\":[  \r\n" + 
				"\r\n" + 
				"            ],\r\n" + 
				"            \"Filters\":[  \r\n" + 
				"\r\n" + 
				"            ],\r\n" + 
				"            \"NonVehicleConditions\":[  \r\n" + 
				"\r\n" + 
				"            ],\r\n" + 
				"            \"PartType\":\"2801257\",\r\n" + 
				"            \"PartTypeName\":\"Oil Pump\",\r\n" + 
				"            \"CategoryPath\":\"Engine Parts & Gaskets > Oil Pumps, Oil Pans & Related Parts > Oil Pump\",\r\n" + 
				"            \"NavigationData\":\"Nty=1&N=2500010+2601013+2801257&Score=0.78\",\r\n" + 
				"            \"PartTypeImage\":\"https://s7d9.scene7.com/is/image/GenuinePartsCompany/NWMTMB?$Product=GenuinePartsCompany/1522274\",\r\n" + 
				"            \"Score\":0.78,\r\n" + 
				"            \"RawScore\":0.86625,\r\n" + 
				"            \"CategoryLevel\":3,\r\n" + 
				"            \"YMMTokenMatched\":\"\",\r\n" + 
				"            \"HasApps\":false\r\n" + 
				"         },\r\n" + 
				"         {  \r\n" + 
				"            \"Category\":{  \r\n" + 
				"               \"ConditionName\":\"Category\",\r\n" + 
				"               \"ConditionEndecaValue\":\"Ignition Parts & Engine Filters\",\r\n" + 
				"               \"ConditionEndecaID\":\"2500001\"\r\n" + 
				"            },\r\n" + 
				"            \"SubCategory\":{  \r\n" + 
				"               \"ConditionName\":\"SubCategory\",\r\n" + 
				"               \"ConditionEndecaValue\":\"Engine Filters & Related Parts\",\r\n" + 
				"               \"ConditionEndecaID\":\"2600103\"\r\n" + 
				"            },\r\n" + 
				"            \"BoostTokens\":[  \r\n" + 
				"\r\n" + 
				"            ],\r\n" + 
				"            \"Filters\":[  \r\n" + 
				"\r\n" + 
				"            ],\r\n" + 
				"            \"NonVehicleConditions\":[  \r\n" + 
				"\r\n" + 
				"            ],\r\n" + 
				"            \"PartType\":\"2803161\",\r\n" + 
				"            \"PartTypeName\":\"Oil Strainer\",\r\n" + 
				"            \"CategoryPath\":\"Ignition Parts & Engine Filters > Engine Filters & Related Parts > Oil Strainer\",\r\n" + 
				"            \"NavigationData\":\"Nty=1&N=2500001+2600103+2803161&Score=0.78\",\r\n" + 
				"            \"PartTypeImage\":\"https://s7d9.scene7.com/is/image/GenuinePartsCompany/NWMTMB?$Product=GenuinePartsCompany/977567\",\r\n" + 
				"            \"Score\":0.78,\r\n" + 
				"            \"RawScore\":0.86625,\r\n" + 
				"            \"CategoryLevel\":3,\r\n" + 
				"            \"YMMTokenMatched\":\"\",\r\n" + 
				"            \"HasApps\":false\r\n" + 
				"         },\r\n" + 
				"         {  \r\n" + 
				"            \"Category\":{  \r\n" + 
				"               \"ConditionName\":\"Category\",\r\n" + 
				"               \"ConditionEndecaValue\":\"Tools & Equipment\",\r\n" + 
				"               \"ConditionEndecaID\":\"2500068\"\r\n" + 
				"            },\r\n" + 
				"            \"SubCategory\":{  \r\n" + 
				"               \"ConditionName\":\"SubCategory\",\r\n" + 
				"               \"ConditionEndecaValue\":\"Shop Equipment & Related Products\",\r\n" + 
				"               \"ConditionEndecaID\":\"2606822\"\r\n" + 
				"            },\r\n" + 
				"            \"BoostTokens\":[  \r\n" + 
				"\r\n" + 
				"            ],\r\n" + 
				"            \"Filters\":[  \r\n" + 
				"\r\n" + 
				"            ],\r\n" + 
				"            \"NonVehicleConditions\":[  \r\n" + 
				"\r\n" + 
				"            ],\r\n" + 
				"            \"PartType\":\"2813180\",\r\n" + 
				"            \"PartTypeName\":\"Oil Drain - Low Profile\",\r\n" + 
				"            \"CategoryPath\":\"Tools & Equipment > Shop Equipment & Related Products > Oil Drain - Low Profile\",\r\n" + 
				"            \"NavigationData\":\"Nty=1&N=2500068+2606822+2813180&Score=0.78\",\r\n" + 
				"            \"PartTypeImage\":\"https://s7d9.scene7.com/is/image/GenuinePartsCompany/NWMTMB?$Product=GenuinePartsCompany/3055505\",\r\n" + 
				"            \"Score\":0.78,\r\n" + 
				"            \"RawScore\":0.86625,\r\n" + 
				"            \"CategoryLevel\":3,\r\n" + 
				"            \"YMMTokenMatched\":\"\",\r\n" + 
				"            \"HasApps\":false\r\n" + 
				"         }\r\n" + 
				"      ],\r\n" + 
				"      \"YMM\":[  \r\n" + 
				"\r\n" + 
				"      ],\r\n" + 
				"      \"UserInput\":\"oil\",\r\n" + 
				"      \"searchTerm\":\"oil\",\r\n" + 
				"      \"SearchType\":\"Navigation\",\r\n" + 
				"      \"TotalRecords\":20,\r\n" + 
				"      \"AdditionalFilters\":[  \r\n" + 
				"\r\n" + 
				"      ],\r\n" + 
				"      \"InputVehicleCondition\":\"\",\r\n" + 
				"      \"isVehicleFullyQualified\":false,\r\n" + 
				"      \"YmmTokensWithSearchTerm\":\"\"\r\n" + 
				"   },\r\n" + 
				"   \"HasMultiplePartTypes\":true,\r\n" + 
				"   \"IsInterchange\":false,\r\n" + 
				"   \"IsRequestTimedOut\":false,\r\n" + 
				"   \"IsZeroResults\":false,\r\n" + 
				"   \"isInbentaFailed\":false,\r\n" + 
				"   \"IsNicapFailed\":false,\r\n" + 
				"   \"NicapErrorMessage\":null,\r\n" + 
				"   \"IsPartNumber\":false,\r\n" + 
				"   \"IsFieldSKU\":false,\r\n" + 
				"   \"IsBrandSearch\":false,\r\n" + 
				"   \"IsVehicleSearch\":false\r\n" + 
				"}";
	}
}
