package com.abracos.imigrantes.controller;


import com.abracos.imigrantes.model.Consulta;
import com.abracos.imigrantes.repositories.ConsultaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/consulta")
public class ConsultaControllers {

    @Autowired
    ConsultaRepository consultaRepository;

    @GetMapping
    public List<Consulta> consulta(){
        return consultaRepository.findAll();
    }
    @PostMapping
    public Consulta consulta(@RequestBody Consulta consulta){
        return consultaRepository.save(consulta);
    }
}
