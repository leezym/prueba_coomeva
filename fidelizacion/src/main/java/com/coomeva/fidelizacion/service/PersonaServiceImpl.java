package com.coomeva.fidelizacion.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coomeva.fidelizacion.model.Persona;
import com.coomeva.fidelizacion.repository.PersonaRepository;

@Service
public class PersonaServiceImpl implements PersonaService{
	@Autowired
	private PersonaRepository personaRepository;
	@Override
	public List<Persona> listar() {
		return personaRepository.findAll();
	}

	@Override
	public Persona listarId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Persona add(Persona p) {
		return personaRepository.save(p);
	}

}
