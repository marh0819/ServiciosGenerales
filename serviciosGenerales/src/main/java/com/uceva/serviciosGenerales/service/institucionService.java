package com.uceva.serviciosGenerales.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uceva.serviciosGenerales.entity.institucion;
import com.uceva.serviciosGenerales.repository.institucionRepository;

@Service
public class institucionService {
    @Autowired
    institucionRepository institucionRepository;

    public List<institucion> getInstitucions(){
        return institucionRepository.findAll();
    }

    public Optional<institucion> getInstitucion(Long id){
        return institucionRepository.findById(id);
    }

    public void save(institucion institucion){
        institucionRepository.save(institucion);
    }

    public void update(institucion institucion){
        institucionRepository.save(institucion);
    }

    public void delete(Long id){
        institucionRepository.deleteById(id);
    }
}
