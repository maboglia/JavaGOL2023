package com.savo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Router {
	
	@GetMapping(path = {"/","index","home"})
	public String home() {
		return "index";
	}
	
}
