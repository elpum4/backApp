package com.oneApp.backApp.repository;
import com.oneApp.backApp.model.TipoEducacion;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TipoEducacionRepository extends JpaRepository<TipoEducacion, Long>{
    public List<TipoEducacion> findByName(String name);
}
