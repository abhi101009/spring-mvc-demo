package com.aminfo.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomePageController {
	
	@RequestMapping("/")
	public String showHomePage() { 
		System.out.println("context up successfully.");
		return "index";
	}

	@RequestMapping("/login")
	public String showLoginForm() {
		return "login";
	}
	
	@RequestMapping("/proccedToLogin")
	public String proccedToLogin() {
		return "profile";
	}
	
}
