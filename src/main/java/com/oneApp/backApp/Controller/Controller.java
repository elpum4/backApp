package com.oneApp.backApp.Controller;

import com.oneApp.backApp.model.Experiencia;
import com.oneApp.backApp.model.Proyecto;
import com.oneApp.backApp.service.IExperienciaService;
import com.oneApp.backApp.service.IProyectoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @Autowired
    private IProyectoService proyServ;
    
    @PostMapping("/new/proyecto")
    public void agregarProyecto(@RequestBody Proyecto proy){
        proyServ.crearProyecto(proy);
    }
    @GetMapping("/ver/proyectos")
    @ResponseBody
    public List<Proyecto> verProyectos(){
        return proyServ.verProyectos();
    }
    
    @DeleteMapping("/delete/{id}")
    public void borrarProyecto(@PathVariable Long id){
        proyServ.borrarProyecto(id);
    }
    
    @Autowired
    private IExperienciaService expServ;
    
    @PostMapping("/new/experiencia")
    public void agregarExperiencia(@RequestBody Experiencia exp){
        expServ.crearExperiencia(exp);
    }
    @GetMapping("/ver/experiencias")
    @ResponseBody
    public List<Experiencia> verExperiencias(){
        return expServ.verExperiencias();
    }
    
    @DeleteMapping("/delete/exp/{id}")
    public void borrarExperiencia(@PathVariable Long id){
        expServ.borrarExperiencia(id);
    }
    
}
