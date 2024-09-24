package com.uceva.serviciosGenerales.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uceva.serviciosGenerales.entity.inventario;

public interface inventarioRepository extends JpaRepository<inventario, Long>{
    
}