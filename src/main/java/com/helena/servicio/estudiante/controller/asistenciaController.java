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
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.helena.servicio.estudiante.entity.asistencia;
import com.helena.servicio.estudiante.service.asistenciaService;
import com.helena.servicio.proyecto.entity.Pregunta;

@CrossOrigin(origins = { "https://quintahelena.azurewebsites.net" })
@RestController
public class asistenciaController {
	@Autowired
	private asistenciaService asiser; 
	
	@GetMapping("/listar-asistencia")
	public ResponseEntity<?> findAll(HttpServletRequest request) {
        HashMap<String, Object> result = new HashMap<>();
        result.put("success", true);
        result.put("message", "Consulta correcta.");
        result.put("data", asiser.findAll());
        return new ResponseEntity<>(result, HttpStatus.OK);
	}
	
	@GetMapping("/ver-asistencia/{id}")
	public asistencia detalle(@PathVariable Long id) { 
		return asiser.findById(id);
	}
	
	@PostMapping("/crear-asistencia")
    public ResponseEntity<?> save(@RequestBody asistencia asis, HttpServletRequest request) {
        HashMap<String, Object> result = new HashMap<>();
        asistencia data = asiser.save(asis);

        result.put("success", true);
        result.put("message", "Registro creado correctamente.");
        result.put("data", data);
        return new ResponseEntity<>(result, HttpStatus.OK);
    } 
	
	@PutMapping("/actualiza-asistencia/{id}")
    public ResponseEntity<?> update(@RequestBody asistencia asis, HttpServletRequest request) {
        HashMap<String, Object> result = new HashMap<>();
        asistencia data = asiser.findById(asis.getID_REG_ASISTENCIA());
        if (data == null) {
            result.put("success", false);
            result.put("message", "No existe Pregunta con Id: " + asis.getID_REG_ASISTENCIA());
            return new ResponseEntity<>(result, HttpStatus.NOT_FOUND);
        }
        try {
            asiser.save(asis);
            result.put("success", true);
            result.put("message", "Se ha actualizado los datos de la Pregunta.");
            result.put("data",asis);
            return new ResponseEntity<>(result, HttpStatus.OK);
        } catch (Exception ex) {
            return new ResponseEntity<>(new Exception(ex.getMessage()), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }  

	@DeleteMapping("/eliminar-asistencia/{ID_REG_ASISTENCIA}")
    public ResponseEntity<?> delete(@PathVariable(value = "ID_REG_ASISTENCIA") Long ID_REG_ASISTENCIA, HttpServletRequest request) {
        HashMap<String, Object> result = new HashMap<>();
        asistencia data = asiser.findById(ID_REG_ASISTENCIA);
        if (data == null) {
            result.put("success", false);
            result.put("message", "No existe registro con id: " + ID_REG_ASISTENCIA);
            return new ResponseEntity<>(result, HttpStatus.NOT_FOUND);
        }
        try {
            asiser.delete(data);
            result.put("success", true);
            result.put("message", "Se ha eliminado los datos del registro.");
            result.put("data", data);
            return new ResponseEntity<>(result, HttpStatus.OK);
        } catch (Exception ex) {
            return new ResponseEntity<>(new Exception(ex.getMessage()), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


}
