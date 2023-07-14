package com.savo.presentation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.savo.entities.Serie;
import com.savo.services.SerieServices;

@Controller
public class SerieMvc {
	
	@Autowired
	private SerieServices service;
	
	@GetMapping("serie")
	public String showForm() {
		return "moduloadd";
	}
	
	@PostMapping("serie")
	public String addSerie(Serie s) {
		
		service.addSerie(s);
		
		return "redirect:serie";
	}
	
	@GetMapping("/")
	public String showHome() {
		return "index";
	}
	
	
}
