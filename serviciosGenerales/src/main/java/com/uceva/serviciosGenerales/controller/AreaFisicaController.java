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
import org.springframework.web.bind.annotation.PutMapping;
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

    // Obtener todas las áreas físicas
    @GetMapping
    public List<AreaFisica> getAll() {
        return areaFisicaService.getAreaFisicas();
    }

    // Obtener un área física por ID
    @GetMapping("/{id_area_fisica}")
    public Optional<AreaFisica> getByID(@PathVariable("id_area_fisica") int id_area_fisica) {
        return areaFisicaService.getAreaFisica(id_area_fisica);
    }

    // Guardar un área física
    @PostMapping  
    public ResponseEntity<AreaFisica> save(@RequestBody AreaFisica areaFisica) {
        try {
            // Acceder a los objetos relacionados para validar
            System.out.println("Ubicación ID: " + areaFisica.getUbicacion().getId_ubicacion());
            System.out.println("Institución ID: " + areaFisica.getInstitucion().getIdInstitucion());
            System.out.println("Tipo de Espacio ID: " + areaFisica.getTipoEspacio().getIdtipo_espacio());
            
            AreaFisica savedArea = areaFisicaService.save(areaFisica);
            return new ResponseEntity<>(savedArea, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    // Actualizar un área física
    @PutMapping("/{id_area_fisica}")
    public ResponseEntity<AreaFisica> update(@PathVariable("id_area_fisica") int id_area_fisica, @RequestBody AreaFisica areaFisica) {
        try {
            // Asignar el ID del área física para asegurar que estamos actualizando el correcto
            areaFisica.setId_area_fisica(id_area_fisica);
            
            AreaFisica updatedArea = areaFisicaService.update(areaFisica);
            return new ResponseEntity<>(updatedArea, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    // Eliminar un área física por ID
    @DeleteMapping("/{id_area_fisica}")
    public void delete(@PathVariable("id_area_fisica") int id_area_fisica) {
        areaFisicaService.delete(id_area_fisica);
    }
}
