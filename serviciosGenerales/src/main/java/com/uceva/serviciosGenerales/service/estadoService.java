package com.uceva.serviciosGenerales.service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uceva.serviciosGenerales.entity.estado;
import com.uceva.serviciosGenerales.repository.estadoRepository;

@Service
public class estadoService {
    @Autowired
    estadoRepository estadoRepository;

    public List<estado> getEstados(){
        return estadoRepository.findAll();
    }

    public Optional<estado> getEstado(int id){
        return estadoRepository.findById(Long.valueOf (id));
    }

    public void save(estado Estado){
        estadoRepository.save(Estado);
    }

    public void update(estado Estado){
        estadoRepository.save(Estado);
    }

    public void delete(int id){
        estadoRepository.deleteById(Long.valueOf (id));
    }
}

