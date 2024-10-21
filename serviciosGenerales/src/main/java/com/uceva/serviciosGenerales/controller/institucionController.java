package com.uceva.serviciosGenerales.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.uceva.serviciosGenerales.entity.institucion;
import com.uceva.serviciosGenerales.service.institucionService;

@RestController
@RequestMapping(path = "api/v1/institucion")
public class institucionController {

    @Autowired
    private institucionService institucionService;

    @GetMapping
    public List<institucion> getAll(){
        return institucionService.getInstitucions();
    }

    @GetMapping("/{idInstitucion}")
    public Optional<institucion> getByID(@PathVariable("idInstitucion") Long idInstitucion){
        return institucionService.getInstitucion(idInstitucion);
    }

    @PostMapping()
    public void save(@RequestBody institucion institucion){
        institucionService.save(institucion);
    }

    @PostMapping("/")
    public void update(@RequestBody institucion institucion){
        institucionService.update(institucion);
    }

    @DeleteMapping("/{idInstitucion}")
    public void delete(@PathVariable("idInstitucion") Long idInstitucion){
        institucionService.delete(idInstitucion);
    }
}
