package com.motogp.model.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.motogp.model.beans.Equipo;
import com.motogp.model.repository.EquipoRepository;

@Repository
public class EquipoDaoImpl implements EquipoDao {
	@Autowired
	EquipoRepository erepo;
	@Override
	public List<Equipo> findAll() {
		
		return erepo.findAll();
	}

	@Override
	public List<Equipo> findByNation(String nacionalidad) {
		
		return erepo.findByNation(nacionalidad);
	}

	@Override
	public Equipo findOne(String nombreEquipo) {
		
		return erepo.findById(nombreEquipo).orElse(null);
		}

	@Override
	public int addEquipo(Equipo equipo) {
		int filas=0;
		try {
			erepo.save(equipo);
			filas=1;
		}catch(Exception e) {
			e.printStackTrace();
		}
		return filas;
	}

	@Override
	public int removeEquipo(Equipo equipo, String nombreEquipo) {
		int filas=0;
		if(nombreEquipo!=null)
		try {
			erepo.delete(equipo);;
			filas=1;
		}catch(Exception e) {
			e.printStackTrace();
		}
		return filas;
	}

	@Override
	public int modifyEquipo(Equipo equipo, String nombreEquipo) {
		if(findOne(nombreEquipo)!=null) {
			erepo.save(equipo);
			return 1;
		}else
		return 0;
	}

}
