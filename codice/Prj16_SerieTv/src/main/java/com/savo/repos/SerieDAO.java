package com.savo.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.savo.entities.Serie;

public interface SerieDAO extends JpaRepository<Serie, Integer> {
	
	List<Serie> findByRatingBetween(double min, double max);
	
}
