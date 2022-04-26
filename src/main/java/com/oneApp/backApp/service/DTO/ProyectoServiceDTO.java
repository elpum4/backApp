package com.oneApp.backApp.service.DTO;

import com.oneApp.backApp.DTO.ProyectoDTO;
import com.oneApp.backApp.model.Proyecto;
import com.oneApp.backApp.repository.ProyectoRepository;
import com.oneApp.backApp.repository.TipoProyectoRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProyectoServiceDTO implements IProyectoServiceDTO{
    
    @Autowired
    public ProyectoRepository proyRepo;
    @Autowired
    public TipoProyectoRepository tProyRepo;
    
    @Override
    public List<ProyectoDTO> verProyectoDTO() {
        List <Proyecto> proyectos = proyRepo.findAll();
        List <ProyectoDTO> proyectosDTO = new ArrayList<>();
        for(Proyecto proy : proyectos){
           ProyectoDTO proyectoDTO = new ProyectoDTO();
           
           proyectoDTO.setId(proy.getId());
           proyectoDTO.setProy_titulo(proy.getProy_titulo());
           proyectoDTO.setProy_descripcion(proy.getProy_descripcion());
           proyectoDTO.setProy_url(proy.getProy_url());
           proyectoDTO.setProy_cliente(proy.getProy_cliente());
           proyectoDTO.setProy_urlimg(proy.getProy_urlimg());
           proyectoDTO.setProy_categoria(proy.getProy_categoria().name);
           
           proyectosDTO.add(proyectoDTO);
        } return proyectosDTO;
    }

    @Override
    public ProyectoDTO buscarProyectoDTO(Long id) {
        Proyecto proy = proyRepo.findById(id).orElse(null);
        
        ProyectoDTO proyectoDTO = new ProyectoDTO();
           
           proyectoDTO.setId(proy.getId());
           proyectoDTO.setProy_titulo(proy.getProy_titulo());
           proyectoDTO.setProy_descripcion(proy.getProy_descripcion());
           proyectoDTO.setProy_url(proy.getProy_url());
           proyectoDTO.setProy_cliente(proy.getProy_cliente());
           proyectoDTO.setProy_urlimg(proy.getProy_urlimg());
           proyectoDTO.setProy_categoria(proy.getProy_categoria().name);
        
        return proyectoDTO;
    }
    
}
