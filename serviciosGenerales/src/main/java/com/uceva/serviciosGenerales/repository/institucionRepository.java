package com.uceva.serviciosGenerales.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.uceva.serviciosGenerales.entity.institucion;

@Repository
public interface institucionRepository extends JpaRepository<institucion, Long>{
    
}