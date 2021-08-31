package com.coomeva.fidelizacion.repository;

import java.util.List;

import org.springframework.data.repository.Repository;

import com.coomeva.fidelizacion.model.Persona;

public interface PersonaRepository extends Repository<Persona, Integer>{
	List<Persona>findAll();
	Persona findOne(int id);
	Persona save(Persona p);
}
