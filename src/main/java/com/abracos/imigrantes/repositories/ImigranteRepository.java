package com.abracos.imigrantes.repositories;

import com.abracos.imigrantes.model.Imigrantes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ImigranteRepository extends JpaRepository<Imigrantes, Long> {
    Imigrantes findByEmailImigrante(String emailImigrante);



}
