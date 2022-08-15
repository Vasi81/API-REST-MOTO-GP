package com.motogp.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


import com.motogp.model.beans.Estadistica;

public interface EstadisticaRepository extends JpaRepository<Estadistica, Integer> {
	
	@Query("select Max(velocidadPunta) from Estadistica")
	public int findByVelocidadPuntaMax();
	
	@Query("select AVG(velocidadMedia) from Estadistica")
	public List <Estadistica>findByVelocidadMedia();

}
