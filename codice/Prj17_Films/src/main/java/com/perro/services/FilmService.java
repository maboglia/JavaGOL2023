package com.perro.services;

import java.util.List;

import com.perro.entities.Film;

public interface FilmService {
	
	List<Film> getFilm();
	Film getFilmById(int id);
	Film addFilm(Film f);
	List<Film> getFilmByRating(Double min, Double max);
}
