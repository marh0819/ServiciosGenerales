package com.uceva.serviciosGenerales.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uceva.serviciosGenerales.entity.AreaFisica;
import com.uceva.serviciosGenerales.repository.areaFisicaRepository;

@Service
public class areaFisicaService {
    @Autowired
    areaFisicaRepository areaFisicaRepository;

    public List<AreaFisica> getAreaFisicas(){
        return areaFisicaRepository.findAll();
    }

    public Optional<AreaFisica> getAreaFisica(int id){
        return areaFisicaRepository.findById(Long.valueOf (id));
    }

    public void save(AreaFisica AreaFisica){
        areaFisicaRepository.save(AreaFisica);
    }

    public void update(AreaFisica AreaFisica){
        areaFisicaRepository.save(AreaFisica);
    }

    public void delete(int id){
        areaFisicaRepository.deleteById(Long.valueOf (id));
    }
}

