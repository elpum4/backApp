package com.oneApp.backApp.controller;

import com.oneApp.backApp.DTO.EducacionDTO;
import com.oneApp.backApp.DTO.ExperienciaDTO;
import com.oneApp.backApp.DTO.ProyectoDTO;
import com.oneApp.backApp.model.Educacion;
import com.oneApp.backApp.model.Experiencia;
import com.oneApp.backApp.model.Profile;
import com.oneApp.backApp.model.Proyecto;
import com.oneApp.backApp.model.Skill;
import com.oneApp.backApp.model.TipoEducacion;
import com.oneApp.backApp.model.TipoExperiencia;
import com.oneApp.backApp.model.TipoProyecto;
import com.oneApp.backApp.service.DTO.IEducacionServiceDTO;
import com.oneApp.backApp.service.IEducacionService;
import com.oneApp.backApp.service.IExperienciaService;
import com.oneApp.backApp.service.DTO.IExperienciaServiceDTO;
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
import com.oneApp.backApp.service.IProfileService;
import com.oneApp.backApp.service.DTO.IProyectoServiceDTO;
import com.oneApp.backApp.service.ITipoEducacionService;
import com.oneApp.backApp.service.ITipoExperienciaService;
import com.oneApp.backApp.service.ITipoProyectoService;


@CrossOrigin(origins = "*", maxAge = 3600)
@RestController

@RequestMapping("/api")
public class Controller {
    
    //Proyecto
    
    @Autowired
    private IProyectoService proyServ;
    @Autowired
    private ITipoProyectoService iTProyServ;
    @Autowired
    private IProyectoServiceDTO proyServDTO;
    
    @PostMapping("/new/proyecto")
    @PreAuthorize("hasRole('USER') or hasRole('MODERATOR') or hasRole('ADMIN')")
    public void agregarProyecto(@RequestBody ProyectoDTO proy){
        Proyecto proyecto = new Proyecto();
        
        proyecto.setId(proy.getId());
        proyecto.setProy_titulo(proy.getProy_titulo());
        proyecto.setProy_descripcion(proy.getProy_descripcion());
        proyecto.setProy_url(proy.getProy_url());
        proyecto.setProy_cliente(proy.getProy_cliente());
        proyecto.setProy_urlimg(proy.getProy_urlimg());
        proyecto.setProy_categoria(iTProyServ.buscarTPByName(proy.getProy_categoria()).get(0));
        proyServ.crearProyecto(proyecto);

    }
    
  
    @DeleteMapping("/delete/proyecto/{id}")
    @PreAuthorize("hasRole('USER') or hasRole('MODERATOR') or hasRole('ADMIN')")
    public void borrarProyecto(@PathVariable Long id){
        proyServ.borrarProyecto(id);
    }
    
    @GetMapping("/ver/proyecto")
    @ResponseBody
    //@PreAuthorize("hasRole('VIEWER') or hasRole('MODERATOR') or hasRole('ADMIN')")
    public List<ProyectoDTO> verProyectoDTO(){
        return proyServDTO.verProyectoDTO();
    }
    
    @GetMapping("/buscar/proyecto/{id}")
    //@PreAuthorize("hasRole('USER') or hasRole('MODERATOR') or hasRole('ADMIN')")
    public ProyectoDTO buscarProyectoDTO(@PathVariable Long id){
        return proyServDTO.buscarProyectoDTO(id);
    }
    
    //Experiencia
    @Autowired
    private IExperienciaService expServ;
    @Autowired
    private IExperienciaServiceDTO expServDTO;
    @Autowired
    private ITipoExperienciaService iTExpServ;
    
    @PostMapping("/new/experiencia")
    @PreAuthorize("hasRole('USER') or hasRole('MODERATOR') or hasRole('ADMIN')")
    public void agregarExperiencia(@RequestBody ExperienciaDTO xp){
        Experiencia experiencia = new Experiencia();
        
        experiencia.setId(xp.getId());
        experiencia.setExp_titulo(xp.getExp_titulo());
        experiencia.setExp_descripcion(xp.getExp_descripcion());
        experiencia.setExp_sitio(xp.getExp_sitio());
        experiencia.setEx_urllogo(xp.getEx_urllogo());
        experiencia.setExp_comienzo(xp.getExp_comienzo());
        experiencia.setExp_final(xp.getExp_final());
        experiencia.setExp_actual(xp.getExp_actual());
        experiencia.setExp_tipo(iTExpServ.buscarTXpByName(xp.getExp_tipo()).get(0));
        
        expServ.crearExperiencia(experiencia);
    }
    
    
    @GetMapping("/ver/experiencia")
    @ResponseBody
    public List<ExperienciaDTO> verExperienciasDTO(){
        return expServDTO.verExperienciaDTO();
    }
    
    @GetMapping("/buscar/experiencia/{id}")
    @PreAuthorize("hasRole('USER') or hasRole('MODERATOR') or hasRole('ADMIN')")
    public ExperienciaDTO buscarExperienciaDTO(@PathVariable Long id){
        return expServDTO.buscarExperienciaDTO(id);
    }
    
    @DeleteMapping("/delete/experiencia/{id}")
    @PreAuthorize("hasRole('USER') or hasRole('MODERATOR') or hasRole('ADMIN')")
    public void borrarExperiencia(@PathVariable Long id){
        expServ.borrarExperiencia(id);
    }
    
    //Educacion
    
    @Autowired
    private IEducacionService edServ;
    @Autowired
    private IEducacionServiceDTO edServDTO;
    @Autowired
    private ITipoEducacionService iTEdpServ;
    
    @PostMapping("/new/educacion")
    @PreAuthorize("hasRole('USER') or hasRole('MODERATOR') or hasRole('ADMIN')")
    public void agregarEducacion(@RequestBody EducacionDTO ed){
        Educacion educacion = new Educacion();
        
        educacion.setId(ed.getId());
        educacion.setEd_titulo(ed.getEd_titulo());
        educacion.setEd_descripcion(ed.getEd_descripcion());
        educacion.setEd_institucion(ed.getEd_institucion());
        educacion.setEd_urllogo(ed.getEd_urllogo());
        educacion.setEd_comienzo(ed.getEd_comienzo());
        educacion.setEd_final(ed.getEd_final());
        educacion.setEd_actual(ed.getEd_actual());
        educacion.setEd_tipo(iTEdpServ.buscarTEByName(ed.getEd_tipo()).get(0));
        
        edServ.crearEducacion(educacion);
    }
    @GetMapping("/ver/educacion")
    @ResponseBody
    //@PreAuthorize("hasRole('VIEWER') or hasRole('MODERATOR') or hasRole('ADMIN')")
    public List<EducacionDTO> verEducacionDTO(){
        return edServDTO.verEducacionDTO();
    }
    
    @GetMapping("/buscar/educacion/{id}")
    @PreAuthorize("hasRole('USER') or hasRole('MODERATOR') or hasRole('ADMIN')")
    public EducacionDTO buscarEducacionDTO(@PathVariable Long id){
        return edServDTO.buscarEducacionDTO(id);
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
    
    //**********************************TIPOS************************************************//
    
    //Tipo Proyecto
   
    @Autowired
    private ITipoProyectoService ITProyServ;
    @GetMapping("/ver/tipoproyecto")
    @ResponseBody
    public List<TipoProyecto> verTipoProyecto(){
        return ITProyServ.verTipoProyecto();
    }
    
    //Tipo Experiencia
   
    @Autowired
    private ITipoExperienciaService ITXpServ;
    @GetMapping("/ver/tipoexperiencia")
    @ResponseBody
    public List<TipoExperiencia> verTipoExperiencia(){
        return ITXpServ.verTipoExperiencia();
    }
    
    //Tipo Educacion
   
    @Autowired
    private ITipoEducacionService ITEdServ;
    @GetMapping("/ver/tipoeducacion")
    @ResponseBody
    public List<TipoEducacion> verTipoEducacion(){
        return ITEdServ.verTipoEducacion();
    }
}
