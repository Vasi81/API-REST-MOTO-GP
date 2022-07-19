package com.motogp.model.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.motogp.model.beans.Piloto;
import com.motogp.model.repository.PilotoRepository;
@Repository
public class PilotoDaoImpl implements PilotoDao {
	@Autowired
	private PilotoRepository prepo;
	@Override
	public List<Piloto> findAll() {
		
		return prepo.findAll();
	}

	@Override
	public List <Piloto> findByEquipo(String equipo) {
		
		return prepo.findByEquipo(equipo);
	}

	@Override
	public List<Piloto> findByNacionalidad(String nacionalidad) {
		
		return prepo.findByNacionalidad(nacionalidad);
	}

	@Override
	public Piloto findByNumber(int idPiloto) {
		
		return prepo.findById(idPiloto).orElse(null);
	}

	@Override
	public int addPiloto(Piloto piloto) {
		int filas=0;
		try {
			prepo.save(piloto);
			filas=1;
		}catch(Exception e) {
			e.printStackTrace();
		}
		return filas;
	}

	@Override
	public int removePiloto(int idPiloto) {
		int filas=0;
		
		try {
			prepo.deleteById(idPiloto);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return filas;
	}

	@Override
	public int modifyPiloto(Piloto piloto, int idPiloto) {
		if(findByNumber(idPiloto)!=null) {
			prepo.save(piloto);
			return 1;
		}else
		return 0;
	}

}
