package com.helena.servicio.estudiante.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.helena.servicio.estudiante.entity.registro;
import com.helena.servicio.estudiante.repository.registroRepository;
import com.helena.servicio.estudiante.service.registroService;

@Service
public class registroIpml implements registroService{

	@Autowired
	private registroRepository regir;
	
	@Override
	public List<registro> findAll() {
		// TODO Auto-generated method stub
		return (List<registro>)regir.findAll();
	}

	@Override
	public registro findById(Long id) {
		// TODO Auto-generated method stub
		return regir.findById(id).orElse(null);
	}

	@Override
	public void delete(registro reg) {
		// TODO Auto-generated method stub
		regir.delete(reg);
	}

}
