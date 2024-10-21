package com.uceva.serviciosGenerales.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name ="tipo_espacios")
public class tipo_espacio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int idtipo_espacio;
    private String nombre_espacio;
    private String ubicacion;
}