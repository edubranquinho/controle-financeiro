package com.br.branquinho.controlefinanceiro.contaFixa.web.view;

import com.br.branquinho.controlefinanceiro.contaFixa.model.ContaFixa;

public class ContaFixaView {

    public Integer id;
    public String nome;

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

    public static ContaFixaView fromEntity(final ContaFixa contaFixa) {
        ContaFixaView view = new ContaFixaView();
        view.setId(contaFixa.getId());
        view.setNome(contaFixa.getNome());
        return view;
    }
}
