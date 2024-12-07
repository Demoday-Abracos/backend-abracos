package com.abracos.imigrantes.repositories;

import com.abracos.imigrantes.model.Consulta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConsultaRepository extends JpaRepository<Consulta, Long> {
}
