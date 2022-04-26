package com.oneApp.backApp.service.DTO;

import com.oneApp.backApp.DTO.ProyectoDTO;
import java.util.List;

public interface IProyectoServiceDTO {
    public List<ProyectoDTO> verProyectoDTO();
    public ProyectoDTO buscarProyectoDTO (Long id);
    
}
