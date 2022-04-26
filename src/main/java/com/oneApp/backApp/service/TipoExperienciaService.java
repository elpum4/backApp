package com.oneApp.backApp.service;

import com.oneApp.backApp.model.TipoExperiencia;
import com.oneApp.backApp.repository.TipoExperienciaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class TipoExperienciaService implements ITipoExperienciaService{
    @Autowired
    public TipoExperienciaRepository tXpRepo;

   @Override
    public List<TipoExperiencia> verTipoExperiencia() {
       return tXpRepo.findAll();
    }

    @Override
    public void crearTipoExperiencia(TipoExperiencia t_xp) {
       tXpRepo.save(t_xp); 
    }

    @Override
    public void borrarTipoExperiencia(Long id) {
        tXpRepo.deleteById(id);
    }

    @Override
    public TipoExperiencia buscarTipoExperiencia(Long id) {
        return tXpRepo.findById(id).orElse(null);
    } 
    


    @Override
    public List<TipoExperiencia> buscarTXpByName(String name) {
        return tXpRepo.findByName(name);
    }

}
