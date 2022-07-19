package com.motogp.model.beans;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the estadisticas database table.
 * 
 */
@Entity
@Table(name="estadisticas")
@NamedQuery(name="Estadistica.findAll", query="SELECT e FROM Estadistica e")
public class Estadistica implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private int caidas;

	@Column(name="VELOCIDAD_MEDIA")
	private int velocidadMedia;

	@Column(name="VELOCIDAD_PUNTA")
	private int velocidadPunta;

	//uni-directional many-to-one association to GranPremio
	@ManyToOne
	@JoinColumn(name="ID_GRAN_PREMIO")
	private GranPremio granPremio;

	public Estadistica() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCaidas() {
		return this.caidas;
	}

	public void setCaidas(int caidas) {
		this.caidas = caidas;
	}

	public int getVelocidadMedia() {
		return this.velocidadMedia;
	}

	public void setVelocidadMedia(int velocidadMedia) {
		this.velocidadMedia = velocidadMedia;
	}

	public int getVelocidadPunta() {
		return this.velocidadPunta;
	}

	public void setVelocidadPunta(int velocidadPunta) {
		this.velocidadPunta = velocidadPunta;
	}

	public GranPremio getGranPremio() {
		return this.granPremio;
	}

	public void setGranPremio(GranPremio granPremio) {
		this.granPremio = granPremio;
	}

}