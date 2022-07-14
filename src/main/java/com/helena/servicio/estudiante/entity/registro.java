package com.helena.servicio.estudiante.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tmv_registro")
public class registro {
	@Id
	//auto incremental
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_REGISTRO")
	private long ID_REGISTRO;
	@Column(name = "ID_BENEFICIARIO")
	private long ID_BENEFICAIRIO;
	@Column(name = "ID_DELEGADO")
	private long ID_DELEGADO;
	@Column(name = "ID_RECURSO")
	private long ID_RECURSO;
	@Column(name = "URL_IMAGEN")
	private String ID_IMAGEN;
	public long getID_REGISTRO() {
		return ID_REGISTRO;
	}
	public void setID_REGISTRO(long iD_REGISTRO) {
		ID_REGISTRO = iD_REGISTRO;
	}
	public long getID_BENEFICAIRIO() {
		return ID_BENEFICAIRIO;
	}
	public void setID_BENEFICAIRIO(long iD_BENEFICAIRIO) {
		ID_BENEFICAIRIO = iD_BENEFICAIRIO;
	}
	public long getID_DELEGADO() {
		return ID_DELEGADO;
	}
	public void setID_DELEGADO(long iD_DELEGADO) {
		ID_DELEGADO = iD_DELEGADO;
	}
	public long getID_RECURSO() {
		return ID_RECURSO;
	}
	public void setID_RECURSO(long iD_RECURSO) {
		ID_RECURSO = iD_RECURSO;
	}
	public String getID_IMAGEN() {
		return ID_IMAGEN;
	}
	public void setID_IMAGEN(String iD_IMAGEN) {
		ID_IMAGEN = iD_IMAGEN;
	}
	
	
}
