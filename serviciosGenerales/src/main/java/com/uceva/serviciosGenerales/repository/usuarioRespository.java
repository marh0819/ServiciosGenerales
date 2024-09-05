package com.uceva.serviciosGenerales.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.uceva.serviciosGenerales.entity.usuario;

@Repository
public interface usuarioRespository extends JpaRepository<usuario, Long>{
    
}
