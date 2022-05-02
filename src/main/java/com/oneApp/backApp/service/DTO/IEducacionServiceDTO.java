package com.oneApp.backApp.service.DTO;

import com.oneApp.backApp.DTO.EducacionDTO;
import java.util.List;

public interface IEducacionServiceDTO {
    public List<EducacionDTO> verEducacionDTO();
    public EducacionDTO buscarEducacionDTO (Long id);
    public void agregarEducacion(EducacionDTO ed);
    
}

