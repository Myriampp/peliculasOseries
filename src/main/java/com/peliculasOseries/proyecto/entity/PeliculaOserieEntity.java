package com.peliculasOseries.proyecto.entity;

import java.time.LocalDate;
import java.util.*;

import javax.persistence.*;

import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;
import org.springframework.format.annotation.DateTimeFormat;

import lombok.*;

@Entity
@Table(name = "peliculasOseries")
@Getter
@Setter
@SQLDelete( sql="UPDATE icon SET deleted = true WHERE id=?")
@Where(clause = "deleted = false")
public class PeliculaOserieEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;
	private String imagen;
	private String titulo;
	@Column(name = "fecha_estreno")
	@DateTimeFormat(pattern = "yyyy/MM/dd")
	private LocalDate fechaEstreno;
	private Long calificacion;
	private boolean deleted = Boolean.FALSE;
	
	@ManyToOne
	@JoinColumn(name = "genero_id", insertable = false, updatable = false )
	private GeneroEntity genero;

	@Column(name = "genero_id", nullable = false)
	private Long generoId;
	
	
	@ManyToMany(
			cascade = {
					CascadeType.PERSIST,
					CascadeType.MERGE
				
			})
	
	@JoinTable(
			name = "PeliculaOSerieAsociada",
            joinColumns = @JoinColumn( name = "peliculasOseries_id"),
		    inverseJoinColumns = @JoinColumn(name="personajes_id"))
	private Set<PersonajeEntity> personajes = new HashSet<>();


	@Override
	public int hashCode() {
		return Objects.hash(id);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PeliculaOserieEntity other = (PeliculaOserieEntity) obj;
		return Objects.equals(id, other.id);
	}


	

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


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public LocalDate getFechaEstreno() {
		return fechaEstreno;
	}


	public void setFechaEstreno(LocalDate fechaEstreno) {
		this.fechaEstreno = fechaEstreno;
	}


	public Long getCalificacion() {
		return calificacion;
	}


	public void setCalificacion(Long calificacion) {
		this.calificacion = calificacion;
	}


	public GeneroEntity getGenero() {
		return genero;
	}


	public void setGenero(GeneroEntity genero) {
		this.genero = genero;
	}


	public Long getGeneroId() {
		return generoId;
	}


	public void setGeneroId(Long generoId) {
		this.generoId = generoId;
	}


	public Set<PersonajeEntity> getPersonajes() {
		return personajes;
	}


	public void setPersonajes(Set<PersonajeEntity> personajes) {
		this.personajes = personajes;
	}
	
	
	

}