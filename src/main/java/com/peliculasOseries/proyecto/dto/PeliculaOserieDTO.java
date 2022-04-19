package com.peliculasOseries.proyecto.dto;
import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PeliculaOserieDTO {

  private Long id;
  private String imagen;
  private String titulo;
  private LocalDate fechaEstreno;
  private Long calificacion;
  
 
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

public PeliculaOserieDTO(Long id, String imagen, String titulo, LocalDate fechaEstreno, Long calificacion) {
	super();
	this.id = id;
	this.imagen = imagen;
	this.titulo = titulo;
	this.fechaEstreno = fechaEstreno;
	this.calificacion = calificacion;
}
public PeliculaOserieDTO() {
	super();
	// TODO Auto-generated constructor stub
}


}