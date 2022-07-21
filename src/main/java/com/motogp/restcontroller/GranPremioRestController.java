package com.motogp.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.motogp.model.beans.GranPremio;
import com.motogp.model.dao.GranPremioDao;

@RestController
@RequestMapping("/motogp")
public class GranPremioRestController {
	@Autowired
	private GranPremioDao gpdao;
	
	@GetMapping("/gp")
	public List<GranPremio>findAll(){
		return gpdao.findAll();
	}
	
	@GetMapping("/gp/pais/{pais}")
	public GranPremio findByPais(@PathVariable ("pais") String pais) {
		return gpdao.findByPais(pais);
	}
	
	@GetMapping("/gp/ciudad/{ciudad}")
	public GranPremio findByCiudad(@PathVariable("ciudad")String ciudad) {
		return gpdao.findByCiudad(ciudad);
	}

	@PostMapping("/altaGP")
	public String addGP(@RequestBody GranPremio gp) {
		return (gpdao.addGranPremio(gp)==1?"Alta realizada":"Alta Noo Realizada");
	}
	
	@PutMapping("/modificarGP/{idGranPremio}")
	public String modifyGP(@RequestBody GranPremio gp, @PathVariable ("idGranPremio") int idGranPremio) {
		return(gpdao.modifyGranPremio(gp, idGranPremio)==1?"Modificación realizada": "Modificación Noo realizada");
	}
	
	@DeleteMapping("/removeGP/{idGranPremio}")
	public String removeGP(GranPremio gp, @PathVariable ("idGranPremio") int idGranPremio) {
		return (gpdao.removeGranPremio(gp, idGranPremio)==1?"GP borrado":"GP Noo borrado");
	}
}
