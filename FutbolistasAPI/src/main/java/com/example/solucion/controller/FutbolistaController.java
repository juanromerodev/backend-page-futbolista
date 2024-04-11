package com.example.solucion.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.solucion.model.Futbolista;
import com.example.solucion.service.FutbolistaService;

@RestController
@RequestMapping("/futbolistas")
public class FutbolistaController {
    @Autowired
    private FutbolistaService futbolistaService;

    @GetMapping
    public List<Futbolista> getAllFutbolistas() {
        return futbolistaService.getAllFutbolistas();
    }

    @GetMapping("/{id}")
    public Futbolista getFutbolistaById(@PathVariable Long id) {
        return futbolistaService.getFutbolistaById(id);
    }
}