package com.savo.integration;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.savo.entities.Serie;
import com.savo.services.SerieServices;

@RestController
@RequestMapping("api")
public class SerieRest {
	
	@Autowired
	private SerieServices service;
	
	@GetMapping("serie")
	public List<Serie> getSerie(){
		return service.getSerie();
	}
	
}
