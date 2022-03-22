
package com.oneApp.backApp.service;

import com.oneApp.backApp.model.Proyecto;
import com.oneApp.backApp.repository.ProyectoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProyectoService implements IProyectoService {
    @Autowired
    public ProyectoRepository proyRepo;
    
    @Override
    public List<Proyecto> verProyectos() {
       return proyRepo.findAll();
    }

    @Override
    public void crearProyecto(Proyecto proy) {
       proyRepo.save(proy); 
    }

    @Override
    public void borrarProyecto(Long id) {
        proyRepo.deleteById(id);
    }

    @Override
    public Proyecto buscararProyecto(Long id) {
        return proyRepo.findById(id).orElse(null);
    }
    
}
