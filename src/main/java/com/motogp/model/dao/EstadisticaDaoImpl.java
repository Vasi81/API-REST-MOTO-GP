package com.motogp.model.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.motogp.model.beans.Estadistica;
import com.motogp.model.repository.EstadisticaRepository;

@Repository
public class EstadisticaDaoImpl implements EstadisticaDao {
	@Autowired
	private EstadisticaRepository estrepo;
	@Override
	public List<Estadistica> findAll() {
		
		return estrepo.findAll();
	}

	@Override
	public List<Estadistica> findByVelocidadPuntaMax() {
		
		return estrepo.findByVelocidadPuntaMax();
	}

	@Override
	public List<Estadistica> findByVelocidadMedia() {
		
		return estrepo.findByVelocidadMedia();
	}

	@Override
	public int addEstadistica(Estadistica estadistica) {
		int filas=0;
		try {
			estrepo.save(estadistica);
			filas=1;
		}catch(Exception e) {
			e.printStackTrace();
		}
		return filas;
	}

	@Override
	public int removeEstadistica(Estadistica estadistica) {
		int filas=0;
		try {
			estrepo.delete(estadistica);
			filas=1;
		}catch(Exception e) {
			e.printStackTrace();
		}
		return filas;
	}

	@Override
	public int modifyEstadistica(Estadistica estadistica, int id) {
		if (id!=0) {
			estrepo.save(estadistica);
			return 1;
		}
		return 0;
	}

}