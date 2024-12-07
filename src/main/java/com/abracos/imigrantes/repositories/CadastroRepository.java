package com.abracos.imigrantes.repositories;

import com.abracos.imigrantes.model.Cadastro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CadastroRepository extends JpaRepository<Cadastro, Long> {
    boolean existsByEmailOrTelefone(String email, String telefone);
}
