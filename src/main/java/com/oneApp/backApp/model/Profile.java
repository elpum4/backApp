package com.oneApp.backApp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Profile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Size(max = 400)
    private String hd_urlbanner;
    @Size(max = 400)
    private String hd_urlperfil;
    private String hd_nombre;
    private String hd_profesion;
    @Size(max = 2500)
    private String hd_sobremi;
    
    public Profile() {
    }

    public Profile(Long id, String hd_urlbanner, String hd_urlperfil, String hd_nombre, String hd_profesion, String hd_sobremi){//, List<Proyecto> user_proyect) {
        this.id = id;
        this.hd_urlbanner = hd_urlbanner;
        this.hd_urlperfil = hd_urlperfil;
        this.hd_nombre = hd_nombre;
        this.hd_profesion = hd_profesion;
        this.hd_sobremi = hd_sobremi;
        //this.user_proyect = user_proyect;
    }

    

     
}
