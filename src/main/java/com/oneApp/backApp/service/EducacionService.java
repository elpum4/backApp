
package com.oneApp.backApp.service;

import com.oneApp.backApp.model.Educacion;
import com.oneApp.backApp.repository.EducacionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EducacionService implements IEducacionService{
    @Autowired
    public EducacionRepository edRepo;
    
    @Override
    public List<Educacion> verEducacion() {
       return edRepo.findAll();
    }

    @Override
    public void crearEducacion(Educacion exp) {
        edRepo.save(exp);
    }

    @Override
    public void borrarEducacion(Long id) {
        edRepo.deleteById(id);
    }

    @Override
    public Educacion buscarEducacion(Long id) {
        return edRepo.findById(id).orElse(null);
    }
    
}
