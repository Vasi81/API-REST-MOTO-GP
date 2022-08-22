package com.motogp.model.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


import com.motogp.model.beans.Estadistica;


public interface EstadisticaRepository extends JpaRepository<Estadistica, Integer> {
	
	@Query("select Max(velocidadPunta) from Estadistica e where e.granPremio.idGranPremio=?1")
	public int findByVelocidadPuntaMax(int idGranPremio);
	
	@Query("select AVG(velocidadMedia) from Estadistica e where e.granPremio.idGranPremio=?1")
	public int findByVelocidadMedia(int idGranPremio);
	
	@Query ("select caidas from Estadistica e where e.granPremio.idGranPremio=?1")
	public int findByFalls(int idGranPremio);
}
