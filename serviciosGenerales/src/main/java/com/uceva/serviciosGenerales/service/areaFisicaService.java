/*package com.uceva.serviciosGenerales.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uceva.serviciosGenerales.entity.AreaFisica;
import com.uceva.serviciosGenerales.repository.areaFisicaRepository;

@Service
public class areaFisicaService {
    @Autowired
    areaFisicaRepository areaFisicaRepository;

    public List<AreaFisica> getAreaFisicas(){
        return areaFisicaRepository.findAll();
    }

    public Optional<AreaFisica> getAreaFisica(int id){
        return areaFisicaRepository.findById(Long.valueOf (id));
    }

    public AreaFisica save(AreaFisica AreaFisica){
        return areaFisicaRepository.save(AreaFisica);
    }

    public void update(AreaFisica AreaFisica){
        areaFisicaRepository.save(AreaFisica);
    }

    public void delete(int id){
        areaFisicaRepository.deleteById(Long.valueOf (id));
    }
}

*/


package com.uceva.serviciosGenerales.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uceva.serviciosGenerales.entity.AreaFisica;
import com.uceva.serviciosGenerales.repository.areaFisicaRepository;

@Service
public class areaFisicaService {

    @Autowired
    areaFisicaRepository areaFisicaRepository;

    // Método para obtener todas las áreas físicas
    public List<AreaFisica> getAreaFisicas() {
        return areaFisicaRepository.findAll();
    }

    // Método para obtener una área física por ID
    public Optional<AreaFisica> getAreaFisica(int id) {
        return areaFisicaRepository.findById(Long.valueOf(id));
    }

    // Método para guardar una nueva área física
    public AreaFisica save(AreaFisica areaFisica) {
        return areaFisicaRepository.save(areaFisica);
    }

    // Método para actualizar una área física existente
    public AreaFisica update(AreaFisica areaFisica) {
        Optional<AreaFisica> existingAreaOpt = areaFisicaRepository.findById(Long.valueOf(areaFisica.getId_area_fisica()));

        if (existingAreaOpt.isPresent()) {
            AreaFisica existingArea = existingAreaOpt.get();

            // Actualizamos los campos con los valores nuevos
            existingArea.setDimensiones(areaFisica.getDimensiones());
            existingArea.setCaracteristica(areaFisica.getCaracteristica());
            existingArea.setNombre_area(areaFisica.getNombre_area());
            existingArea.setEstado(areaFisica.getEstado());
            existingArea.setTipoEspacio(areaFisica.getTipoEspacio());
            existingArea.setUbicacion(areaFisica.getUbicacion());
            existingArea.setInstitucion(areaFisica.getInstitucion());

            // Guardamos la entidad actualizada
            return areaFisicaRepository.save(existingArea);
        } else {
            // Si no se encuentra el área física, lanzamos una excepción o lo manejamos de otra manera
            throw new RuntimeException("Área física no encontrada");
        }
    }

    // Método para eliminar una área física por ID
    public void delete(int id) {
        areaFisicaRepository.deleteById(Long.valueOf(id));
    }
}
