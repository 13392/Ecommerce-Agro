package com.ecommerce.ecommerce.agro.model;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table
public class CategoriaProduto {

    @EmbeddedId
    private CategoriaProdutoPK id;
}
