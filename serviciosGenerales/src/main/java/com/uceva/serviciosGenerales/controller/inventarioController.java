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

import com.uceva.serviciosGenerales.entity.inventario;
import com.uceva.serviciosGenerales.service.inventarioService;

@RestController
@RequestMapping(path = "api/v1/inventarios")
public class inventarioController {

    @Autowired
    private inventarioService inventarioService;

    @GetMapping
    public List<inventario> getAll() {
        return inventarioService.getInventarios();
    }

    @GetMapping("/{id_inventario}")
    public Optional<inventario> getByID(@PathVariable("id_inventario") int idInventario) {
        return inventarioService.getInventario(idInventario);
    }

    @PostMapping
public ResponseEntity<String> save(@RequestBody inventario inventario) {
    try {
        if (inventario.getNombreObjeto() == null || inventario.getDescripcionObjeto() == null || inventario.getCantidad() <= 0) {
            return ResponseEntity.badRequest().body("El nombre, la descripción y la cantidad no pueden ser nulos ni cero.");
        }
        inventarioService.save(inventario);
        return ResponseEntity.status(HttpStatus.CREATED).body("Inventario creado con éxito");
    } catch (Exception e) {
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error al crear el inventario");
    }
}

@PutMapping("/{id_inventario}")
public ResponseEntity<String> update(@PathVariable("id_inventario") int idInventario, @RequestBody inventario inventario) {
    try {
        inventario.setIdInventario(idInventario);
        inventarioService.update(inventario);
        return ResponseEntity.ok("Inventario actualizado con éxito");
    } catch (Exception e) {
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error al actualizar el inventario");
    }
}


    @DeleteMapping("/{id_inventario}")
    public void delete(@PathVariable("id_inventario") int idInventario) {
        inventarioService.delete(idInventario);
    }
}
