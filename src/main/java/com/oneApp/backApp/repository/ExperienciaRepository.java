package com.oneApp.backApp.repository;

import com.oneApp.backApp.model.Experiencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ExperienciaRepository extends JpaRepository<Experiencia, Long>  {
    
}
