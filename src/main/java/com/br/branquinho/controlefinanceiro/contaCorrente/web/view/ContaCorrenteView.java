package com.br.branquinho.controlefinanceiro.contaCorrente.web.view;

import com.br.branquinho.controlefinanceiro.contaCorrente.model.ContaCorrente;

import java.math.BigDecimal;

public class ContaCorrenteView {

    private int id;
    private String nome;
    private BigDecimal saldo;

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public static ContaCorrenteView fromEntity(final ContaCorrente contaCorrente) {
        ContaCorrenteView contaCorrenteView = new ContaCorrenteView();
        contaCorrenteView.setId(contaCorrente.getId());
        contaCorrenteView.setNome(contaCorrente.getNome());
        contaCorrenteView.setSaldo(contaCorrente.getSaldo());
        return contaCorrenteView;
    }
}
