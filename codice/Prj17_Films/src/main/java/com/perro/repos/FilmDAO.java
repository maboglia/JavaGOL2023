package com.perro.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.perro.entities.Film;

public interface FilmDAO extends JpaRepository<Film, Integer> {
	List<Film> findByRatingBetween(Double min, Double max);
}
