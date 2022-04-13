
package com.oneApp.backApp.service;

import com.oneApp.backApp.model.Profile;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.oneApp.backApp.repository.ProfileRepository;

@Service
public class ProfileService implements IProfileService{
    @Autowired
    public ProfileRepository headRepo;
    
    @Override
    public List<Profile> verProfile() {
       return headRepo.findAll();
    }

    @Override
    public void crearProfile(Profile head) {
        headRepo.save(head);
    }

    @Override
    public Profile buscarProfile(Long id) {
        return headRepo.findById(id).orElse(null);
    }
    
}
