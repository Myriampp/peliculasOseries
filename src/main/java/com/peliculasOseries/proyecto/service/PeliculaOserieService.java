package com.peliculasOseries.proyecto.service;

import java.time.LocalDate;
import java.util.List;

import com.peliculasOseries.proyecto.dto.PeliculaOserieDTO;
import com.peliculasOseries.proyecto.dto.PersonajeDTO;

public interface PeliculaOserieService {

	PeliculaOserieDTO save(PeliculaOserieDTO peliculaOserie);
	
	PeliculaOserieDTO update(Long id, PeliculaOserieDTO peliculaOserie);
	
	List<PeliculaOserieDTO> getAllPeliculaOserie();
    
	List<PersonajeDTO> findPersonajeByPeliculaOserieId( Long PeliculaId);
	
	List<PeliculaOserieDTO> getByFilters(String imagen, String Titulo, LocalDate FechaEstreno );

	void delete(Long id);
	
	void removePeliculaOserie(Long id,  Long PeliculaId);
	
	void addPeliculaOserie(Long id, Long PeliculaId);
	
 }
