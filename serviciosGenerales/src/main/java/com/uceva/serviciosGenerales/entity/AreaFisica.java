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

    private int EspacioID;

    private String Dimensiones;
    private String Ubicacion;
    private String Caracteristica;
    private String Fecha_Creacion;
    private String Nombre_Espacio;
    private String Estado;
}