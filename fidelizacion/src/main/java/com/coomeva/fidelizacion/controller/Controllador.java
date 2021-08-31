package com.coomeva.fidelizacion.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coomeva.fidelizacion.model.Persona;
import com.coomeva.fidelizacion.service.PersonaService;

@CrossOrigin(origins = "http://localhost:4200", maxAge=3600)
@RestController
@RequestMapping({"/personas"})
public class Controllador {
	@Autowired
	PersonaService service;
	
	@GetMapping
	public List<Persona>listar(){
		return service.listar();
	}
	
	@PostMapping
	public Persona agregar(@RequestBody Persona p) {
		return service.add(p);
		
	}
}
