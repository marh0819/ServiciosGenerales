package com.uceva.serviciosGenerales.controller;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.uceva.serviciosGenerales.entity.ubicacion;
import com.uceva.serviciosGenerales.service.ubicacionService;


@RestController
@RequestMapping(path = "api/v1/ubicaciones")

public class ubicacionController {
    

    @Autowired
    private ubicacionService ubicacionService;

    @GetMapping
    public List<ubicacion> getAll(){
        return ubicacionService.getUbicaciones();
    }

    
    @GetMapping("/{id_ubicacion}")
    public Optional<ubicacion> getByID(@PathVariable("id_ubicacion") int id_ubicacion){
        return ubicacionService.getUbicacion(id_ubicacion);
    }

    @PostMapping()
    public void save(@RequestBody ubicacion ubicacion){
        ubicacionService.save(ubicacion);
    }

    @PostMapping("/")
    public void Update(@RequestBody ubicacion ubicacion){
        ubicacionService.update(ubicacion);
    }

    @DeleteMapping("/{id_ubicacion}")
    public void delete(@PathVariable("id_ubicacion") int id_ubicacion){
        ubicacionService.delete(id_ubicacion);
    }
}
