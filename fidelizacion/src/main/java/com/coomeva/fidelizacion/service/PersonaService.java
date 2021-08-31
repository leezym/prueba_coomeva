package com.coomeva.fidelizacion.service;

import java.util.List;

import com.coomeva.fidelizacion.model.Persona;

public interface PersonaService {
	List<Persona>listar();
	Persona listarId(int id);
	Persona add(Persona p);

}
