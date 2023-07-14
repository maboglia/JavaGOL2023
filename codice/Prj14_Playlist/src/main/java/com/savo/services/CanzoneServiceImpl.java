package com.savo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.savo.entities.Canzone;
import com.savo.repos.CanzoneDAO;

@Service
public class CanzoneServiceImpl implements CanzoneService{

	@Autowired
	private CanzoneDAO dao;
	
	@Override
	public List<Canzone> getCanzoni() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public List<Canzone> getCanzoniByCantante(String cantante) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Canzone getCanzoneById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Canzone addCanzone(Canzone c) {
		// TODO Auto-generated method stub
		return dao.save(c);
	}

}
