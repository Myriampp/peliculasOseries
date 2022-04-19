package com.peliculasOseries.proyecto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.peliculasOseries.proyecto.dto.PeliculaOserieDTO;
import com.peliculasOseries.proyecto.service.PeliculaOserieService;

@RestController
@RequestMapping("peliculasOseries")
public class PeliculasController {

	@Autowired
	private PeliculaOserieService peliculaOserieService;

	@GetMapping("/{all}")
	public ResponseEntity<List<PeliculaOserieDTO>>getAll(){
		List<PeliculaOserieDTO> peliculaOserie= this.peliculaOserieService.getAllPeliculaOserie();
		return ResponseEntity.ok().body(peliculaOserie);
	}
	
	@PostMapping("/{peliculasOseries}")
	public ResponseEntity<PeliculaOserieDTO> save(@RequestBody PeliculaOserieDTO peliculaOserie) {

		PeliculaOserieDTO peliculaSaved = peliculaOserieService.save(peliculaOserie);

		return ResponseEntity.status(HttpStatus.CREATED).body(peliculaSaved);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> delete(@PathVariable Long id){
		this.peliculaOserieService.delete(id);
		return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
		
	}
	
	
	
}
