package com.peliculasOseries.proyecto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.peliculasOseries.proyecto.dto.PeliculaOserieDTO;
import com.peliculasOseries.proyecto.dto.PersonajeDTO;
import com.peliculasOseries.proyecto.service.PersonajeService;

@RestController
@RequestMapping("personajes")
public class PersonajeController {

	
	@Autowired
	private PersonajeService personajeService;
	
	
    @Autowired
	public PersonajeController(PersonajeService personajeService) {
				this.personajeService = personajeService;
	}
	
	@PostMapping("/{personajes}")
	public ResponseEntity<PersonajeDTO> save(@RequestBody PersonajeDTO personaje) {

		PersonajeDTO personajeSaved = personajeService.save(personaje);

		return ResponseEntity.status(HttpStatus.CREATED).body(personajeSaved);
	}
	
	@GetMapping("/all")
	public ResponseEntity<List<PersonajeDTO>>getAll(){
		List<PersonajeDTO> personaje = this.personajeService.getAllPersonaje();
		return ResponseEntity.ok().body(personaje);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<PersonajeDTO> update(@PathVariable Long id, @RequestBody PersonajeDTO personaje){
	PersonajeDTO result = this.personajeService.update(id, personaje);
	return ResponseEntity.ok().body(result);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> addPais(@PathVariable Long id){
		this.personajeService.delete(id);
		return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
				
	}
	
	
}
