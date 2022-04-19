package com.peliculasOseries.proyecto.service;

import java.util.List;

import com.peliculasOseries.proyecto.dto.PeliculaOserieDTO;
import com.peliculasOseries.proyecto.dto.PersonajeDTO;

public interface PersonajeService {
	
	PersonajeDTO save(PersonajeDTO Personaje);
	PersonajeDTO delete(Long id);
	PersonajeDTO addPersonaje(Long id, Long PersonajeId);
	PersonajeDTO update(Long id, PersonajeDTO personaje);
	List<PersonajeDTO> getAllPersonaje();

    List<PeliculaOserieDTO> findByPersonajeId(Long PersonajeId);
	
    
    
}
