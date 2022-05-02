package com.oneApp.backApp.service.DTO;

import com.oneApp.backApp.DTO.ExperienciaDTO;
import com.oneApp.backApp.model.Experiencia;
import com.oneApp.backApp.repository.ExperienciaRepository;
import com.oneApp.backApp.repository.TipoExperienciaRepository;
import com.oneApp.backApp.service.IExperienciaService;
import com.oneApp.backApp.service.ITipoExperienciaService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExperienciaServiceDTO implements IExperienciaServiceDTO{
    
    @Autowired
    public ExperienciaRepository xpRepo;
    @Autowired
    public TipoExperienciaRepository tXpRepo;
    @Autowired
    private IExperienciaService expServ;
    @Autowired
    private ITipoExperienciaService iTExpServ;
    
    @Override
    public List<ExperienciaDTO> verExperienciaDTO() {
        List <Experiencia> experiencias = xpRepo.findAll();
        List <ExperienciaDTO> experienciasDTO = new ArrayList<>();
        for(Experiencia xp : experiencias){
           ExperienciaDTO experienciaDTO = new ExperienciaDTO();
           
           experienciaDTO.setId(xp.getId());
           experienciaDTO.setExp_titulo(xp.getExp_titulo());
           experienciaDTO.setExp_descripcion(xp.getExp_descripcion());
           experienciaDTO.setExp_sitio(xp.getExp_sitio());
           experienciaDTO.setEx_urllogo(xp.getEx_urllogo());
           experienciaDTO.setExp_comienzo(xp.getExp_comienzo());
           experienciaDTO.setExp_final(xp.getExp_final());
           experienciaDTO.setExp_actual(xp.getExp_actual());
           experienciaDTO.setExp_tipo(xp.getExp_tipo().name);
           
           experienciasDTO.add(experienciaDTO);
        } return experienciasDTO;
    }
    @Override
    public void agregarExperiencia(ExperienciaDTO xp){
        Experiencia experiencia = new Experiencia();
        
        experiencia.setId(xp.getId());
        experiencia.setExp_titulo(xp.getExp_titulo());
        experiencia.setExp_descripcion(xp.getExp_descripcion());
        experiencia.setExp_sitio(xp.getExp_sitio());
        experiencia.setEx_urllogo(xp.getEx_urllogo());
        experiencia.setExp_comienzo(xp.getExp_comienzo());
        experiencia.setExp_final(xp.getExp_final());
        experiencia.setExp_actual(xp.getExp_actual());
        experiencia.setExp_tipo(iTExpServ.buscarTXpByName(xp.getExp_tipo()).get(0));
        
        expServ.crearExperiencia(experiencia);
    }

    @Override
    public ExperienciaDTO buscarExperienciaDTO(Long id) {
        Experiencia xp = xpRepo.findById(id).orElse(null);
        
        ExperienciaDTO experienciaDTO = new ExperienciaDTO();
           
           experienciaDTO.setId(xp.getId());
           experienciaDTO.setExp_titulo(xp.getExp_titulo());
           experienciaDTO.setExp_descripcion(xp.getExp_descripcion());
           experienciaDTO.setExp_sitio(xp.getExp_sitio());
           experienciaDTO.setEx_urllogo(xp.getEx_urllogo());
           experienciaDTO.setExp_comienzo(xp.getExp_comienzo());
           experienciaDTO.setExp_final(xp.getExp_final());
           experienciaDTO.setExp_actual(xp.getExp_actual());
           experienciaDTO.setExp_tipo(xp.getExp_tipo().name);
        
        return experienciaDTO;
    }
}