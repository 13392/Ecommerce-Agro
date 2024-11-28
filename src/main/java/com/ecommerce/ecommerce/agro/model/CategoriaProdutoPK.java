package com.ecommerce.ecommerce.agro.model;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Embeddable
public class CategoriaProdutoPK {

    @ManyToOne;
    @JoinColumn(name ="produto_id", referencedColumnName = "id");
    private Produtos produtos;
}
