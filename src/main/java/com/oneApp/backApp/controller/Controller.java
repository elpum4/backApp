package com.oneApp.backApp.controller;

import com.oneApp.backApp.model.Educacion;
import com.oneApp.backApp.model.Experiencia;
import com.oneApp.backApp.model.Profile;
import com.oneApp.backApp.model.Proyecto;
import com.oneApp.backApp.model.Skill;
import com.oneApp.backApp.service.IEducacionService;
import com.oneApp.backApp.service.IExperienciaService;
import com.oneApp.backApp.service.IProyectoService;
import com.oneApp.backApp.service.ISkillService;
import java.util.List;

import java.util.Optional;

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
import com.oneApp.backApp.service.IProfileService;


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
    
    @GetMapping("/ver/proyecto")
    @ResponseBody
    //@PreAuthorize("hasRole('VIEWER') or hasRole('MODERATOR') or hasRole('ADMIN')")
    public List<Proyecto> verProyectos(){
        return proyServ.verProyectos();
    }
    
    @GetMapping("/buscar/proyecto/{id}")
    //@PreAuthorize("hasRole('USER') or hasRole('MODERATOR') or hasRole('ADMIN')")
    public Proyecto buscarProyecto(@PathVariable Long id){
        return proyServ.buscarProyecto(id);
    }
    
    @DeleteMapping("/delete/proyecto/{id}")
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
    @GetMapping("/ver/experiencia")
    @ResponseBody
    public List<Experiencia> verExperiencias(){
        return expServ.verExperiencias();
    }
    
    @GetMapping("/buscar/experiencia/{id}")
    @PreAuthorize("hasRole('USER') or hasRole('MODERATOR') or hasRole('ADMIN')")
    public Experiencia buscarExperiencia(@PathVariable Long id){
        return expServ.buscarExperiencia(id);
    }
    
    @DeleteMapping("/delete/experiencia/{id}")
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
    //@PreAuthorize("hasRole('VIEWER') or hasRole('MODERATOR') or hasRole('ADMIN')")
    public List<Educacion> verEducacion(){
        return edServ.verEducacion();
    }
    
    @GetMapping("/buscar/educacion/{id}")
    @PreAuthorize("hasRole('USER') or hasRole('MODERATOR') or hasRole('ADMIN')")
    public Educacion buscarEducacion(@PathVariable Long id){
        return edServ.buscarEducacion(id);
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
    @GetMapping("/ver/skill")
    @ResponseBody
    //@PreAuthorize("hasRole('VIEWER') or hasRole('MODERATOR') or hasRole('ADMIN')")
    public List<Skill> verSkills(){
        return skServ.verSkills();
    }
    
    @GetMapping("/buscar/skill/{id}")
    @PreAuthorize("hasRole('USER') or hasRole('MODERATOR') or hasRole('ADMIN')")
    public Skill buscarSkill(@PathVariable Long id){
        return skServ.buscarSkill(id);
    }
    
    @DeleteMapping("/delete/skill/{id}")
    @PreAuthorize("hasRole('USER') or hasRole('MODERATOR') or hasRole('ADMIN')")
    public void borrarSkill(@PathVariable Long id){
        skServ.borrarSkill(id);
    }
    
    //header
    
    @Autowired
    private IProfileService hdServ;
    
    @PostMapping("/new/profile")
    @PreAuthorize("hasRole('USER') or hasRole('MODERATOR') or hasRole('ADMIN')")
    public void agregarHeader(@RequestBody Profile hd){
        hdServ.crearProfile(hd);
    }
    
    @GetMapping("/ver/profile")
    @ResponseBody
    //@PreAuthorize("hasRole('VIEWER') or hasRole('MODERATOR') or hasRole('ADMIN')")
    public List<Profile> verHeader(){
        return hdServ.verProfile();
    }
    
    @GetMapping("/buscar/profile/{id}")
    @PreAuthorize("hasRole('USER') or hasRole('MODERATOR') or hasRole('ADMIN')")
    public Profile buscarHeader(@PathVariable Long id){
        return hdServ.buscarProfile(id);
    }
}
