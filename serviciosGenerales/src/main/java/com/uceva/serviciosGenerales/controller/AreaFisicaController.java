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

import com.uceva.serviciosGenerales.entity.AreaFisica;
import com.uceva.serviciosGenerales.service.areaFisicaService;


@RestController
@RequestMapping(path = "api/v1/areasFisicas")

public class AreaFisicaController {
    

    @Autowired
    private areaFisicaService areaFisicaService;

    @GetMapping
    public List<AreaFisica> getAll(){
        return areaFisicaService.getAreaFisicas();
    }

    
    @GetMapping("/{EspacioID}")
    public Optional<AreaFisica> getByID(@PathVariable("EspacioID") int EspacioID){
        return areaFisicaService.getAreaFisica(EspacioID);
    }

    @PostMapping()
    public void save(@RequestBody AreaFisica areaFisica){
        areaFisicaService.save(areaFisica);
    }

    @PostMapping("/")
    public void Update(@RequestBody AreaFisica areaFisica){
        areaFisicaService.update(areaFisica);
    }

    @DeleteMapping("/{EspacioID}")
    public void delete(@PathVariable("EspacioID") int EspacioID){
        areaFisicaService.delete(EspacioID);
    }
}
