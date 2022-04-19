package com.peliculasOseries.proyecto.service.impl;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.peliculasOseries.proyecto.dto.GeneroDTO;
import com.peliculasOseries.proyecto.dto.PeliculaOserieDTO;
import com.peliculasOseries.proyecto.dto.PersonajeDTO;
import com.peliculasOseries.proyecto.entity.GeneroEntity;
import com.peliculasOseries.proyecto.entity.PeliculaOserieEntity;
import com.peliculasOseries.proyecto.entity.PersonajeEntity;
import com.peliculasOseries.proyecto.mapper.PeliculaOserieMapper;
import com.peliculasOseries.proyecto.repository.PeliculaOserieRepository;
import com.peliculasOseries.proyecto.service.PeliculaOserieService;

@Service
public class PeliculaOserieServiceImple implements PeliculaOserieService {

	@Autowired
	PeliculaOserieMapper peliculaOserieMapper;

	@Autowired
	PeliculaOserieRepository peliculaOserieRepository;

	public PeliculaOserieDTO save(PeliculaOserieDTO dto) {
		PeliculaOserieEntity entity = peliculaOserieMapper.peliculaOserieDTO2Entity(dto);
		PeliculaOserieEntity entitySaved = peliculaOserieRepository.save(entity);
		PeliculaOserieDTO resultPeli = peliculaOserieMapper.peliculaOserieEntity2DTO(entitySaved);
		return resultPeli;

	}

	public PeliculaOserieEntity save(PeliculaOserieEntity entity) {
		PeliculaOserieDTO dtopeli = peliculaOserieMapper.peliculaOserieEntity2DTO(entity);
		PeliculaOserieDTO dtoSaved = peliculaOserieRepository.save(dtopeli);
		PeliculaOserieEntity resultdtopeli = peliculaOserieMapper.peliculaOserieDTO2Entity(dtoSaved);
		return resultdtopeli;
	}

	@Override
	public List<PeliculaOserieDTO> getAllPeliculaOserie() {
		List<PeliculaOserieEntity> entities = this.peliculaOserieRepository.findAll();
		List<PeliculaOserieDTO> result = this.peliculaOserieMapper.peliculaOserieEntityList2DTOList(entities);
		return result;
	}
	
//me falta terminar 
	@Override
	public List<PersonajeDTO> findPersonajeByPeliculaOserieId(Long PeliculaId) {
	
		return null;
	}

	@Override
	public PeliculaOserieDTO update(Long id, PeliculaOserieDTO peliculaOserie) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PeliculaOserieDTO> getByFilters(String imagen, String Titulo, LocalDate FechaEstreno) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Long id) {
		this.peliculaOserieRepository.deleteById(id);
		
	}

	@Override
	public void removePeliculaOserie(Long id, Long PeliculaId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addPeliculaOserie(Long id, Long PeliculaId) {
		
		
	}



}
