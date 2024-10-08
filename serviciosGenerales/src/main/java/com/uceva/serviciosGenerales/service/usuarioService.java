package com.uceva.serviciosGenerales.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uceva.serviciosGenerales.entity.usuario;
import com.uceva.serviciosGenerales.repository.usuarioRepository;

@Service
public class usuarioService {
    @Autowired
    usuarioRepository usuarioRespository;

    public List<usuario> getUsuarios(){
        return usuarioRespository.findAll();
    }

    public Optional<usuario> getUsuario(int id){
        return usuarioRespository.findById(Long.valueOf (id));
    }

    public void save(usuario usuario){
        usuarioRespository.save(usuario);
    }

    public void update(usuario usuario){
        usuarioRespository.save(usuario);
    }

    public void delete(int id){
        usuarioRespository.deleteById(Long.valueOf (id));
    }
}
