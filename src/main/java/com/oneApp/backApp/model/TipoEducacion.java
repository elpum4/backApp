package com.oneApp.backApp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter

public class TipoEducacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    public String name;

    public TipoEducacion() {
    }

    public TipoEducacion(Long id, String name) {
        this.id = id;
        this.name = name;
    } 
    
}
