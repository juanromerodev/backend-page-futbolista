package com.example.solucion.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.solucion.model.Futbolista;
import com.example.solucion.service.FutbolistaService;

@RestController
@RequestMapping("/futbolistas")
@CrossOrigin(origins = "http://localhost:3000")
public class FutbolistaController {
    @Autowired
    private FutbolistaService futbolistaService;

    @GetMapping
    public List<Futbolista> getAllFutbolistas() {
        return futbolistaService.getAllFutbolistas();
    }
    
    @GetMapping(params = {"page", "size"})
    public List<Futbolista> getAllFutbolistasPaginated(
            @RequestParam("page") int page,
            @RequestParam("size") int size) {
        return futbolistaService.getAllFutbolistas(page, size);
    }

    @GetMapping("/{id}")
    public Futbolista getFutbolistaById(@PathVariable Long id) {
        return futbolistaService.getFutbolistaById(id);
    }
}