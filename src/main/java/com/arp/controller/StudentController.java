package com.arp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("/api")
public class StudentController {

	@GetMapping("/")
	public String message() {
		return "Hi Arpan...!";
	}
	
}
