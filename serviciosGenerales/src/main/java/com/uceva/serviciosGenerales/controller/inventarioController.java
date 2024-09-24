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

import com.uceva.serviciosGenerales.entity.inventario;
import com.uceva.serviciosGenerales.service.inventarioService;


@RestController
@RequestMapping(path = "api/v1/inventarios")

public class inventarioController {
    

    @Autowired
    private inventarioService inventarioService;

    @GetMapping
    public List<inventario> getAll(){
        return inventarioService.getInventarios();
    }

    
    @GetMapping("/{id_inventario}")
    public Optional<inventario> getByID(@PathVariable("id_inventario") int id_inventario){
        return inventarioService.getInventario(id_inventario);
    }

    @PostMapping()
    public void save(@RequestBody inventario inventario){
        inventarioService.save(inventario);
    }

    @PostMapping("/")
    public void Update(@RequestBody inventario inventario){
        inventarioService.update(inventario);
    }

    @DeleteMapping("/{id_inventario}")
    public void delete(@PathVariable("id_inventario") int id_inventario){
        inventarioService.delete(id_inventario);
    }
}
