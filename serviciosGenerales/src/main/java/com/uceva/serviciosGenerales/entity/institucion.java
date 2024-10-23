package com.uceva.serviciosGenerales.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name ="instituciones")
public class institucion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idInstitucion")
    private Long idInstitucion;

    @Column(name = "Nombre")
    private String nombre;

    @Column(name = "Nit")
    private String nit;

    @Column(name = "Direccion")
    private String direccion;

    @Column(name = "Correo")
    private String correo;

    @Column(name = "Telefono")
    private String telefono;

    // Genera manualmente el getter
    public Long getIdInstitucion() {
        return idInstitucion;
    }

    // Si lo prefieres, puedes agregar también el setter
    public void setIdInstitucion(Long idInstitucion) {
        this.idInstitucion = idInstitucion;
    }
}
