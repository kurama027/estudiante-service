package com.helena.servicio.estudiante.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tma_estudiante")
public class estudiante {
	@Id
	//auto incremental
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_ESTUDIANTE")
	private long ID_ESTUDIANTE; 
	@Column(name = "ID_PERSONA")
	private long ID_PERSONA;  
	@Column(name = "ID_GRUPO")
	private long ID_GRUPO;
	@Column(name = "ID_FACULTAD")
	private long ID_FACULTAD;
	@Column(name = "ID_TALLER")
	private long ID_TALLER; 
	@Column(name = "ID_CICLO")
	private long ID_CICLO;
	@Column(name = "ES_ESTUDIANTE")
	private String ES_ESTUDIANTE;
	@Column(name = "IS_DELEGADO")
	private String IS_DELEGADO;
	@Column(name = "CO_ESTUDIANTE")
	private String CO_ESTUDIANTE;
	
	public long getID_ESTUDIANTE() {
		return ID_ESTUDIANTE;
	}
	public void setID_ESTUDIANTE(long iD_ESTUDIANTE) {
		ID_ESTUDIANTE = iD_ESTUDIANTE;
	}
	public long getID_PERSONA() {
		return ID_PERSONA;
	}
	public void setID_PERSONA(long iD_PERSONA) {
		ID_PERSONA = iD_PERSONA;
	}
	public long getID_GRUPO() {
		return ID_GRUPO;
	}
	public void setID_GRUPO(long iD_GRUPO) {
		ID_GRUPO = iD_GRUPO;
	}
	public long getID_FACULTAD() {
		return ID_FACULTAD;
	}
	public void setID_FACULTAD(long iD_FACULTAD) {
		ID_FACULTAD = iD_FACULTAD;
	}
	public long getID_TALLER() {
		return ID_TALLER;
	}
	public void setID_TALLER(long iD_TALLER) {
		ID_TALLER = iD_TALLER;
	}
	public long getID_CICLO() {
		return ID_CICLO;
	}
	public void setID_CICLO(long iD_CICLO) {
		ID_CICLO = iD_CICLO;
	}
	public String getES_ESTUDIANTE() {
		return ES_ESTUDIANTE;
	}
	public void setES_ESTUDIANTE(String eS_ESTUDIANTE) {
		ES_ESTUDIANTE = eS_ESTUDIANTE;
	}
	public String getIS_DELEGADO() {
		return IS_DELEGADO;
	}
	public void setIS_DELEGADO(String iS_DELEGADO) {
		IS_DELEGADO = iS_DELEGADO;
	}
	public String getCO_ESTUDIANTE() {
		return CO_ESTUDIANTE;
	}
	public void setCO_ESTUDIANTE(String cO_ESTUDIANTE) {
		CO_ESTUDIANTE = cO_ESTUDIANTE;
	}
	
}
