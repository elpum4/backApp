
package com.oneApp.backApp.service;

import com.oneApp.backApp.model.Profile;
import java.util.List;

public interface IProfileService {
    public List<Profile> verProfile();
    public void crearProfile (Profile head);
    public Profile buscarProfile (Long id);
    
}
