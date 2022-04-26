package com.oneApp.backApp.repository;
import com.oneApp.backApp.model.TipoExperiencia;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TipoExperienciaRepository extends JpaRepository<TipoExperiencia, Long>{
    public List<TipoExperiencia> findByName(String name);
}
