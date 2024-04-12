package com.example.solucion.service;

import java.util.List; 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
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
    
    public List<Futbolista> getAllFutbolistas(int page, int size) {
    	Pageable pageable = PageRequest.of(page, size);
        return futbolistaRepository.findAll(pageable).getContent();
    }

    public Futbolista getFutbolistaById(Long id) {
        return futbolistaRepository.findById(id).orElse(null);
    }
    
}