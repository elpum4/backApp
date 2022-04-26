package com.oneApp.backApp.repository;
import com.oneApp.backApp.model.TipoProyecto;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TipoProyectoRepository extends JpaRepository<TipoProyecto, Long>{
    public List<TipoProyecto> findByName(String name);
}
