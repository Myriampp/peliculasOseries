package com.peliculasOseries.proyecto.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.peliculasOseries.proyecto.dto.PeliculaOserieDTO;
import com.peliculasOseries.proyecto.dto.PersonajeDTO;
import com.peliculasOseries.proyecto.entity.PersonajeEntity;
import com.peliculasOseries.proyecto.mapper.PersonajeMapper;
import com.peliculasOseries.proyecto.repository.PersonajeRepository;
import com.peliculasOseries.proyecto.service.PersonajeService;

@Service
public class PersonajeServiceImpl implements PersonajeService{

	@Autowired
	private PersonajeMapper personajeMapper;
	
	@Autowired
	private PersonajeRepository personajeRepository;
	
	@Override
	public PersonajeDTO save(PersonajeDTO dto) {
		PersonajeEntity entity = personajeMapper.personajeDTO2Entity(dto);
		PersonajeEntity entitySaved = personajeRepository.save(entity);
		PersonajeDTO resultPers = personajeMapper.personajeEntity2DTO(entitySaved);
		
		return resultPers;
	}


	@Override
	public List<PersonajeDTO> getAllPersonaje() {
		List<PersonajeEntity> entities = this.personajeRepository.findAll();
		List<PersonajeDTO> result = this.personajeMapper.personajeEntityList2DTOList(entities);
		return result;
	}

// me falta implementar 
	@Override
	public List<PeliculaOserieDTO> findByPersonajeId(Long PersonajeId) {
		
		return null;
	}


	@Override
	public PersonajeDTO delete(Long id) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public PersonajeDTO addPersonaje(Long id, Long PersonajeId) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public PersonajeDTO update(Long id, PersonajeDTO personaje) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
