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

import com.uceva.serviciosGenerales.entity.mantenimiento;
import com.uceva.serviciosGenerales.service.mantenimientoService;

@RestController
@RequestMapping(path = "api/v1/mantenimientos")
public class mantenimientoController {
    

    @Autowired
    private mantenimientoService mantenimientoService;

    @GetMapping
    public List<mantenimiento> getAll(){
        return mantenimientoService.getMantenimientos();
    }

    
    @GetMapping("/{ID_Mantenimiento}")
    public Optional<mantenimiento> getByID(@PathVariable("ID_Mantenimiento") int ID_Mantenimiento){
        return mantenimientoService.getMantenimientos(ID_Mantenimiento);
    }

    @PostMapping()
    public void save(@RequestBody mantenimiento mantenimiento){
        mantenimientoService.save(mantenimiento);
    }

    @PostMapping("/")
    public void Update(@RequestBody mantenimiento mantenimiento){
        mantenimientoService.update(mantenimiento);
    }

    @DeleteMapping("/{ID_Mantenimiento}")
    public void delete(@PathVariable("ID_Mantenimiento") int ID_Mantenimiento){
        mantenimientoService.delete(ID_Mantenimiento);
    }


}
