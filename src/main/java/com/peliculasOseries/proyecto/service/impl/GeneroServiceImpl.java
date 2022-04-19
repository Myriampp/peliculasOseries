package com.peliculasOseries.proyecto.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.peliculasOseries.proyecto.dto.GeneroDTO;
import com.peliculasOseries.proyecto.entity.GeneroEntity;
import com.peliculasOseries.proyecto.mapper.GeneroMapper;
import com.peliculasOseries.proyecto.repository.GeneroRepository;
import com.peliculasOseries.proyecto.service.GeneroService;

@Service
public class GeneroServiceImpl implements GeneroService {

	// llamado al mapper
	@Autowired
	private GeneroMapper generoMapper;
	

	// llamado al repositorio para que se lo use al comunicarse a la base de datos
	@Autowired
	private GeneroRepository generoRepository;

	/* datos guardados en forma de entidad */
	public GeneroDTO save(GeneroDTO dto) {
		GeneroEntity entity = generoMapper.generoDTO2Entity(dto);
		GeneroEntity entitySaved = generoRepository.save(entity);
		GeneroDTO result = generoMapper.generoEntity2DTO(entitySaved);
		return result;

	}

}