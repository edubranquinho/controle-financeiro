package com.br.branquinho.controlefinanceiro.contaFixa.infra.repository;

import com.br.branquinho.controlefinanceiro.contaFixa.model.ContaFixa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContaFixaRepository extends JpaRepository<ContaFixa, Integer> {
}
