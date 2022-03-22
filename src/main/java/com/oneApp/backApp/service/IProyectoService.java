
package com.oneApp.backApp.service;

import com.oneApp.backApp.model.Proyecto;
import java.util.List;

public interface IProyectoService {
    public List<Proyecto> verProyectos();
    public void crearProyecto (Proyecto proy);
    public void borrarProyecto (Long id);
    public Proyecto buscararProyecto (Long id);
    
}
