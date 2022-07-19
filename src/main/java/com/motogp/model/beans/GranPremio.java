package com.motogp.model.beans;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the gran_premio database table.
 * 
 */
@Entity
@Table(name="gran_premio")
@NamedQuery(name="GranPremio.findAll", query="SELECT g FROM GranPremio g")
public class GranPremio implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID_GRAN_PREMIO")
	private int idGranPremio;

	private String ciudad;

	@Temporal(TemporalType.DATE)
	private Date fecha;

	@Column(name="LONGITUD_CIRCUITO")
	private long longitudCircuito;

	private String pais;

	public GranPremio() {
	}

	public int getIdGranPremio() {
		return this.idGranPremio;
	}

	public void setIdGranPremio(int idGranPremio) {
		this.idGranPremio = idGranPremio;
	}

	public String getCiudad() {
		return this.ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public Date getFecha() {
		return this.fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public long getLongitudCircuito() {
		return this.longitudCircuito;
	}

	public void setLongitudCircuito(int longitudCircuito) {
		this.longitudCircuito = longitudCircuito;
	}

	public String getPais() {
		return this.pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

}