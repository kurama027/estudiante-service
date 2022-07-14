package com.helena.servicio.estudiante.service;

import java.util.List;

import com.helena.servicio.estudiante.entity.registro;


public interface registroService {
	public List<registro> findAll();
	public registro findById(Long id);
	public void delete(registro reg);
}
