package com.motogp.model.beans;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the pilotos database table.
 * 
 */
@Entity
@Table(name="pilotos")
@NamedQuery(name="Piloto.findAll", query="SELECT p FROM Piloto p")
public class Piloto implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID_PILOTO")
	private int idPiloto;

	private String apellido;

	private String equipo;

	private String moto;

	private String nacionalidad;

	private String nombre;

	private int puntos;

	public Piloto() {
	}

	public int getIdPiloto() {
		return this.idPiloto;
	}

	public void setIdPiloto(int idPiloto) {
		this.idPiloto = idPiloto;
	}

	public String getApellido() {
		return this.apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getEquipo() {
		return this.equipo;
	}

	public void setEquipo(String equipo) {
		this.equipo = equipo;
	}

	public String getMoto() {
		return this.moto;
	}

	public void setMoto(String moto) {
		this.moto = moto;
	}

	public String getNacionalidad() {
		return this.nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPuntos() {
		return this.puntos;
	}

	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}

}