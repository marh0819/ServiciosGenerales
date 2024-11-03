package com.uceva.serviciosGenerales.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uceva.serviciosGenerales.entity.inv_areaFisica;
import com.uceva.serviciosGenerales.repository.inv_areaFisicaRepository;

@Service
public class inv_areaFisicaService {

    @Autowired
    private inv_areaFisicaRepository inv_areaFisicaRepository;

    public List<inv_areaFisica> getInv_areaFisicas() {
        return inv_areaFisicaRepository.findAll();
    }

    public Optional<inv_areaFisica> getInv_areaFisica(int id) {
        return inv_areaFisicaRepository.findById(Long.valueOf(id));
    }

    public List<inv_areaFisica> findByAreaFisicaID(int areasFisicasEspacioID) {
        return inv_areaFisicaRepository.findByAreasFisicasEspacioID(areasFisicasEspacioID);
    }

    public inv_areaFisica save(inv_areaFisica inv_areaFisica) {
        return inv_areaFisicaRepository.save(inv_areaFisica);
    }

    public inv_areaFisica update(inv_areaFisica inv_areaFisica) {
        return inv_areaFisicaRepository.save(inv_areaFisica);
    }

    public void delete(int id) {
        inv_areaFisicaRepository.deleteById(Long.valueOf(id));
    }
}


