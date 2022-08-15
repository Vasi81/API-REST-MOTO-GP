package com.motogp.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.motogp.model.beans.Estadistica;
import com.motogp.model.dao.EstadisticaDao;

@RestController
@RequestMapping("/motogp")
public class EstadisticasRestController {
	@Autowired
	private EstadisticaDao estdao;
	
	@GetMapping("/statistics")
	public List <Estadistica>findAll(){
		return estdao.findAll();
	}
	
	@GetMapping("/statistics/topspeed")
	public int findByTopSpeed(){
		return estdao.findByVelocidadPuntaMax();
	}

}
