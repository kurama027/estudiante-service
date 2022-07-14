package com.helena.servicio.estudiante.service;

import java.util.List;

import com.helena.servicio.estudiante.entity.asistencia;


public interface asistenciaService {
	public List<asistencia> findAll();
	public asistencia findById(Long id);
	public void delete(asistencia asis);

}
