package com.uceva.serviciosGenerales.service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uceva.serviciosGenerales.entity.ubicacion;
import com.uceva.serviciosGenerales.repository.ubicacionRepository;

@Service
public class ubicacionService {
    @Autowired
    ubicacionRepository ubicacionRepository;

    public List<ubicacion> getUbicaciones(){
        return ubicacionRepository.findAll();
    }

    public Optional<ubicacion> getUbicacion(int id){
        return ubicacionRepository.findById(Long.valueOf (id));
    }

    public void save(ubicacion Ubicacion){
        ubicacionRepository.save(Ubicacion);
    }

    public void update(ubicacion Ubicacion){
        ubicacionRepository.save(Ubicacion);
    }

    public void delete(int id){
        ubicacionRepository.deleteById(Long.valueOf (id));
    }
}

