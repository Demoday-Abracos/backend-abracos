package com.abracos.imigrantes.controller;

import com.abracos.imigrantes.model.Imigrantes;
import com.abracos.imigrantes.repositories.ImigranteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/imigrantes")
public class ImigrantesController {

    @Autowired
    ImigranteRepository dbConnection;

    @GetMapping
    public List<Imigrantes> findAllRecords() {
        return dbConnection.findAll();
    }

    @PostMapping(value = "/inserir", produces = "application/json")
    public Imigrantes create(@RequestBody Imigrantes exemplo) {
        dbConnection.save(exemplo);
        return exemplo;
    }

    @RequestMapping(value = "/buscar/id/{id}", method = RequestMethod.GET)
    public Optional<Imigrantes> searchById(@PathVariable int id) {
        return dbConnection.findById(id);
    }

    @DeleteMapping(value = "/deletar/{id}", produces = "application/json")
    public String delete(@PathVariable int id) {
        Optional<Imigrantes> imigranteOptional = dbConnection.findById(id);
        if (imigranteOptional.isPresent()) {
            dbConnection.delete(imigranteOptional.get());
            return "{deleted:" + id + "}";
        } else {
            return "{error: Registro não encontrado}";
        }
    }

}