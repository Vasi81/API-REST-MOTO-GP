package com.motogp.model.dao;

import java.util.List;

import com.motogp.model.beans.GranPremio;

public interface GranPremioDao {
	
	List<GranPremio>findAll();
	
	GranPremio findByPais(String pais);
	
	GranPremio findByCiudad(String ciudad);
	
	int addGranPremio (GranPremio gp);
	
	int removeGranPremio (GranPremio gp);
	
	int modifyGranPremio (GranPremio gp, int id);

}
