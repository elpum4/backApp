package com.oneApp.backApp.service;

import com.oneApp.backApp.DTO.ProyectoDTO;
import java.util.List;

public interface IProyectoServiceDTO {
    public List<ProyectoDTO> verProyectoDTO();
    public void crearProyectoDTO (ProyectoDTO proy);
    public ProyectoDTO buscarProyectoDTO (Long id);
    
}
