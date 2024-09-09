package com.uceva.serviciosGenerales.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name ="mantenimiento")
public class mantenimiento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int ID_Mantenimiento;
    private String actividades;
    private String nombre_Mantenimiento;
    private String fechaInicio;
    private String fechaFin;
    private String estadoManteminento;
    private int prioridadMantenimiento;
    private String descripcionMantenimiento;
    private int fk_id_AreasFisicas;
    private int fk_ID_Operario;
    
}
