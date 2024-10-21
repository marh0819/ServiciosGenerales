package com.uceva.serviciosGenerales.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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

    
    @GetMapping("/{id_area_fisica}")
    public Optional<AreaFisica> getByID(@PathVariable("id_area_fisica") int id_area_fisica){
        return areaFisicaService.getAreaFisica(id_area_fisica);
    }

    @PostMapping("/crear")
public ResponseEntity<AreaFisica> save(@RequestBody AreaFisica areaFisica){
    try {
        AreaFisica savedArea = areaFisicaService.save(areaFisica);
        return new ResponseEntity<>(savedArea, HttpStatus.CREATED);
    } catch (Exception e) {
        return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    }
}

    @PostMapping("/")
    public void Update(@RequestBody AreaFisica areaFisica){
        areaFisicaService.update(areaFisica);
    }

    @DeleteMapping("/{id_area_fisica}")
    public void delete(@PathVariable("id_area_fisica") int id_area_fisica){
        areaFisicaService.delete(id_area_fisica);
    }
}
