package com.peliculasOseries.proyecto.dto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class GeneroDTO {

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

public GeneroDTO() {
	super();
	
}
public GeneroDTO(String imagen, String nombre) {
	super();
	this.imagen = imagen;
	this.nombre = nombre;
}
public GeneroDTO(Long id, String imagen, String nombre) {
	super();
	this.id = id;
	this.imagen = imagen;
	this.nombre = nombre;
}

  
  
  
  
  }