package com.oneApp.backApp.service;

import com.oneApp.backApp.model.TipoEducacion;
import com.oneApp.backApp.repository.TipoEducacionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class TipoEducacionService implements ITipoEducacionService{
    @Autowired
    public TipoEducacionRepository tEdRepo;

   @Override
    public List<TipoEducacion> verTipoEducacion() {
       return tEdRepo.findAll();
    }

    @Override
    public void crearTipoEducacion(TipoEducacion t_ed) {
       tEdRepo.save(t_ed); 
    }

    @Override
    public void borrarTipoEducacion(Long id) {
        tEdRepo.deleteById(id);
    }

    @Override
    public TipoEducacion buscarTipoEducacion(Long id) {
        return tEdRepo.findById(id).orElse(null);
    } 
    


    @Override
    public List<TipoEducacion> buscarTEByName(String name) {
        return tEdRepo.findByName(name);
    }

}
