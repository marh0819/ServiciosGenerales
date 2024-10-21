package com.uceva.serviciosGenerales.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name ="ubicaciones")
public class ubicacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id_ubicacion;
    private String nombre_ubicacion;
}