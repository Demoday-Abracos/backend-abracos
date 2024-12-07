package com.abracos.imigrantes.controller;


import com.abracos.imigrantes.model.Consulta;
import com.abracos.imigrantes.repositories.ConsultaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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
    @RequestMapping(value = "/buscar/id/{id}", method = RequestMethod.GET)
    public Optional<Consulta> searchById(@PathVariable Long id){
        return consultaRepository.findById(id);
    }

    @DeleteMapping(value = "/deletar/{id}", produces = "aplication/json")
    public String deletar(@PathVariable Long id){
        Optional<Consulta> consulta = consultaRepository.findById(id);
        if(consulta.isPresent()){
            consultaRepository.delete(consulta.get());
            return "Consulta deletada com sucesso!";
        }else {
            return "{error: Registro não encontrado}";
        }
    }
}
