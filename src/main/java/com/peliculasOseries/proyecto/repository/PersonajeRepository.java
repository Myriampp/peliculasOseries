package com.peliculasOseries.proyecto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.peliculasOseries.proyecto.entity.PersonajeEntity;
@Repository
public interface PersonajeRepository extends JpaRepository<PersonajeEntity, Long>{

}
