package com.oneApp.backApp.model;

import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Educacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String ed_titulo;
    @Size(max = 400)
    private String ed_descripcion;
    private String ed_institucion;
    private String ed_urllogo;
    @Temporal(TemporalType.DATE)
    private Date ed_comienzo;
    @Temporal(TemporalType.DATE)
    private Date ed_final;
    private Boolean ed_actual;
    @JoinColumn(name = "ed_tipo", nullable = false)
    @ManyToOne(optional = false, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private TipoEducacion ed_tipo;


    public Educacion() {
    }

    public Educacion(Long id, String ed_titulo, String ed_descripcion, String ed_institucion, String ed_urllogo, Date ed_comienzo, Date ed_final, Boolean ed_actual, TipoEducacion ed_tipo) {
        this.id = id;
        this.ed_titulo = ed_titulo;
        this.ed_descripcion = ed_descripcion;
        this.ed_institucion = ed_institucion;
        this.ed_urllogo = ed_urllogo;
        this.ed_comienzo = ed_comienzo;
        this.ed_final = ed_final;
        this.ed_actual = ed_actual;
        this.ed_tipo = ed_tipo;
    }


   
 

      
    
}
