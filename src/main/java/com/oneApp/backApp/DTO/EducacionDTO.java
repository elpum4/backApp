
package com.oneApp.backApp.DTO;

import java.io.Serializable;
import java.util.Date;
import lombok.Getter;
import lombok.Setter;

@Setter @Getter
        
public class EducacionDTO implements Serializable{
    private Long id;
    private String ed_titulo;
    private String ed_descripcion;
    private String ed_institucion;
    private String ed_urllogo;
    private Date ed_comienzo;
    private Date ed_final;
    private Boolean ed_actual;
    private String ed_tipo;

    public EducacionDTO() {
    }

    public EducacionDTO(Long id, String ed_titulo, String ed_descripcion, String ed_institucion, String ed_urllogo, Date ed_comienzo, Date ed_final, Boolean ed_actual, String ed_tipo) {
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
