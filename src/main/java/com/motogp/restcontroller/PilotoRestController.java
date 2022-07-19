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

import com.motogp.model.beans.Piloto;
import com.motogp.model.dao.PilotoDao;

@RestController
@RequestMapping("/motogp")
public class PilotoRestController {
	
	@Autowired
	private PilotoDao pdao;
	
	@GetMapping("/pilotos")
	public List<Piloto> findAll() {
		return pdao.findAll();
	}
 @GetMapping("/pilotos/{nombreEquipo}")
 public List <Piloto> findByNombreEquipo (@PathVariable ("nombreEquipo") String nombreEquipo) {
	 
	 return pdao.findByEquipo(nombreEquipo);
	 
 }
 
 @GetMapping("/piloto/{idPiloto}")
 public Piloto findById(@PathVariable("idPiloto") int idPiloto) {
	 return pdao.findByNumber(idPiloto);
 }
 
 @GetMapping("/pilotos/nacionalidad/{nacionalidad}")
 public List <Piloto> findByNation(@PathVariable("nacionalidad") String nacionalidad){
	 return pdao.findByNacionalidad(nacionalidad);
 }
 
@PostMapping("/altaPilotos")
public String addPilot(@RequestBody Piloto piloto) {
	return (pdao.addPiloto(piloto)==1?"Alta realizada":"Alta No realizada");
}

@PutMapping("/modificarPiloto/{idPiloto}")
public String modifyPilot(@RequestBody Piloto piloto, @PathVariable ("idPiloto") int idPiloto) {
	return(pdao.modifyPiloto(piloto, idPiloto)==1?"Modificación realizada":"Modificación No realizada");
}

@DeleteMapping("/borrarPiloto/{idPiloto}")
public String removePilot(@PathVariable("idPiloto") int idPiloto) {
	return(pdao.removePiloto(idPiloto)==0?"Piloto borrado":"Piloto Nooooo Borrado");
}
}
