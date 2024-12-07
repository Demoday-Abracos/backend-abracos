package com.abracos.imigrantes.controller;

import com.abracos.imigrantes.model.Empregar;
import com.abracos.imigrantes.repositories.EmpregarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/empregar")
public class EmpregarControllers {

    @Autowired
    EmpregarRepository empregarRepository;

    @GetMapping
    public List<Empregar> Emprega() {
        return empregarRepository.findAll();
    }
    @PostMapping
    public Empregar empregar(@RequestBody Empregar empregar) {
        return empregarRepository.save(empregar);
    }
    @RequestMapping(value = "/buscar/id/{id}", method = RequestMethod.GET)
    public Optional<Empregar> buscarId(@PathVariable Long id) {
        return empregarRepository.findById(id);
    }
}
