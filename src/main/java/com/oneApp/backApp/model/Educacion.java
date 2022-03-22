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
public class Educacion {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String ed_titulo;
    private String ed_descripcion;
    private String ed_institucion;
    private Date ed_comienzo;
    private Date ed_final;
    private int ed_actual;
    private int ed_tipo;


    public Educacion() {
    }

    public Educacion(Long id, String ed_titulo, String ed_descripcion, String ed_institucion, Date ed_comienzo, Date ed_final, int ed_actual, int ed_tipo) {
        this.id = id;
        this.ed_titulo = ed_titulo;
        this.ed_descripcion = ed_descripcion;
        this.ed_institucion = ed_institucion;
        this.ed_comienzo = ed_comienzo;
        this.ed_final = ed_final;
        this.ed_actual = ed_actual;
        this.ed_tipo = ed_tipo;
    }

      
    
}
