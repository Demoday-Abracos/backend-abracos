package com.abracos.imigrantes.repositories;

import com.abracos.imigrantes.model.Empresas;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpresasRepository extends JpaRepository<Empresas, Long> {
}
