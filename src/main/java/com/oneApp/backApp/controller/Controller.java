package com.oneApp.backApp.controller;

import com.oneApp.backApp.model.Educacion;
import com.oneApp.backApp.model.Experiencia;
import com.oneApp.backApp.model.Header;
import com.oneApp.backApp.model.Proyecto;
import com.oneApp.backApp.model.Skill;
import com.oneApp.backApp.service.IEducacionService;
import com.oneApp.backApp.service.IExperienciaService;
import com.oneApp.backApp.service.IHeaderService;
import com.oneApp.backApp.service.IProyectoService;
import com.oneApp.backApp.service.ISkillService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@CrossOrigin(origins = "*", maxAge = 3600)
@RestController

@RequestMapping("/api")
public class Controller {
    @Autowired
    private IProyectoService proyServ;
    
    @PostMapping("/new/proyecto")
    @PreAuthorize("hasRole('USER') or hasRole('MODERATOR') or hasRole('ADMIN')")
    public void agregarProyecto(@RequestBody Proyecto proy){
        proyServ.crearProyecto(proy);
    }
    
    @GetMapping("/ver/proyectos")
    @ResponseBody
    
    @PreAuthorize("hasRole('VIEWER') or hasRole('MODERATOR') or hasRole('ADMIN')")
    public List<Proyecto> verProyectos(){
        
        System.out.print(proyServ.verProyectos());
        
        return proyServ.verProyectos();
        
    }
    
    @DeleteMapping("/delete/{id}")
    @PreAuthorize("hasRole('USER') or hasRole('MODERATOR') or hasRole('ADMIN')")
    public void borrarProyecto(@PathVariable Long id){
        proyServ.borrarProyecto(id);
    }
    //Experiencia
    @Autowired
    private IExperienciaService expServ;
    
    @PostMapping("/new/experiencia")
    @PreAuthorize("hasRole('USER') or hasRole('MODERATOR') or hasRole('ADMIN')")
    public void agregarExperiencia(@RequestBody Experiencia exp){
        expServ.crearExperiencia(exp);
    }
    @GetMapping("/ver/experiencias")
    @ResponseBody
    public List<Experiencia> verExperiencias(){
        return expServ.verExperiencias();
    }
    
    @DeleteMapping("/delete/exp/{id}")
    @PreAuthorize("hasRole('USER') or hasRole('MODERATOR') or hasRole('ADMIN')")
    public void borrarExperiencia(@PathVariable Long id){
        expServ.borrarExperiencia(id);
    }
    
    //Educacion
    @Autowired
    private IEducacionService edServ;
    
    @PostMapping("/new/educacion")
    @PreAuthorize("hasRole('USER') or hasRole('MODERATOR') or hasRole('ADMIN')")
    public void agregarEducacion(@RequestBody Educacion ed){
        edServ.crearEducacion(ed);
    }
    @GetMapping("/ver/educacion")
    @ResponseBody
    @PreAuthorize("hasRole('VIEWER') or hasRole('MODERATOR') or hasRole('ADMIN')")
    public List<Educacion> verEducacion(){
        return edServ.verEducacion();
    }
    
    @DeleteMapping("/delete/educacion/{id}")
    @PreAuthorize("hasRole('USER') or hasRole('MODERATOR') or hasRole('ADMIN')")
    public void borrarEducacion(@PathVariable Long id){
        edServ.borrarEducacion(id);
    }
    
    //Skills
    @Autowired
    private ISkillService skServ;
    
    @PostMapping("/new/skill")
    @PreAuthorize("hasRole('USER') or hasRole('MODERATOR') or hasRole('ADMIN')")
    public void agregarSkill(@RequestBody Skill sk){
        skServ.crearSkill(sk);
    }
    @GetMapping("/ver/skills")
    @ResponseBody
    @PreAuthorize("hasRole('VIEWER') or hasRole('MODERATOR') or hasRole('ADMIN')")
    public List<Skill> verSkills(){
        return skServ.verSkills();
    }
    
    @DeleteMapping("/delete/skill/{id}")
    @PreAuthorize("hasRole('USER') or hasRole('MODERATOR') or hasRole('ADMIN')")
    public void borrarSkill(@PathVariable Long id){
        skServ.borrarSkill(id);
    }
    
    //header
    
    @Autowired
    private IHeaderService hdServ;
    
    @PostMapping("/new/header")
    @PreAuthorize("hasRole('USER') or hasRole('MODERATOR') or hasRole('ADMIN')")
    public void agregarHeader(@RequestBody Header hd){
        hdServ.crearHeader(hd);
    }
    
    @GetMapping("/ver/header")
    @ResponseBody
    @PreAuthorize("hasRole('VIEWER') or hasRole('MODERATOR') or hasRole('ADMIN')")
    public List<Header> verHeader(){
        return hdServ.verHeader();
    }
    

}
