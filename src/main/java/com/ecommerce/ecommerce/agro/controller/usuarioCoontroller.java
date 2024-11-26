package com.ecommerce.ecommerce.agro.controller;


import com.ecommerce.ecommerce.agro.model.usuario;
import com.ecommerce.ecommerce.agro.repository.usuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/usuario")
public class usuarioCoontroller {

    @Autowired
    private usuarioRepository repository;

    @GetMapping
    public List<usuario> findAll() {
        return this.repository.findAll();
    }

    @GetMapping("/{id}")
    public usuario findById(PathVariable Integer id) {
        return  this.repository.findById(id)
                .orElseThrow(() ->
                new IllegalArgumentException("Usuário não foi encontrado!"));
    }
}
