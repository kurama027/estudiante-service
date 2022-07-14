package com.helena.servicio.estudiante.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "tmv_reg_asistencia")
public class asistencia {
	@Id
	//auto incremental
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_REG_ASISTENCIA")
	private long ID_REG_ASISTENCIA;
	@Column(name = "VA_ESTUDIANTE")
	private String VA_ESTUDIANTE;
	@Temporal(TemporalType.TIME)
	@Column(name = "FE_REGISTRO")
	private Date FE_REGISTRO;  
	@ManyToOne()
	@JoinColumn(name = "ID_ESTU_ASIS")
	private registro register;
	@ManyToOne()
	@JoinColumn(name = "ID_REG_ASIS")
	private estudiante est;
	public long getID_REG_ASISTENCIA() {
		return ID_REG_ASISTENCIA;
	}
	public void setID_REG_ASISTENCIA(long iD_REG_ASISTENCIA) {
		ID_REG_ASISTENCIA = iD_REG_ASISTENCIA;
	}
	public String getVA_ESTUDIANTE() {
		return VA_ESTUDIANTE;
	}
	public void setVA_ESTUDIANTE(String vA_ESTUDIANTE) {
		VA_ESTUDIANTE = vA_ESTUDIANTE;
	}
	public Date getFE_REGISTRO() {
		return FE_REGISTRO;
	}
	public void setFE_REGISTRO(Date fE_REGISTRO) {
		FE_REGISTRO = fE_REGISTRO;
	}
	public registro getRegister() {
		return register;
	}
	public void setRegister(registro register) {
		this.register = register;
	}
	public estudiante getEst() {
		return est;
	}
	public void setEst(estudiante est) {
		this.est = est;
	} 
	
	
}
