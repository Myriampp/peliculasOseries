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
	private String imagen;
	private String nombre;
	
	//los get y set no me los reconocia desde el Mapper por eso los terminé declarando
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getImagen() {
		return imagen;
	}
	public void setImagen(String imagen) {
		this.imagen = imagen;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	
	
	
	
}
