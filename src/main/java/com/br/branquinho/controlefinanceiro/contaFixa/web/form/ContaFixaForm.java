package com.br.branquinho.controlefinanceiro.contaFixa.web.form;

import com.br.branquinho.controlefinanceiro.contaFixa.model.ContaFixa;

import javax.validation.constraints.NotNull;

public class ContaFixaForm {

    @NotNull(message = "Por favor informe o nome")
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ContaFixa toEntity() {
        ContaFixa contaFixa = new ContaFixa();
        contaFixa.setNome(this.getNome());
        return contaFixa;
    }
}
