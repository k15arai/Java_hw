package com.kenjiarai.hellohuman.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
//  URL http://localhost:8080/
//	@RequestMapping("/")
//	public String home() {
//		return "Hello Human";
//	}
	
	// URL http://localhost:8080/?={something}
	@RequestMapping("/")
	public String index(@RequestParam(value="name", required=false) String searchQuery, 
			@RequestParam(value="last_name", required=false) String searchQuery_ln, 
			@RequestParam(value="times", required=false) Integer times) {
		
		if (searchQuery == null && searchQuery_ln == null) {
			return "Hello Human";	
		} else if (times == null) {
			if (searchQuery == null) {
				return "You searched for " + searchQuery_ln;
			} else if (searchQuery_ln == null) {
				return "You searched for " + searchQuery;
			} else if (searchQuery != null && searchQuery_ln != null) {
				return "You searched for " + searchQuery + " " + searchQuery_ln;
			} else {
				return "check your parameters aagain";	
			}
		} else if (times > 0) {
			String repeatingMessage = "";
			
			if (searchQuery == null) {
				for (int i=0; i < times; i++) {
					repeatingMessage += "Hello" + " " + searchQuery_ln + " ";
				}
				return repeatingMessage;
			} else if (searchQuery_ln == null) {
				for (int i=0; i < times; i++) {
					repeatingMessage += "Hello" + " " + searchQuery + " ";
				}
				return repeatingMessage;
			} else if (searchQuery != null && searchQuery_ln !=null) {
				for (int i=0; i < times; i++) {
					repeatingMessage += "Hello" + " " + searchQuery + " " + searchQuery_ln + " ";
				}
				return repeatingMessage;
			} else {
				return "check your parameters";
			}
		} else {
			return "no conditions matched";
		}
	}
}
