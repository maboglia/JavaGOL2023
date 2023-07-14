package com.savo.services;

import java.util.List;

import com.savo.entities.Serie;

public interface SerieServices {
	
	List<Serie> getSerie();
	Serie getSerieById(int id);
	Serie addSerie(Serie s);
	
	List<Serie> getSerieByRating(double min, double max);
	
}
