package com.oneApp.backApp.service;

import com.oneApp.backApp.model.TipoProyecto;
import java.util.List;

public interface ITipoProyectoService {
    
    public List<TipoProyecto> verTipoProyecto();
    public List<TipoProyecto> buscarTPByName(String name);
    public void crearTipoProyecto (TipoProyecto t_proy);
    public void borrarTipoProyecto (Long id);
    public TipoProyecto buscarTipoProyecto (Long id);
}
