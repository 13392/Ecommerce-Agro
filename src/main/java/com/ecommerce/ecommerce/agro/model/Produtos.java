package com.ecommerce.ecommerce.agro.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table
public class Produtos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String nome;

    @Column
    private String descricao;

    @Column
    private Number preco;

    @Column(name = "quantidade_estoque")
    private Integer QuantidadeEstoque;

    @OneToMany
    @JoinColumn(name = "produtos_id", referencedColumnName = "id")
    @JsonIgnoreProperties("produtos")
    private List<Categorias> categoriaId;

    @Column(name = "imagem_url")
    private String imagemUrl;
}
