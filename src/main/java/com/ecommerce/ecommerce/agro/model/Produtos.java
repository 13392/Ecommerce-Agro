package com.ecommerce.ecommerce.agro.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

import java.util.List;
import java.util.Objects;

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
    @JsonIgnoreProperties("categoriaId")
    private List<Categorias> categoriaId;

    @Column(name = "imagem_url")
    private String imagemUrl;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Number getPreco() {
        return preco;
    }

    public void setPreco(Number preco) {
        this.preco = preco;
    }

    public Integer getQuantidadeEstoque() {
        return QuantidadeEstoque;
    }

    public void setQuantidadeEstoque(Integer quantidadeEstoque) {
        QuantidadeEstoque = quantidadeEstoque;
    }

    public List<Categorias> getCategoriaId() {
        return categoriaId;
    }

    public void setCategoriaId(List<Categorias> categoriaId) {
        this.categoriaId = categoriaId;
    }

    public String getImagemUrl() {
        return imagemUrl;
    }

    public void setImagemUrl(String imagemUrl) {
        this.imagemUrl = imagemUrl;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Produtos produtos = (Produtos) o;
        return Objects.equals(id, produtos.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
