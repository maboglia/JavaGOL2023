package com.perro.integration;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.perro.entities.Film;
import com.perro.services.FilmService;

@RestController
@RequestMapping("api")
public class FilmREST {
		
	@Autowired
	private FilmService service;
	
	@GetMapping("films")
	List<Film> lista(){
		return service.getFilm();
	}
	
	@GetMapping("films/{id}")
	Film filmById(@PathVariable int id) {
		return service.getFilmById(id);
	} 
	
	@PostMapping("films")
	Film addFilm(@RequestBody Film f) {
		return service.addFilm(f);
	}
	
	
	
	
}