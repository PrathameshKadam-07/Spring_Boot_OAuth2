package com.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class LoginController {

	@GetMapping("/public")
	public String publicApi() {
		return "This is public Apis";
	}
	
	@GetMapping("/private")
	public String privateApi() {
		return "Authenticate";
	}
}
