package com.oneApp.backApp.service.DTO;

import com.oneApp.backApp.DTO.EducacionDTO;
import com.oneApp.backApp.DTO.ExperienciaDTO;
import com.oneApp.backApp.model.Educacion;
import com.oneApp.backApp.model.Experiencia;
import com.oneApp.backApp.repository.EducacionRepository;
import com.oneApp.backApp.repository.TipoEducacionRepository;
import com.oneApp.backApp.service.IEducacionService;
import com.oneApp.backApp.service.ITipoEducacionService;
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
    @Autowired
    private IEducacionService edServ;
    @Autowired
    private ITipoEducacionService iTEdpServ;
    
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
    public void agregarEducacion(EducacionDTO ed){
        Educacion educacion = new Educacion();
        
        educacion.setId(ed.getId());
        educacion.setEd_titulo(ed.getEd_titulo());
        educacion.setEd_descripcion(ed.getEd_descripcion());
        educacion.setEd_institucion(ed.getEd_institucion());
        educacion.setEd_urllogo(ed.getEd_urllogo());
        educacion.setEd_comienzo(ed.getEd_comienzo());
        educacion.setEd_final(ed.getEd_final());
        educacion.setEd_actual(ed.getEd_actual());
        educacion.setEd_tipo(iTEdpServ.buscarTEByName(ed.getEd_tipo()).get(0));
        
        edServ.crearEducacion(educacion);
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