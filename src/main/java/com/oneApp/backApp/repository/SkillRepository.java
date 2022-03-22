package com.oneApp.backApp.repository;

import com.oneApp.backApp.model.Skill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface SkillRepository extends JpaRepository<Skill, Long>  {
    
}
