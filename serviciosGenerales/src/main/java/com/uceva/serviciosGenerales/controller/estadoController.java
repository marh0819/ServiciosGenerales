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

import com.uceva.serviciosGenerales.entity.estado;
import com.uceva.serviciosGenerales.service.estadoService;


@RestController
@RequestMapping(path = "api/v1/estados")

public class estadoController {
    

    @Autowired
    private estadoService estadoService;

    @GetMapping
    public List<estado> getAll(){
        return estadoService.getEstados();
    }

    
    @GetMapping("/{idestados}")
    public Optional<estado> getByID(@PathVariable("idestados") int idestados){
        return estadoService.getEstado(idestados);
    }

    @PostMapping()
    public void save(@RequestBody estado estado){
        estadoService.save(estado);
    }

    @PostMapping("/")
    public void Update(@RequestBody estado estado){
        estadoService.update(estado);
    }

    @DeleteMapping("/{idestados}")
    public void delete(@PathVariable("idestados") int idestados){
        estadoService.delete(idestados);
    }
}
