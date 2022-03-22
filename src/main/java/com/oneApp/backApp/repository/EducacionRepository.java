package com.oneApp.backApp.repository;

import com.oneApp.backApp.model.Educacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EducacionRepository extends JpaRepository<Educacion, Long>  {
    
}
