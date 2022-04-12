package com.peliculasOseries.proyecto.entity;

import java.util.*;

import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "personajes")
@Getter
@Setter
public class PersonajeEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;
	private String imagen;
	private String nombre;
	private Long edad;
	private Long peso;
	private String historia;
	
	@ManyToMany(mappedBy ="personajes")
	private List<PeliculaOserieEntity> peliculasOseries = new ArrayList<>();
	
	
	
}
