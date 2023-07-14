package com.savo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.savo.entities.Serie;
import com.savo.repos.SerieDAO;

@Service
public class SerieServicesImpl implements SerieServices {
	
	@Autowired // crea l'oggetto e lo collega
	private SerieDAO dao;
	
	@Override
	public List<Serie> getSerie() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public Serie getSerieById(int id) {
		// TODO Auto-generated method stub
		return dao.getReferenceById(id);
	}

	@Override
	public Serie addSerie(Serie s) {
		// TODO Auto-generated method stub
		return dao.save(s);
	}

	@Override
	public List<Serie> getSerieByRating(double min, double max) {
		// TODO Auto-generated method stub
		return dao.findByRatingBetween(min, max);
	}

}
