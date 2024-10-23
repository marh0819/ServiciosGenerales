package com.uceva.serviciosGenerales.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "areas_fisicas")
public class AreaFisica {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_area_fisica;

    @ManyToOne
    @JoinColumn(name = "id_tipo_espacio", referencedColumnName = "idtipo_espacio")
    private tipo_espacio tipoEspacio; // Relación con TipoEspacio

    @ManyToOne
    @JoinColumn(name = "instituciones_idInstitucion", referencedColumnName = "idInstitucion")
    private institucion institucion; // Relación con Institucion

    @ManyToOne
    @JoinColumn(name = "ubicaciones_id_ubicacion", referencedColumnName = "id_ubicacion")
    private ubicacion ubicacion; // Relación con Ubicacion

    private String dimensiones;
    private String caracteristica;
    private String fecha_Creacion;
    private String nombre_area;
    private String estado;
}
