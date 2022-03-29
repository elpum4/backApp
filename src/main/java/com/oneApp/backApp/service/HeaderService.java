
package com.oneApp.backApp.service;

import com.oneApp.backApp.model.Header;
import com.oneApp.backApp.repository.HeaderRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HeaderService implements IHeaderService{
    @Autowired
    public HeaderRepository headRepo;
    
    @Override
    public List<Header> verHeader() {
       return headRepo.findAll();
    }

    @Override
    public void crearHeader(Header head) {
        headRepo.save(head);
    }

    @Override
    public Header buscarHeader(Long id) {
        return headRepo.findById(id).orElse(null);
    }
    
}
