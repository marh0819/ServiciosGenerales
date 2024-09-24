package com.uceva.serviciosGenerales.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name ="estados")
public class estado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int idestados;
    
    private String terminado;
    private String proceso;
    private String pendiente;
}