package com.uceva.serviciosGenerales.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name ="usuario")
public class usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id_usuario;
    private String nombre;
    private String apellido;
    private String telefono;
    private String categoria;
    
}
