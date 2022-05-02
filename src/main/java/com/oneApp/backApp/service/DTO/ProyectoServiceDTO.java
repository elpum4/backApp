package com.oneApp.backApp.service.DTO;

import com.oneApp.backApp.DTO.ProyectoDTO;
import com.oneApp.backApp.model.Proyecto;
import com.oneApp.backApp.repository.ProyectoRepository;
import com.oneApp.backApp.repository.TipoProyectoRepository;
import com.oneApp.backApp.service.IProyectoService;
import com.oneApp.backApp.service.ITipoProyectoService;
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
    @Autowired
    private ITipoProyectoService iTProyServ;
    @Autowired
    private IProyectoService proyServ;
    
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
    public void agregarProyecto(ProyectoDTO proy){
        Proyecto proyecto = new Proyecto();
        
        proyecto.setId(proy.getId());
        proyecto.setProy_titulo(proy.getProy_titulo());
        proyecto.setProy_descripcion(proy.getProy_descripcion());
        proyecto.setProy_url(proy.getProy_url());
        proyecto.setProy_cliente(proy.getProy_cliente());
        proyecto.setProy_urlimg(proy.getProy_urlimg());
        proyecto.setProy_categoria(iTProyServ.buscarTPByName(proy.getProy_categoria()).get(0));
        proyServ.crearProyecto(proyecto);

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
