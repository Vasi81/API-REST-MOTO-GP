package com.motogp.model.dao;

import java.util.List;

import com.motogp.model.beans.Equipo;

public interface EquipoDao {
	
	List<Equipo>findAll();
	
	List<Equipo>findByNation(String nacionalidad);
	
	Equipo findOne(String nombreEquipo);
	
	int addEquipo (Equipo equipo);
	
	int removeEquipo (Equipo equipo, String nombreEquipo);
	
	int modifyEquipo (Equipo equipo, String nombreEquipo);

}
