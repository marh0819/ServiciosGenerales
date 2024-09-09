package com.uceva.serviciosGenerales.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "operario")
public class operario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id_operario;

   /* @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_id_Usuario") // Nombre de la columna FK en la tabla 'operario'*/
    private int fk_id_Usuario; 
}
