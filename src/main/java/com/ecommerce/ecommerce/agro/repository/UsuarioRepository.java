package com.ecommerce.ecommerce.agro.repository;

import com.ecommerce.ecommerce.agro.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
}
