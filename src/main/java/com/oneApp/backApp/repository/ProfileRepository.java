package com.oneApp.backApp.repository;

import com.oneApp.backApp.model.Profile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ProfileRepository extends JpaRepository<Profile, Long>  {
    
}
