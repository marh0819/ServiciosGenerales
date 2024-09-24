package com.uceva.serviciosGenerales.service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uceva.serviciosGenerales.entity.inventario;
import com.uceva.serviciosGenerales.repository.inventarioRepository;

@Service
public class inventarioService {
    @Autowired
    inventarioRepository inventarioRepository;

    public List<inventario> getInventarios(){
        return inventarioRepository.findAll();
    }

    public Optional<inventario> getInventario(int id){
        return inventarioRepository.findById(Long.valueOf (id));
    }

    public void save(inventario Inventario){
        inventarioRepository.save(Inventario);
    }

    public void update(inventario Inventario){
        inventarioRepository.save(Inventario);
    }

    public void delete(int id){
        inventarioRepository.deleteById(Long.valueOf (id));
    }
}

