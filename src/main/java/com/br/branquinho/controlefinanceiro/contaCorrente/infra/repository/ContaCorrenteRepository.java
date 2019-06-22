package com.br.branquinho.controlefinanceiro.contaCorrente.infra.repository;

import com.br.branquinho.controlefinanceiro.contaCorrente.model.ContaCorrente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContaCorrenteRepository extends JpaRepository<ContaCorrente, Integer> {

}
