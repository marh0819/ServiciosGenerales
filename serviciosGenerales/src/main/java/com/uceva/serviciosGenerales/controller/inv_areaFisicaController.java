package com.uceva.serviciosGenerales.controller;

import java.util.List;
import java.util.Map;
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
import com.uceva.serviciosGenerales.entity.inv_areaFisica;
import com.uceva.serviciosGenerales.service.areaFisicaService;
import com.uceva.serviciosGenerales.service.inv_areaFisicaService;

@RestController
@RequestMapping(path = "api/v1/inv_areaFisicas")
public class inv_areaFisicaController {

    @Autowired
    private inv_areaFisicaService inv_areaFisicaService;

    @Autowired
    private areaFisicaService areaFisicaService;

    @GetMapping
    public ResponseEntity<List<inv_areaFisica>> getAll() {
        List<inv_areaFisica> areasFisicas = inv_areaFisicaService.getInv_areaFisicas();
        return ResponseEntity.ok(areasFisicas);
    }

    @GetMapping("/{id_inventario_area_fisica}")
    public ResponseEntity<Optional<inv_areaFisica>> getByID(@PathVariable("id_inventario_area_fisica") int idInventarioAreaFisica) {
        Optional<inv_areaFisica> areaFisica = inv_areaFisicaService.getInv_areaFisica(idInventarioAreaFisica);
        if (areaFisica.isPresent()) {
            return ResponseEntity.ok(areaFisica);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/area/{areas_fisicas_EspacioID}")
    public ResponseEntity<List<inv_areaFisica>> getByAreaFisicaID(@PathVariable("areas_fisicas_EspacioID") int areasFisicasEspacioID) {
        List<inv_areaFisica> areasFisicas = inv_areaFisicaService.findByAreaFisicaID(areasFisicasEspacioID);
        if (!areasFisicas.isEmpty()) {
            return ResponseEntity.ok(areasFisicas);
        } else {
            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
        }
    }

    @PostMapping
    public ResponseEntity<?> save(@RequestBody inv_areaFisica invAreaFisica) {
    // Verificar si el área física ya existe
    int areaFisicaId = invAreaFisica.getAreasFisicasEspacioID();
    System.out.println("Verificando existencia del área física con ID: " + areaFisicaId);
    
    Optional<AreaFisica> areaFisica = areaFisicaService.getAreaFisica(areaFisicaId);
    
    if (areaFisica.isPresent()) {
        System.out.println("Área física encontrada: " + areaFisicaId);
        inv_areaFisicaService.save(invAreaFisica);
        return ResponseEntity.status(HttpStatus.CREATED).body(invAreaFisica);
    } else {
        System.out.println("Área física no encontrada: " + areaFisicaId);
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("El área física especificada no existe. Primero crea el área física.");
    }
}


    @PutMapping("/{id_inventario_area_fisica}")
    public ResponseEntity<inv_areaFisica> updateCantidad(
        @PathVariable("id_inventario_area_fisica") int idInventarioAreaFisica,
        @RequestBody Map<String, Object> updates) {

        Optional<inv_areaFisica> optionalInvAreaFisica = inv_areaFisicaService.getInv_areaFisica(idInventarioAreaFisica);

        if (optionalInvAreaFisica.isPresent()) {
            inv_areaFisica invAreaFisica = optionalInvAreaFisica.get();

            if (updates.containsKey("cantidad")) {
                invAreaFisica.setCantidad((Integer) updates.get("cantidad"));
            }

            inv_areaFisicaService.update(invAreaFisica);
            return ResponseEntity.ok(invAreaFisica);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id_inventario_area_fisica}")
    public ResponseEntity<Void> delete(@PathVariable("id_inventario_area_fisica") int idInventarioAreaFisica) {
        inv_areaFisicaService.delete(idInventarioAreaFisica);
        return ResponseEntity.noContent().build();
    }
}
