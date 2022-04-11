package com.peliculasOseries.proyecto.entity;

import javax.persistence.*;

import lombok.*;

@Entity
@Table(name = "genero")
@Getter
@Setter

public class GeneroEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;
	private Long nombre;
	
}
