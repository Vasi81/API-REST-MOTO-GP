package com.motogp.model.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.motogp.model.beans.GranPremio;
import com.motogp.model.repository.GranPremioRepository;
@Repository
public class GranPremioDaoimpl implements GranPremioDao {
	@Autowired
	private GranPremioRepository gprepo;
	@Override
	public List<GranPremio> findAll() {
		
		return gprepo.findAll();
	}

	@Override
	public GranPremio findByPais(String pais) {
		
		return gprepo.findByPais(pais);
	}

	@Override
	public GranPremio findByCiudad(String ciudad) {
		
		return gprepo.findByCiudad(ciudad);
	}

	@Override
	public int addGranPremio(GranPremio gp) {
		int filas=0;
		try {
			gprepo.save(gp);
			filas=1;
		}catch(Exception e) {
			e.printStackTrace();
		}
		return filas;
	}

	@Override
	public int removeGranPremio(GranPremio gp, int idGranPremio) {
		if(gp!=null) {
			gprepo.delete(gp);
			return 1;
		}else
			return 0;
	}

	@Override
	public int modifyGranPremio(GranPremio gp, int idGranPremio) {
		if(findOne(idGranPremio)!=null) {
			gprepo.save(gp);
			return 1;	
		}else
		return 0;
	}

	@Override
	public GranPremio findOne(int idGranPremio) {
		
		return gprepo.findById(idGranPremio).orElse(null);
	}

}
