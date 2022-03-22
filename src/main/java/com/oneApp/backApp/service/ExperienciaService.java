
package com.oneApp.backApp.service;

import com.oneApp.backApp.model.Experiencia;
import com.oneApp.backApp.repository.ExperienciaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExperienciaService implements IExperienciaService{
    @Autowired
    public ExperienciaRepository expRepo;
    
    @Override
    public List<Experiencia> verExperiencias() {
       return expRepo.findAll();
    }

    @Override
    public void crearExperiencia(Experiencia exp) {
        expRepo.save(exp);
    }

    @Override
    public void borrarExperiencia(Long id) {
        expRepo.deleteById(id);
    }

    @Override
    public Experiencia buscararExperiencia(Long id) {
        return expRepo.findById(id).orElse(null);
    }
    
}
