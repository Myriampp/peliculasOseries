package com.peliculasOseries.proyecto.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PersonajeBasicDTO {

	private Long id;
	private String imagen;
	private String nombre;
	private Long edad;
	private Long peso;
	private String historia;
}
