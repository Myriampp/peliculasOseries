package com.peliculasOseries.proyecto.mapper;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.peliculasOseries.proyecto.dto.PersonajeDTO;
import com.peliculasOseries.proyecto.entity.PersonajeEntity;

@Component
public class PersonajeMapper {

	public PersonajeEntity personajeDTO2Entity(PersonajeDTO dto) {
		PersonajeEntity personajeEntity = new PersonajeEntity();
		personajeEntity.setImagen(dto.getImagen());
		personajeEntity.setNombre(dto.getNombre());
		personajeEntity.setEdad(dto.getEdad());
		personajeEntity.setPeso(dto.getPeso());
		personajeEntity.setHistoria(dto.getHistoria());
		return personajeEntity;
	}

	public PersonajeDTO personajeEntity2DTO(PersonajeEntity entity) {
		PersonajeDTO personajeDTO = new PersonajeDTO();
		personajeDTO.setImagen(entity.getImagen());
		personajeDTO.setNombre(entity.getNombre());
		personajeDTO.setEdad(entity.getEdad());
		personajeDTO.setPeso(entity.getPeso());
		personajeDTO.setHistoria(entity.getHistoria());
		return personajeDTO;
	}

	public List<PersonajeDTO> personajeEntityList2DTOList(List<PersonajeEntity> entities) {
		List<PersonajeDTO> dtos = new ArrayList<>();
		
		for(PersonajeEntity entity : entities) {
			dtos.add(personajeEntity2DTO(entity));
		}
		return dtos;
	
	}
}
