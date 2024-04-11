package com.example.solucion.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.solucion.model.Futbolista;

public interface FutbolistaRepository extends JpaRepository<Futbolista, Long> {
}
