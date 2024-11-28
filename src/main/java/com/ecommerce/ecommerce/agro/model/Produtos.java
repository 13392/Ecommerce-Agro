package com.ecommerce.ecommerce.agro.model;


import jakarta.persistence.*;

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

    @ManyToOne
    private Integer categoriaId;

    @Column(name = "imagem_url")
    private String imagemUrl;
}
