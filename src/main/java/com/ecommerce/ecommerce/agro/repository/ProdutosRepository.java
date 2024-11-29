package com.ecommerce.ecommerce.agro.repository;

import com.ecommerce.ecommerce.agro.model.Produtos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutosRepository extends JpaRepository <Produtos, Integer> {
}
