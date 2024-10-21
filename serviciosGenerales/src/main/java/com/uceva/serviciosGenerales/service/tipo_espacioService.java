package com.uceva.serviciosGenerales.service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uceva.serviciosGenerales.entity.tipo_espacio;
import com.uceva.serviciosGenerales.repository.tipo_espacioRepository;

@Service
public class tipo_espacioService {
    @Autowired
    tipo_espacioRepository tipo_espacioRepository;

    public List<tipo_espacio> getTipo_espacios(){
        return tipo_espacioRepository.findAll();
    }

    public Optional<tipo_espacio> getTipo_espacio(int id){
        return tipo_espacioRepository.findById(Long.valueOf (id));
    }

    public void save(tipo_espacio Tipo_espacio){
        tipo_espacioRepository.save(Tipo_espacio);
    }

    public void update(tipo_espacio Tipo_espacio){
        tipo_espacioRepository.save(Tipo_espacio);
    }

    public void delete(int id){
        tipo_espacioRepository.deleteById(Long.valueOf (id));
    }
}

