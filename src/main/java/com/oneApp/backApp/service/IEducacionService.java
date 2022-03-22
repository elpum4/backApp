
package com.oneApp.backApp.service;

import com.oneApp.backApp.model.Educacion;
import java.util.List;

public interface IEducacionService {
    public List<Educacion> verEducacion();
    public void crearEducacion (Educacion ed);
    public void borrarEducacion (Long id);
    public Educacion buscarEducacion (Long id);
    
}
