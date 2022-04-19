package com.peliculasOseries.proyecto.mapper;

import java.util.List;

import org.springframework.stereotype.Component;

import com.peliculasOseries.proyecto.dto.GeneroDTO;
import com.peliculasOseries.proyecto.entity.GeneroEntity;

@Component
public class GeneroMapper {

	public GeneroEntity generoDTO2Entity(GeneroDTO dto) {
		GeneroEntity generoEntity = new GeneroEntity();
		generoEntity.setImagen(dto.getImagen());
		generoEntity.setNombre(dto.getNombre());
		return generoEntity;
		
	}

	public GeneroDTO generoEntity2DTO(GeneroEntity entity) {
	 GeneroDTO dto = new GeneroDTO();
	 dto.setId(entity.getId());
	 dto.setImagen(entity.getImagen());
	 dto.setNombre(entity.getNombre());
		return dto;
	}

	public List<GeneroDTO> generoEntityList2DTOList(List<GeneroEntity> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	

	

}
