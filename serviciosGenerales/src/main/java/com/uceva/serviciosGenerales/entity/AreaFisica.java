package com.uceva.serviciosGenerales.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name ="areas_fisicas")
public class AreaFisica {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id_area_fisica;
    private int id_tipo_espacio; 
    private int instituciones_idInstitucion;
    private int ubicaciones_id_ubicacion;
    private String Dimensiones;
    private String Caracteristica;
    private String Fecha_Creacion;
    private String nombre_area;
    private String Estado;
}