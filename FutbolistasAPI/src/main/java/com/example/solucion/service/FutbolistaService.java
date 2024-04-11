package com.example.solucion.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.solucion.model.Futbolista;
import com.example.solucion.repository.FutbolistaRepository;

@Service
public class FutbolistaService {
    @Autowired
    private FutbolistaRepository futbolistaRepository;

    public List<Futbolista> getAllFutbolistas() {
        return futbolistaRepository.findAll();
    }

    public Futbolista getFutbolistaById(Long id) {
        return futbolistaRepository.findById(id).orElse(null);
    }
}