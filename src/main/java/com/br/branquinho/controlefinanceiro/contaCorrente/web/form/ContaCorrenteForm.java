package com.br.branquinho.controlefinanceiro.contaCorrente.web.form;

import com.br.branquinho.controlefinanceiro.contaCorrente.model.ContaCorrente;

import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

public class ContaCorrenteForm {

    @NotNull
    private String nome;
    @NotNull
    private BigDecimal saldo;

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

    public ContaCorrente toEntity() {
        return new ContaCorrente(this.nome, this.saldo);
    }
}
