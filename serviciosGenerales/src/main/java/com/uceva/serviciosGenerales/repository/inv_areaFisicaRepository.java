package com.uceva.serviciosGenerales.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uceva.serviciosGenerales.entity.inv_areaFisica;

public interface inv_areaFisicaRepository extends JpaRepository<inv_areaFisica, Long> {
    
    // Método para encontrar registros por areas_fisicas_EspacioID
    List<inv_areaFisica> findByAreasFisicasEspacioID(int areasFisicasEspacioID);
}
