
package com.oneApp.backApp.service;

import com.oneApp.backApp.model.Skill;
import java.util.List;

public interface ISkillService {
    public List<Skill> verSkills();
    public void crearSkill (Skill ed);
    public void borrarSkill (Long id);
    public Skill buscarSkill (Long id);
    
}
