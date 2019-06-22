package com.br.branquinho.controlefinanceiro.contaCorrente.web.controller;

import com.br.branquinho.controlefinanceiro.contaCorrente.business.ContaCorrenteService;
import com.br.branquinho.controlefinanceiro.contaCorrente.web.form.ContaCorrenteForm;
import com.br.branquinho.controlefinanceiro.contaCorrente.web.view.ContaCorrenteView;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/contaCorrente")
public class ContaCorrenteController {

    private final ContaCorrenteService contaCorrenteService;

    public ContaCorrenteController(ContaCorrenteService contaCorrenteService) {
        this.contaCorrenteService = contaCorrenteService;
    }

    @PostMapping
    public ContaCorrenteView criar(@RequestBody @Valid ContaCorrenteForm form) {
        return ContaCorrenteView.fromEntity(contaCorrenteService.salvar(form.toEntity()));
    }

    @GetMapping
    public List<ContaCorrenteView> listar() {
        return contaCorrenteService.listar().stream().map(ContaCorrenteView::fromEntity).collect(Collectors.toList());
    }

}
