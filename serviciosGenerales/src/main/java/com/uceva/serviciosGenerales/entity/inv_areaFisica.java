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
@Table(name ="inventario_areas_fisicas")
public class inv_areaFisica {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id_inventario_area_fisica;
    
    private int cantidad;

    @Column(name = "areas_fisicas_EspacioID")
    private int areasFisicasEspacioID;

    private int inventarios_id_inventario;
}

