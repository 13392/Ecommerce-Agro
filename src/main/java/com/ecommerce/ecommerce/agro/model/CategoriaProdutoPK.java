package com.ecommerce.ecommerce.agro.model;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Embeddable
public class CategoriaProdutoPK {

    @ManyToOne
    @JoinColumn(name ="produtos_id", referencedColumnName = "id")
    private Produtos produtos;

    @ManyToOne
    @JoinColumn(name ="categorias_id", referencedColumnName = "id")
    private Categorias categorias;

    public Produtos getProdutos() {
        return produtos;
    }

    public void setProdutos(Produtos produtos) {
        this.produtos = produtos;
    }

    public Categorias getCategorias() {
        return categorias;
    }

    public void setCategorias(Categorias categorias) {
        this.categorias = categorias;
    }
}
