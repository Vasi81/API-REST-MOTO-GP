package com.motogp.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.motogp.model.beans.Resultado;

public interface ResultadoRepository extends JpaRepository<Resultado, Integer>{
	
	@Query("select r from Resultado r where r.piloto.idPiloto=?1")
	public Resultado findByPiloto(int idPiloto);
	
	@Query("select r from Resultado r where r.granPremio.idGranPremio=?1")
	public Resultado findByGranPremio(int idGranPremio);
}
