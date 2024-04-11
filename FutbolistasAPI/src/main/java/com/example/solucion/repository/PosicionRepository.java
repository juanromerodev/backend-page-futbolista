package com.example.solucion.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.solucion.model.Posicion;

public interface PosicionRepository extends JpaRepository<Posicion, Long> {
	
}