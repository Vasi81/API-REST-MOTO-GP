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

import com.motogp.model.beans.Equipo;
import com.motogp.model.dao.EquipoDao;

@RestController
@RequestMapping ("/motogp")
public class EquipoRestController {
	
	@Autowired
	private EquipoDao edao;
	
	
	
	@GetMapping ("/equipos")
	public List<Equipo>findAll(){
		return edao.findAll();
	}
	
	@GetMapping("/equipos/{nacionalidad}")
	public List<Equipo>findByNation(@PathVariable("nacionalidad")String nacionalidad){
		return edao.findByNation(nacionalidad);
	}
	
	@GetMapping ("equipo/{nombreEquipo}")
	public Equipo findTeam(@PathVariable("nombreEquipo") String nombreEquipo) {
		return edao.findOne(nombreEquipo);
	}
	
	@PostMapping("/altaTeam")
	public String addTeam(@RequestBody Equipo equipo) {
		
		return (edao.addEquipo(equipo)==1?"Alta realizada": "Alta No Realizada");
	}
	
	@PutMapping("/modificarTeam/{nombreEquipo}")
	public String modifyTeam(@RequestBody Equipo equipo, @PathVariable ("nombreEquipo") String nombreEquipo) {
		return (edao.modifyEquipo(equipo, nombreEquipo)==1?"Equipo modificado":"Equipo No modificado");
	}
	
	@DeleteMapping("removeTeam/{nombreEquipo}")
	public String removeTeam( Equipo equipo, @PathVariable ("nombreEquipo") String nombreEquipo) {
		return (edao.removeEquipo(equipo, nombreEquipo)==1?"Equipo borrado":"Equipo No borrado");
	}
}
