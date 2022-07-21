package com.helena.servicio.estudiante.controller;

import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


import com.helena.servicio.estudiante.entity.estudiante;
import com.helena.servicio.estudiante.service.estudianteService;


@CrossOrigin(origins = { "https://quintahelena.azurewebsites.net" })
@RestController
public class estudiantecontroller {
	@Autowired
	private estudianteService estuser; 
	
	@GetMapping("/listar-estudiante")
	public ResponseEntity<?> findAll(HttpServletRequest request) {
        HashMap<String, Object> result = new HashMap<>();
        result.put("success", true);
        result.put("message", "Consulta correcta.");
        result.put("data", estuser.findAll());
        return new ResponseEntity<>(result, HttpStatus.OK);	
	}
	
	@GetMapping("/ver-estudiante/{id}")
	public estudiante detalle(@PathVariable Long id) { 
		return estuser.findById(id);
	}

	@DeleteMapping("/eliminar-estudiante/{ID_ESTUDIANTE}")
    public ResponseEntity<?> delete(@PathVariable(value = "ID_ESTUDIANTE") Long ID_ESTUDIANTE, HttpServletRequest request) {
        HashMap<String, Object> result = new HashMap<>();
        estudiante data = estuser.findById(ID_ESTUDIANTE);
        if (data == null) {
            result.put("success", false);
            result.put("message", "No existe registro con id: " + ID_ESTUDIANTE);
            return new ResponseEntity<>(result, HttpStatus.NOT_FOUND);
        }
        try {
            estuser.delete(data);
            result.put("success", true);
            result.put("message", "Se ha eliminado los datos del registro.");
            result.put("data", data);
            return new ResponseEntity<>(result, HttpStatus.OK);
        } catch (Exception ex) {
            return new ResponseEntity<>(new Exception(ex.getMessage()), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
