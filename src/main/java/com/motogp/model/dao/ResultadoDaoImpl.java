package com.motogp.model.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.motogp.model.beans.Resultado;
import com.motogp.model.repository.ResultadoRepository;
@Repository
public class ResultadoDaoImpl implements ResultadoDao{

	@Autowired
	private ResultadoRepository rrepo;
	@Override
	public List<Resultado> findAll() {
		
		return rrepo.findAll();
	}

	@Override
	public Resultado findByPiloto(int idPiloto) {
		
		return rrepo.findByPiloto(idPiloto);
	}

	@Override
	public Resultado findByGranPremio(int idGranPremio) {
		
		return rrepo.findByGranPremio(idGranPremio);
	}

	@Override
	public int addResultado(Resultado resultado) {
		int filas=0;
		try {
			rrepo.save(resultado);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return filas;
	}

	@Override
	public int removeResultado(Resultado resultado) {
		int filas=0;
		try {
			rrepo.delete(resultado);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return filas;
	}

	@Override
	public int modifyResultado(Resultado resultado, int idResultado) {
		if(idResultado!=0) {
			rrepo.save(resultado);
			return 1;
		}else
		return 0;
	}

}
