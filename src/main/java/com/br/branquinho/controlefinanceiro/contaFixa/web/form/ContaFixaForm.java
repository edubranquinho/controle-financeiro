package com.br.branquinho.controlefinanceiro.contaFixa.web.form;

import com.br.branquinho.controlefinanceiro.contaFixa.model.ContaFixa;

import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

public class ContaFixaForm {

    @NotNull(message = "Por favor informe o nome")
    private String nome;
    private BigDecimal valor;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public ContaFixa toEntity() {
        ContaFixa contaFixa = new ContaFixa();
        contaFixa.setNome(this.getNome());
        return contaFixa;
    }
}
