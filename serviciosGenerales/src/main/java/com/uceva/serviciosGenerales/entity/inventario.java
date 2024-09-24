package com.uceva.serviciosGenerales.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name ="inventarios")
public class inventario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id_inventario;
    private String nombre_objeto;
    private String Descripcion_objeto;
    private String cantidad;
}