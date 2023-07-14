package com.savo.services;

import java.util.List;

import com.savo.entities.Canzone;

public interface CanzoneService {
	
	List<Canzone> getCanzoni();
	List<Canzone> getCanzoniByCantante(String cantante);
	Canzone getCanzoneById(int id);
	Canzone addCanzone(Canzone c);
}