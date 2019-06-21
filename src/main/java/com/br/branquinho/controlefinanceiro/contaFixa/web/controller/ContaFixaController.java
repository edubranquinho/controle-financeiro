package com.br.branquinho.controlefinanceiro.contaFixa.web.controller;

import com.br.branquinho.controlefinanceiro.contaFixa.business.service.ContaFixaService;
import com.br.branquinho.controlefinanceiro.contaFixa.web.form.ContaFixaForm;
import com.br.branquinho.controlefinanceiro.contaFixa.web.view.ContaFixaView;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/contaFixa")
public class ContaFixaController {

    private final ContaFixaService contaFixaService;

    public ContaFixaController(ContaFixaService contaFixaService) {
        this.contaFixaService = contaFixaService;
    }

    @PostMapping
    public ContaFixaView criar(@RequestBody @Valid ContaFixaForm form) {
        return ContaFixaView.fromEntity(contaFixaService.salvar(form.toEntity()));
    }

    @GetMapping
    public List<ContaFixaView> listar() {
        return contaFixaService.listar().stream().map(ContaFixaView::fromEntity).collect(Collectors.toList());
    }
}
