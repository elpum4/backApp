
package com.oneApp.backApp.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Size;
import javax.persistence.JoinColumn;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Proyecto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String proy_titulo;
    @Size(max = 400)
    private String proy_descripcion;
    @Size(max = 200)
    private String proy_url;
    private String proy_cliente;
    @Size(max = 200)
    private String proy_urlimg;
    @JoinColumn(name = "proy_categoria", nullable = false)
    @ManyToOne(optional = false, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private TipoProyecto proy_categoria;

    public Proyecto() {
    }

    public Proyecto(Long id, String proy_titulo, 
            String proy_descripcion, 
            String proy_url, 
            String proy_cliente, 
            String proy_urlimg, 
            TipoProyecto proy_categoria) 
    {
        this.id = id;
        this.proy_titulo = proy_titulo;
        this.proy_descripcion = proy_descripcion;
        this.proy_url = proy_url;
        this.proy_cliente = proy_cliente;
        this.proy_urlimg = proy_urlimg;
        this.proy_categoria = proy_categoria;
    }  
}
