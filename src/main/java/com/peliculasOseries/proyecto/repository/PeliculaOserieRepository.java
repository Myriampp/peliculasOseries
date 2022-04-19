package com.peliculasOseries.proyecto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.peliculasOseries.proyecto.dto.PeliculaOserieDTO;
import com.peliculasOseries.proyecto.entity.PeliculaOserieEntity;
@Repository
public interface PeliculaOserieRepository extends JpaRepository<PeliculaOserieEntity, Long> {

	PeliculaOserieDTO save(PeliculaOserieDTO dtopeli);

}
