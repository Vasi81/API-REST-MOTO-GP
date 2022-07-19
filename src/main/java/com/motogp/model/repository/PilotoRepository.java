package com.motogp.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.motogp.model.beans.Piloto;

public interface PilotoRepository extends JpaRepository<Piloto, Integer>{
	@Query("select p from Piloto p where p.equipo=?1")
	public List<Piloto> findByEquipo(String equipo);
	
	@Query("select p from Piloto p where p.nacionalidad=?1")
	public List<Piloto>findByNacionalidad(String nacionalidad);
}
