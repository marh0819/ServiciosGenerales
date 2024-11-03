/*
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
    private String descripcion_objeto;
    private String cantidad;
}

*/
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
@Table(name = "inventarios")
public class inventario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_inventario")
    private int idInventario;

    @Column(name = "nombre_objeto", nullable = false)
    private String nombreObjeto;

    @Column(name = "descripcion_objeto", nullable = false)
    private String descripcionObjeto;

    @Column(name = "cantidad", nullable = false)
    private int cantidad;
}
