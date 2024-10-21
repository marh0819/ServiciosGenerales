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

import com.uceva.serviciosGenerales.entity.tipo_espacio;
import com.uceva.serviciosGenerales.service.tipo_espacioService;


@RestController
@RequestMapping(path = "api/v1/tipoEspacios")

public class tipo_espacioController {
    

    @Autowired
    private tipo_espacioService tipo_espacioService;

    @GetMapping
    public List<tipo_espacio> getAll(){
        return tipo_espacioService.getTipo_espacios();
    }

    
    @GetMapping("/{idtipo_espacio}")
    public Optional<tipo_espacio> getByID(@PathVariable("idtipo_espacio") int idtipo_espacio){
        return tipo_espacioService.getTipo_espacio(idtipo_espacio);
    }

    @PostMapping()
    public void save(@RequestBody tipo_espacio tipo_espacio){
        tipo_espacioService.save(tipo_espacio);
    }

    @PostMapping("/")
    public void Update(@RequestBody tipo_espacio tipo_espacio){
        tipo_espacioService.update(tipo_espacio);
    }

    @DeleteMapping("/{idtipo_espacio}")
    public void delete(@PathVariable("idtipo_espacio") int idtipo_espacio){
        tipo_espacioService.delete(idtipo_espacio);
    }
}
