package br.com.assemdf.app.chamados.dto;

import java.time.LocalDate;

import br.com.assemdf.app.chamados.enums.Prioridade;
import br.com.assemdf.app.chamados.enums.Status;

public record DadosCadastroChamado(
    Long id,
    String titulo,
    LocalDate dataAbertura,
    LocalDate dataFechamento,
    Prioridade prioridade,
    Status status,
    String observacao) {

}
