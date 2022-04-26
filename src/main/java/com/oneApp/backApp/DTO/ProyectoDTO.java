
package com.oneApp.backApp.DTO;

import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;

@Setter @Getter
        
public class ProyectoDTO implements Serializable{
    private Long id;
    private String proy_titulo;
    private String proy_descripcion;
    private String proy_url;
    private String proy_cliente;
    private String proy_urlimg;
    private String proy_categoria;

    public ProyectoDTO() {
    }

    public ProyectoDTO(Long id, String proy_titulo, String proy_descripcion, String proy_url, String proy_cliente, String proy_urlimg, String proy_categoria) {
        this.id = id;
        this.proy_titulo = proy_titulo;
        this.proy_descripcion = proy_descripcion;
        this.proy_url = proy_url;
        this.proy_cliente = proy_cliente;
        this.proy_urlimg = proy_urlimg;
        this.proy_categoria = proy_categoria;
    }

    
    
}
