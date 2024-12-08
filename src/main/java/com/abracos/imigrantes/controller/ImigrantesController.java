package com.abracos.imigrantes.controller;

import com.abracos.imigrantes.model.Imigrantes;
import com.abracos.imigrantes.repositories.ImigranteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
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
    public Optional<Imigrantes> searchById(@PathVariable Long id) {
        return dbConnection.findById(id);
    }

    @DeleteMapping(value = "/deletar/{id}", produces = "application/json")
    public String delete(@PathVariable Long id) {
        Optional<Imigrantes> imigranteOptional = dbConnection.findById(id);
        if (imigranteOptional.isPresent()) {
            dbConnection.delete(imigranteOptional.get());
            return "{deleted:" + id + "}";
        } else {
            return "{error: Registro não encontrado}";
        }
    }

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody Map<String, String> loginRequest) {
        String email = loginRequest.get("email");
        String password = loginRequest.get("password");

        // Verificar se o email e a senha estão presentes
        if (email == null || password == null) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Email ou senha ausente");
        }

        // Buscar o usuário pelo email
        Imigrantes imigrante = dbConnection.findByEmailImigrante(email); // Nome correto do método

        // Verificar se o usuário foi encontrado
        if (imigrante == null) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Usuário não encontrado");
        }

        // Verificar se a senha está correta
        if (!imigrante.getSenha_imigrante().equals(password)) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Senha incorreta");
        }

        // Remover a senha antes de retornar os dados
        imigrante.setSenha_imigrante(null);
        return ResponseEntity.ok(imigrante);
    }






}