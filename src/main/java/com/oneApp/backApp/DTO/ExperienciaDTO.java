
package com.oneApp.backApp.DTO;

import java.io.Serializable;
import java.util.Date;
import lombok.Getter;
import lombok.Setter;

@Setter @Getter
        
public class ExperienciaDTO implements Serializable{
	
    private Long id;
    private String exp_titulo;
    private String exp_descripcion;
    private String exp_sitio;
    private String ex_urllogo;
    private Date exp_comienzo;
    private Date exp_final;
    private Boolean exp_actual;
    private String exp_tipo;

    public ExperienciaDTO() {
    }

    public ExperienciaDTO(Long id, String exp_titulo, String exp_descripcion, String exp_sitio, String ex_urllogo, Date exp_comienzo, Date exp_final, Boolean exp_actual, String exp_tipo) {
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
