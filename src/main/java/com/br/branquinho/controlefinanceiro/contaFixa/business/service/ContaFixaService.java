package com.br.branquinho.controlefinanceiro.contaFixa.business.service;

import com.br.branquinho.controlefinanceiro.contaFixa.infra.repository.ContaFixaRepository;
import com.br.branquinho.controlefinanceiro.contaFixa.model.ContaFixa;
import org.springframework.stereotype.Service;

@Service
public class ContaFixaService {

    private final ContaFixaRepository contaFixaRepository;

    public ContaFixaService(ContaFixaRepository contaFixaRepository) {
        this.contaFixaRepository = contaFixaRepository;
    }

    public ContaFixa salvar(final ContaFixa contaFixa) {
        return contaFixaRepository.save(contaFixa);
    }
}
