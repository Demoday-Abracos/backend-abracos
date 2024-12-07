package com.abracos.imigrantes.controller;

import com.abracos.imigrantes.model.Cadastro;
import com.abracos.imigrantes.repositories.CadastroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cadastro")
public class CadastroControllers {

    @Autowired
    private CadastroRepository cadastroRepository;

    @PostMapping
    public Cadastro cadastrar(@RequestBody Cadastro cadastro) {
        return cadastroRepository.save(cadastro);

    }
    @GetMapping
    public List<Cadastro> cadastro() {
        return cadastroRepository.findAll();
    }
}
