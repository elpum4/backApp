package com.oneApp.backApp.service.DTO;

import com.oneApp.backApp.DTO.ExperienciaDTO;
import java.util.List;

public interface IExperienciaServiceDTO {
    public List<ExperienciaDTO> verExperienciaDTO();
    public ExperienciaDTO buscarExperienciaDTO (Long id);
    public void agregarExperiencia(ExperienciaDTO xp);
    
}
