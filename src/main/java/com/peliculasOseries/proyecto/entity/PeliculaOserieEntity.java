package com.peliculasOseries.proyecto.entity;

import java.time.LocalDate;
import java.util.*;

import javax.persistence.*;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.*;

@Entity
@Table(name = "peliculasOseries")
@Getter
@Setter
public class PeliculaOserieEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;
	private String imagen;
	private Long titulo;
	@Column(name = "fecha_estreno")
	@DateTimeFormat(pattern = "yyyy/MM/dd")
	private LocalDate fechaEstreno;
	private Long calificacion;
	
	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
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
}