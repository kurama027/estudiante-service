package com.helena.servicio.estudiante.controller;

import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.helena.servicio.estudiante.entity.registro;
import com.helena.servicio.estudiante.service.registroService;



@RestController
public class registroController {
	@Autowired
	private registroService regiser; 
	
	@GetMapping("/listar-registro")
	public ResponseEntity<?> findAll(HttpServletRequest request) {
        HashMap<String, Object> result = new HashMap<>();
        result.put("success", true);
        result.put("message", "Consulta correcta.");
        result.put("data", regiser.findAll());
        return new ResponseEntity<>(result, HttpStatus.OK);
	}
	
	@GetMapping("/ver-registro/{id}")
	public registro detalle(@PathVariable Long id) { 
		return regiser.findById(id);
	}

	@DeleteMapping("/eliminar-registro/{ID_REGISTRO}")
    public ResponseEntity<?> delete(@PathVariable(value = "ID_REGISTRO") Long ID_REGISTRO, HttpServletRequest request) {
        HashMap<String, Object> result = new HashMap<>();
        registro data = regiser.findById(ID_REGISTRO);
        if (data == null) {
            result.put("success", false);
            result.put("message", "No existe registro con id: " + ID_REGISTRO);
            return new ResponseEntity<>(result, HttpStatus.NOT_FOUND);
        }
        try {
            regiser.delete(data);
            result.put("success", true);
            result.put("message", "Se ha eliminado los datos del registro.");
            result.put("data", data);
            return new ResponseEntity<>(result, HttpStatus.OK);
        } catch (Exception ex) {
            return new ResponseEntity<>(new Exception(ex.getMessage()), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
