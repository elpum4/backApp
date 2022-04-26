package com.oneApp.backApp.service;

import com.oneApp.backApp.model.TipoEducacion;
import java.util.List;

public interface ITipoEducacionService {
    
    public List<TipoEducacion> verTipoEducacion();
    public List<TipoEducacion> buscarTEByName(String name);
    public void crearTipoEducacion (TipoEducacion t_ed);
    public void borrarTipoEducacion (Long id);
    public TipoEducacion buscarTipoEducacion (Long id);
}
