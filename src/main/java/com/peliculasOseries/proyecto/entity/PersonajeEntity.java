package com.peliculasOseries.proyecto.entity;

import java.util.*;

import javax.persistence.*;

import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "personajes")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@SQLDelete( sql="UPDATE icon SET deleted = true WHERE id=?")
@Where(clause = "deleted = false")
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
	
	private boolean deleted = Boolean.FALSE;
	
	
	
// no sé por qué razón el mapper no me toma los get y set 
	
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

	public Long getEdad() {
		return edad;
	}

	public void setEdad(Long edad) {
		this.edad = edad;
	}

	public Long getPeso() {
		return peso;
	}

	public void setPeso(Long peso) {
		this.peso = peso;
	}

	public String getHistoria() {
		return historia;
	}

	public void setHistoria(String historia) {
		this.historia = historia;
	}

	public List<PeliculaOserieEntity> getPeliculasOseries() {
		return peliculasOseries;
	}

	public void setPeliculasOseries(List<PeliculaOserieEntity> peliculasOseries) {
		this.peliculasOseries = peliculasOseries;
	}

	public PersonajeEntity(Long id, String imagen, String nombre, Long edad, Long peso, String historia,
			List<PeliculaOserieEntity> peliculasOseries) {
		super();
		this.id = id;
		this.imagen = imagen;
		this.nombre = nombre;
		this.edad = edad;
		this.peso = peso;
		this.historia = historia;
		this.peliculasOseries = peliculasOseries;
	}

	public PersonajeEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}
