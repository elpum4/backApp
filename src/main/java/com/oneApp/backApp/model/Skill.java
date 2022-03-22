package com.oneApp.backApp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Skill {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String sk_titulo;
    private int sk_habilidad;



    public Skill() {
    }

    public Skill(Long id, String sk_titulo, int sk_habilidad) {
        this.id = id;
        this.sk_titulo = sk_titulo;
        this.sk_habilidad = sk_habilidad;
    }

}
