package com.uceva.serviciosGenerales.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uceva.serviciosGenerales.entity.operario;
import com.uceva.serviciosGenerales.repository.operarioRespository;

@Service
public class operarioService {
    @Autowired
    operarioRespository operarioRespository;

    public List<operario> getOperarios(){
        return operarioRespository.findAll();
    }

    public Optional<operario> getOperarios(int id){
        return operarioRespository.findById(Long.valueOf (id));
    }

    public void save(operario operario){
        operarioRespository.save(operario);
    }

    public void update(operario operario){
        operarioRespository.save(operario);
    }

    public void delete(int id){
        operarioRespository.deleteById(Long.valueOf (id));
    }
}
