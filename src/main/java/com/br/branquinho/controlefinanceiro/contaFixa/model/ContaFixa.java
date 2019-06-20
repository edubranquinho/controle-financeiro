package com.br.branquinho.controlefinanceiro.contaFixa.model;

import javax.persistence.*;

@Entity
@Table(name = "conta_fixa")
public class ContaFixa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome;

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
}
