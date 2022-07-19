package com.motogp.model.dao;

import java.util.List;

import com.motogp.model.beans.Piloto;

public interface PilotoDao {
	
	List<Piloto>findAll();
	
	List<Piloto> findByEquipo(String equipo);
	
	List<Piloto>findByNacionalidad(String nacionalidad);
	
	Piloto findByNumber (int idPiloto);
	
	int addPiloto(Piloto piloto);
	
	int removePiloto (int idPiloto);
	
	int modifyPiloto (Piloto piloto, int idPiloto);
	
	

}
