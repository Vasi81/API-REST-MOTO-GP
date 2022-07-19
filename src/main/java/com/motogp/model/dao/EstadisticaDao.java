package com.motogp.model.dao;

import java.util.List;

import com.motogp.model.beans.Estadistica;

public interface EstadisticaDao {
	
	List<Estadistica> findAll();
	
	List<Estadistica> findByVelocidadPuntaMax();
	
	List<Estadistica> findByVelocidadMedia();
	
	int addEstadistica(Estadistica estadistica);
	
	int removeEstadistica(Estadistica estadistica);
	
	int modifyEstadistica(Estadistica estadistica, int id);

}
