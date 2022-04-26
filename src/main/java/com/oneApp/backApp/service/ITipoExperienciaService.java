package com.oneApp.backApp.service;

import com.oneApp.backApp.model.TipoExperiencia;
import java.util.List;

public interface ITipoExperienciaService {
    
    public List<TipoExperiencia> verTipoExperiencia();
    public List<TipoExperiencia> buscarTXpByName(String name);
    public void crearTipoExperiencia (TipoExperiencia t_xp);
    public void borrarTipoExperiencia (Long id);
    public TipoExperiencia buscarTipoExperiencia (Long id);
}
