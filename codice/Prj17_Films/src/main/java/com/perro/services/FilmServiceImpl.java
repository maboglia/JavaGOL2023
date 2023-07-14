package com.perro.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.perro.entities.Film;
import com.perro.repos.FilmDAO;

@Service
public class FilmServiceImpl implements FilmService{
	
	@Autowired
	private FilmDAO dao;

	@Override
	public List<Film> getFilm() {
		return dao.findAll();
	}

	@Override
	public Film getFilmById(int id) {
		return dao.findById(id).get();
	}

	@Override
	public Film addFilm(Film f) {
		return dao.save(f);
	}

	@Override
	public List<Film> getFilmByRating(Double min, Double max) {
		return dao.findByRatingBetween(min, max);
	}
}
