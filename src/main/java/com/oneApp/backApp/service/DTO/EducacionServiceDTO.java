package com.oneApp.backApp.service.DTO;

import com.oneApp.backApp.DTO.EducacionDTO;
import com.oneApp.backApp.DTO.ExperienciaDTO;
import com.oneApp.backApp.model.Educacion;
import com.oneApp.backApp.model.Experiencia;
import com.oneApp.backApp.repository.EducacionRepository;
import com.oneApp.backApp.repository.TipoEducacionRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EducacionServiceDTO implements IEducacionServiceDTO{
    
    @Autowired
    public EducacionRepository edRepo;
    @Autowired
    public TipoEducacionRepository tEdRepo;
    
    @Override
    public List<EducacionDTO> verEducacionDTO() {
        List <Educacion> list_Ed = edRepo.findAll();
        List <EducacionDTO> list_EdDTO = new ArrayList<>();
        for(Educacion ed : list_Ed){
           EducacionDTO educacionDTO = new EducacionDTO();
           
           educacionDTO.setId(ed.getId());
           educacionDTO.setEd_titulo(ed.getEd_titulo());
           educacionDTO.setEd_descripcion(ed.getEd_descripcion());
           educacionDTO.setEd_institucion(ed.getEd_institucion());
           educacionDTO.setEd_urllogo(ed.getEd_urllogo());
           educacionDTO.setEd_comienzo(ed.getEd_comienzo());
           educacionDTO.setEd_final(ed.getEd_final());
           educacionDTO.setEd_actual(ed.getEd_actual());
           educacionDTO.setEd_tipo(ed.getEd_tipo().name);
           
           list_EdDTO.add(educacionDTO);
        } return list_EdDTO;
    }

    @Override
    public EducacionDTO buscarEducacionDTO(Long id) {
        Educacion ed = edRepo.findById(id).orElse(null);
        
        EducacionDTO educacionDTO = new EducacionDTO();
           
           educacionDTO.setId(ed.getId());
           educacionDTO.setEd_titulo(ed.getEd_titulo());
           educacionDTO.setEd_descripcion(ed.getEd_descripcion());
           educacionDTO.setEd_institucion(ed.getEd_institucion());
           educacionDTO.setEd_urllogo(ed.getEd_urllogo());
           educacionDTO.setEd_comienzo(ed.getEd_comienzo());
           educacionDTO.setEd_final(ed.getEd_final());
           educacionDTO.setEd_actual(ed.getEd_actual());
           educacionDTO.setEd_tipo(ed.getEd_tipo().name);
        
        return educacionDTO;
    }
}