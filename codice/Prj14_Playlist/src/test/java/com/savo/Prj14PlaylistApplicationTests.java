package com.savo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.savo.entities.Canzone;
import com.savo.services.CanzoneService;

@SpringBootTest
class Prj14PlaylistApplicationTests {

	@Autowired
	private CanzoneService service;
	
	@Test
	void contextLoads() {
		
		Canzone c = new Canzone();
		c.setTitolo("Volare");
		c.setCantante("modugno");
		c.setAnno(1960);
		c.setGenere("pop");
		
		service.addCanzone(c);
		
		
		
	}

}
