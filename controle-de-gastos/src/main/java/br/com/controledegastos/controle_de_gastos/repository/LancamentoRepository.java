package br.com.controledegastos.controle_de_gastos.repository;

import br.com.controledegastos.controle_de_gastos.model.Lancamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LancamentoRepository extends JpaRepository<Lancamento, Long> {
}
