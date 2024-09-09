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

import com.uceva.serviciosGenerales.entity.operario;
import com.uceva.serviciosGenerales.service.operarioService;

@RestController
@RequestMapping(path = "api/v1/operarios")
public class operarioController {
    

    @Autowired
    private operarioService operarioService;

    @GetMapping
    public List<operario> getAll(){
        return operarioService.getOperarios();
    }

    
    @GetMapping("/{id_operario}")
    public Optional<operario> getByID(@PathVariable("id_operario") int id_operario){
        return operarioService.getOperarios(id_operario);
    }

    @PostMapping()
    public void save(@RequestBody operario operario){
        operarioService.save(operario);
    }

    @PostMapping("/")
    public void Update(@RequestBody operario operario){
        operarioService.update(operario);
    }

    @DeleteMapping("/{id_operario}")
    public void delete(@PathVariable("id_operario") int id_operario){
        operarioService.delete(id_operario);
    }


}
