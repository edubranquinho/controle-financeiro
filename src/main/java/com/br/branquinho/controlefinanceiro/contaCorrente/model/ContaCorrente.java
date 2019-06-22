package com.br.branquinho.controlefinanceiro.contaCorrente.model;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "conta_corrente")
public class ContaCorrente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome;
    private BigDecimal saldo;

    protected ContaCorrente() {
    }

    public ContaCorrente(String nome, BigDecimal saldo) {
        this.nome = nome;
        this.saldo = saldo;
    }

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

    public BigDecimal getSaldo() {
        return saldo;
    }

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }
}
