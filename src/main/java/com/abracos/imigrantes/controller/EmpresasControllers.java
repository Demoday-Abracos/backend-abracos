package com.abracos.imigrantes.controller;


import com.abracos.imigrantes.model.Empregar;
import com.abracos.imigrantes.repositories.EmpregarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/empresas")
public class EmpresasControllers {

    @Autowired
    EmpregarRepository empregarRepository;

    @PostMapping
    public Empregar empregar(@RequestBody Empregar empregar) {
        return empregarRepository.save(empregar);
    }
    @GetMapping
    public List<Empregar> empregar() {
        return empregarRepository.findAll();
    }
}
