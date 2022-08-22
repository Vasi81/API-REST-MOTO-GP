package com.motogp.model.dao;

import java.util.List;

import com.motogp.model.beans.Estadistica;



public interface EstadisticaDao {
	
	List<Estadistica> findAll();
	
	int findByVelocidadPuntaMax(int idGranPremio);
	
	int findByVelocidadMedia(int idGranPremio);
	
	int findByFalls(int idGranPremio );
	
	int addEstadistica(Estadistica estadistica);
	
	int removeEstadistica(Estadistica estadistica, int id);
	
	int modifyEstadistica(Estadistica estadistica, int id);

}
