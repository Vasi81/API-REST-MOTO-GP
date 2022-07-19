package com.motogp.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

}
