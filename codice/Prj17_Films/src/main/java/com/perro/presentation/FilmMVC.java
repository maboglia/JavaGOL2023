package com.perro.presentation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.perro.services.FilmService;

@Controller
public class FilmMVC {
	
	@Autowired
	private FilmService service;
	
	@GetMapping("films")
	public String home(Model m) {
		
		m.addAttribute("elencoFilm", service.getFilm());
		
		return "elenco";
	}
	
	@GetMapping("films/{min}/{max}")
	public String home(Model m, @PathVariable Double min, @PathVariable Double max) {
		
		m.addAttribute("elencoFilm", service.getFilmByRating(min, max));
		
		return "elenco";
	}
	
	
}