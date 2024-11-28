package com.ecommerce.ecommerce.agro.controller;

import com.ecommerce.ecommerce.agro.model.Usuario;
import com.ecommerce.ecommerce.agro.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/usuario")
public class UsuarioController {

        @Autowired
        private UsuarioRepository repository;

        @GetMapping
        public ResponseEntity<List<Usuario>> findAll() {
            List<Usuario> usuarios = this.repository.findAll();
            return ResponseEntity.ok(usuarios);
        }

        @GetMapping("/{id}")
        public Usuario findById(@PathVariable Integer id) {
            return  this.repository.findById(id)
                    .orElseThrow(() ->
                            new IllegalArgumentException("Usuário não foi encontrado!"));
        }
    }
