package com.abracos.imigrantes.repositories;

import com.abracos.imigrantes.model.Imigrantes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ImigranteRepository extends JpaRepository<Imigrantes, Integer> {

}
