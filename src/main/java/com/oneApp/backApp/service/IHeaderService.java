
package com.oneApp.backApp.service;

import com.oneApp.backApp.model.Header;
import java.util.List;

public interface IHeaderService {
    public List<Header> verHeader();
    public void crearHeader (Header head);
    public Header buscarHeader (Long id);
    
}
