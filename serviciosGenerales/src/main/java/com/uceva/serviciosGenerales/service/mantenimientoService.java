package com.uceva.serviciosGenerales.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uceva.serviciosGenerales.entity.mantenimiento;
import com.uceva.serviciosGenerales.repository.mantenimientoRespository;

@Service
public class mantenimientoService {
    @Autowired
    mantenimientoRespository mantenimientoRespository;

    public List<mantenimiento> getMantenimientos(){
        return mantenimientoRespository.findAll();
    }

    public Optional<mantenimiento> getMantenimientos(int id){
        return mantenimientoRespository.findById(Long.valueOf (id));
    }

    public void save(mantenimiento mantenimiento){
        mantenimientoRespository.save(mantenimiento);
    }

    public void update(mantenimiento mantenimiento){
        mantenimientoRespository.save(mantenimiento);
    }

    public void delete(int id){
        mantenimientoRespository.deleteById(Long.valueOf (id));
    }
}
