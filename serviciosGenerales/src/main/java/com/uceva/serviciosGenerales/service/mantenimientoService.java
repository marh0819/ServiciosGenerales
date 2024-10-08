package com.uceva.serviciosGenerales.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uceva.serviciosGenerales.entity.mantenimiento;
import com.uceva.serviciosGenerales.repository.mantenimientoRepository;

@Service
public class mantenimientoService {
    @Autowired
    mantenimientoRepository mantenimientoRepository;

    public List<mantenimiento> getMantenimientos(){
        return mantenimientoRepository.findAll();
    }

    public Optional<mantenimiento> getMantenimientos(int id){
        return mantenimientoRepository.findById(Long.valueOf (id));
    }

    public void save(mantenimiento mantenimiento){
        mantenimientoRepository.save(mantenimiento);
    }

    public void update(mantenimiento mantenimiento){
        mantenimientoRepository.save(mantenimiento);
    }

    public void delete(int id){
        mantenimientoRepository.deleteById(Long.valueOf (id));
    }
}
