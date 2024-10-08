package com.uceva.serviciosGenerales.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uceva.serviciosGenerales.entity.operario;
import com.uceva.serviciosGenerales.repository.operarioRepository;

@Service
public class operarioService {
    @Autowired
    operarioRepository operarioRepository;

    public List<operario> getOperarios(){
        return operarioRepository.findAll();
    }

    public Optional<operario> getOperarios(int id){
        return operarioRepository.findById(Long.valueOf (id));
    }

    public void save(operario operario){
        operarioRepository.save(operario);
    }

    public void update(operario operario){
        operarioRepository.save(operario);
    }

    public void delete(int id){
        operarioRepository.deleteById(Long.valueOf (id));
    }
}
