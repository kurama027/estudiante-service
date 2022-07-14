package com.helena.servicio.estudiante.service;

import java.util.List;

import com.helena.servicio.estudiante.entity.estudiante;


public interface estudianteService {
	public List<estudiante> findAll();
	public estudiante findById(Long id);
	public void delete(estudiante est);

}
