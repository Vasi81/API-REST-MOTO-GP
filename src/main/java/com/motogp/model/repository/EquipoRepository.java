package com.motogp.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.motogp.model.beans.Equipo;

public interface EquipoRepository extends JpaRepository<Equipo, String>{
@Query("select e from Equipo e where e.nacionalidad=?1")
public List<Equipo>findByNation(String nacionalidad);

}
