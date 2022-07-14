package com.helena.servicio.estudiante.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.helena.servicio.estudiante.entity.asistencia;
import com.helena.servicio.estudiante.repository.asistenciaRepository;
import com.helena.servicio.estudiante.service.asistenciaService;
@Service
public class asistenciaIpml implements asistenciaService{
	
	@Autowired
	private asistenciaRepository asire;
	
	@Override
	public List<asistencia> findAll() {
		// TODO Auto-generated method stub
		return (List<asistencia>)asire.findAll();
	}

	@Override
	public asistencia findById(Long id) {
		// TODO Auto-generated method stub
		return asire.findById(id).orElse(null);
	}

	@Override
	public void delete(asistencia asis) {
		// TODO Auto-generated method stub
		asire.delete(asis);
	}

}
