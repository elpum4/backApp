
package com.oneApp.backApp.service;

import com.oneApp.backApp.model.Skill;
import com.oneApp.backApp.repository.SkillRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SkillService implements ISkillService{
    @Autowired
    public SkillRepository skRepo;
    
    @Override
    public List<Skill> verSkills() {
       return skRepo.findAll();
    }

    @Override
    public void crearSkill(Skill sk) {
        skRepo.save(sk);
    }

    @Override
    public void borrarSkill(Long id) {
        skRepo.deleteById(id);
    }

    @Override
    public Skill buscarSkill(Long id) {
        return skRepo.findById(id).orElse(null);
    }
    
}
