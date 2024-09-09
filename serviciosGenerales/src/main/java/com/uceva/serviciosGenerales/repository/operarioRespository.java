package com.uceva.serviciosGenerales.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.uceva.serviciosGenerales.entity.operario;

@Repository
public interface operarioRespository extends JpaRepository<operario, Long>{
    
}
