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

import com.uceva.serviciosGenerales.entity.usuario;
import com.uceva.serviciosGenerales.service.usuarioService;

@RestController
@RequestMapping(path = "api/v1/usuarios")
public class usuarioController {
    

    @Autowired
    private usuarioService usuarioService;

    @GetMapping
    public List<usuario> getAll(){
        return usuarioService.getUsuarios();
    }

    //
    @GetMapping("/{id_usuario}")
    public Optional<usuario> getByID(@PathVariable("id_usuario") int id_usuario){
        return usuarioService.getUsuario(id_usuario);
    }

    @PostMapping()
    public void save(@RequestBody usuario usuario){
        usuarioService.save(usuario);
    }

    @PostMapping("/")
    public void Update(@RequestBody usuario usuario){
        usuarioService.update(usuario);
    }

    @DeleteMapping("/{id_usuario}")
    public void delete(@PathVariable("id_usuario") int id_usuario){
        usuarioService.delete(id_usuario);
    }


}
