package com.uceva.serviciosGenerales.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.uceva.serviciosGenerales.entity.mantenimiento;


@Repository
public interface mantenimientoRespository extends JpaRepository<mantenimiento, Long>{
    
}
