package com.br.branquinho.controlefinanceiro.contaCorrente.business;

import com.br.branquinho.controlefinanceiro.contaCorrente.infra.repository.ContaCorrenteRepository;
import com.br.branquinho.controlefinanceiro.contaCorrente.model.ContaCorrente;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContaCorrenteService {

    private final ContaCorrenteRepository contaCorrenteRepository;

    public ContaCorrenteService(ContaCorrenteRepository contaCorrenteRepository) {
        this.contaCorrenteRepository = contaCorrenteRepository;
    }

    public ContaCorrente salvar(final ContaCorrente contaCorrente) {
        return contaCorrenteRepository.save(contaCorrente);
    }

    public List<ContaCorrente> listar() {
        return contaCorrenteRepository.findAll();
    }
}
