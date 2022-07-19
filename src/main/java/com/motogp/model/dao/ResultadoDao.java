package com.motogp.model.dao;

import java.util.List;

import com.motogp.model.beans.Resultado;

public interface ResultadoDao {
	
	List<Resultado>findAll();
	
	Resultado findByPiloto(int idPiloto);
	
	Resultado findByGranPremio(int idGranPremio);
	
	int addResultado (Resultado resultado);
	
	int removeResultado(Resultado resultado);
	
	int modifyResultado (Resultado resultado, int idResultado);

}
