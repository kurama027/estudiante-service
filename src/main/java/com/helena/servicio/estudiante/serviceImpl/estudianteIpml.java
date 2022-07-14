package com.helena.servicio.estudiante.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.helena.servicio.estudiante.entity.estudiante;
import com.helena.servicio.estudiante.repository.estudianteRepository;
import com.helena.servicio.estudiante.service.estudianteService;
@Service
public class estudianteIpml implements estudianteService{
	@Autowired
	private estudianteRepository estu;
	
	
	@Override
	public List<estudiante> findAll() {
		// TODO Auto-generated method stub
		return (List<estudiante>)estu.findAll();
	}

	@Override
	public estudiante findById(Long id) {
		// TODO Auto-generated method stub
		return estu.findById(id).orElse(null);
	}

	@Override
	public void delete(estudiante est) {
		// TODO Auto-generated method stub
		estu.delete(est);
	}

}
