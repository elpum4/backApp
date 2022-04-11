package com.oneApp.backApp.model;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Experiencia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String exp_titulo;
    private String exp_descripcion;
    private String exp_sitio;
    private String ex_urllogo;
    private Date exp_comienzo;
    private Date exp_final;
    private Boolean exp_actual;
    private int exp_tipo;


    public Experiencia() {
    }

    public Experiencia(Long id, String exp_titulo, String exp_descripcion, String exp_sitio, String ex_urllogo, Date exp_comienzo, Date exp_final, Boolean exp_actual, int exp_tipo) {
        this.id = id;
        this.exp_titulo = exp_titulo;
        this.exp_descripcion = exp_descripcion;
        this.exp_sitio = exp_sitio;
        this.ex_urllogo = ex_urllogo;
        this.exp_comienzo = exp_comienzo;
        this.exp_final = exp_final;
        this.exp_actual = exp_actual;
        this.exp_tipo = exp_tipo;
    }

    
}
