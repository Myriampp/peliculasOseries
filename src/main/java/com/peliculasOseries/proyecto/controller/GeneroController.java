package com.peliculasOseries.proyecto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.peliculasOseries.proyecto.dto.GeneroDTO;
import com.peliculasOseries.proyecto.service.GeneroService;

@RestController
@RequestMapping("generos")
public class GeneroController {

	@Autowired
	private GeneroService generoService;

	@PostMapping
	public ResponseEntity<GeneroDTO> save(@RequestBody GeneroDTO genero) {

		GeneroDTO generoSaved = generoService.save(genero);

		return ResponseEntity.status(HttpStatus.CREATED).body(generoSaved);
	}

}
