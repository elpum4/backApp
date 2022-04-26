package com.oneApp.backApp.service;

import com.oneApp.backApp.model.TipoProyecto;
import com.oneApp.backApp.repository.TipoProyectoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class TipoProyectoService implements ITipoProyectoService{
    @Autowired
    public TipoProyectoRepository tProyRepo;

   @Override
    public List<TipoProyecto> verTipoProyecto() {
       return tProyRepo.findAll();
    }

    @Override
    public void crearTipoProyecto(TipoProyecto t_proy) {
       tProyRepo.save(t_proy); 
    }

    @Override
    public void borrarTipoProyecto(Long id) {
        tProyRepo.deleteById(id);
    }

    @Override
    public TipoProyecto buscarTipoProyecto(Long id) {
        return tProyRepo.findById(id).orElse(null);
    } 
    


    @Override
    public List<TipoProyecto> buscarTPByName(String name) {
        return tProyRepo.findByName(name);
    }

}
