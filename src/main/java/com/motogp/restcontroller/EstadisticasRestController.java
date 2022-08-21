package com.motogp.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	
	@GetMapping("/statistics/topspeed/{idGranPremio}")
	public int findByTopSpeed(@PathVariable("idGranPremio")int idGranPremio){
		return estdao.findByVelocidadPuntaMax(idGranPremio);
	}
	
	@GetMapping("/statistics/avgspeed/{idGranPremio}")
	public int findByAvgSpeed(@PathVariable("idGranPremio")int idGranPremio) {
		return estdao.findByVelocidadMedia(idGranPremio);
	}

	@PostMapping("/altaEstadistica")
	public String addStatistic(@RequestBody Estadistica estadistica) {
		
	return (estdao.addEstadistica(estadistica)==1? "Alta realizada":"Alta Noo realizada");

}
	@PutMapping("/modifyEstadistica/{id}")
	public String modifyStatistic(@RequestBody Estadistica estadistica, @PathVariable("id")int id) {
		return (estdao.modifyEstadistica(estadistica, id)==1?"Modificación realizada": "Modificación Noo realizada");
	}
	
	@DeleteMapping("/removeEstadistica/{id}")
	public String removeEstadistica(Estadistica estadistica, @PathVariable("id") int id) {
		return (estdao.removeEstadistica(estadistica, id)==1?"Estadistica borrada":"Estadistica Noo Borrada");
	}
	
	
}
