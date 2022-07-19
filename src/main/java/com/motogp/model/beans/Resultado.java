package com.motogp.model.beans;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the resultados database table.
 * 
 */
@Entity
@Table(name="resultados")
@NamedQuery(name="Resultado.findAll", query="SELECT r FROM Resultado r")
public class Resultado implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private int posicion;

	//uni-directional many-to-one association to GranPremio
	@ManyToOne
	@JoinColumn(name="ID_GRAN_PREMIO")
	private GranPremio granPremio;

	//uni-directional many-to-one association to Piloto
	@ManyToOne
	@JoinColumn(name="ID_PILOTO")
	private Piloto piloto;

	public Resultado() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPosicion() {
		return this.posicion;
	}

	public void setPosicion(int posicion) {
		this.posicion = posicion;
	}

	public GranPremio getGranPremio() {
		return this.granPremio;
	}

	public void setGranPremio(GranPremio granPremio) {
		this.granPremio = granPremio;
	}

	public Piloto getPiloto() {
		return this.piloto;
	}

	public void setPiloto(Piloto piloto) {
		this.piloto = piloto;
	}

}