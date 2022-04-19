package com.peliculasOseries.proyecto.mapper;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.peliculasOseries.proyecto.dto.GeneroDTO;
import com.peliculasOseries.proyecto.dto.PeliculaOserieDTO;
import com.peliculasOseries.proyecto.entity.GeneroEntity;
import com.peliculasOseries.proyecto.entity.PeliculaOserieEntity;

@Component
public class PeliculaOserieMapper {

	public PeliculaOserieEntity peliculaOserieDTO2Entity(PeliculaOserieDTO dto) {
		PeliculaOserieEntity peliculaOserieEntity = new PeliculaOserieEntity();
		peliculaOserieEntity.setImagen(dto.getImagen());
		peliculaOserieEntity.setTitulo(dto.getTitulo());
		peliculaOserieEntity.setFechaEstreno(dto.getFechaEstreno());
		peliculaOserieEntity.setCalificacion(dto.getCalificacion());
		return peliculaOserieEntity;
	}

	public PeliculaOserieDTO peliculaOserieEntity2DTO(PeliculaOserieEntity entity) {
		PeliculaOserieDTO dto = new PeliculaOserieDTO();
		dto.setId(entity.getId());
		dto.setImagen(entity.getImagen());
		dto.setTitulo(entity.getTitulo());
		dto.setFechaEstreno(entity.getFechaEstreno());
		dto.setCalificacion(entity.getCalificacion());
		return dto;

	}

	public List<PeliculaOserieDTO> peliculaOserieEntityList2DTOList(List<PeliculaOserieEntity> entities) {
	List<PeliculaOserieDTO> dtos = new ArrayList<>();
	
	for (PeliculaOserieEntity entity : entities) {
		dtos.add(this.peliculaOserieEntity2DTO(entity));
	}
		return dtos;
	}
}