package com.motogp.model.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.motogp.model.beans.GranPremio;

public interface GranPremioRepository extends JpaRepository<GranPremio, Integer>{

@Query ("select gp from GranPremio gp where gp.pais=?1")
public GranPremio findByPais(String pais);

@Query("select gp from GranPremio gp where gp.ciudad=?1")
public GranPremio findByCiudad(String ciudad);
}
