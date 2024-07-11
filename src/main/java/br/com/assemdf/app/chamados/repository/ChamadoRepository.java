package br.com.assemdf.app.chamados.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.assemdf.app.chamados.model.Chamado;

public interface ChamadoRepository extends JpaRepository<Chamado, Long>{
    
}

