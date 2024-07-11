package br.com.assemdf.app.chamados.model;

import java.time.LocalDate;

import br.com.assemdf.app.chamados.dto.DadosCadastroChamado;
import br.com.assemdf.app.chamados.enums.Prioridade;
import br.com.assemdf.app.chamados.enums.Status;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
@Table(name = "chamados")
@Entity(name = "chamados")
public class Chamado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private LocalDate dataAbertura = LocalDate.now();
    private LocalDate dataFechamento;

    @Enumerated(EnumType.STRING)
    private Prioridade prioridade;

    @Enumerated(EnumType.STRING)
    private Status status;
    private String observacao;

    @ManyToOne
    @JoinColumn(name = "comercial_id_fk")
    private Comercial comercial;

    @ManyToOne
    @JoinColumn(name = "contabilidade_id_fk")
    private Contabilidade contabilidade;

    @ManyToOne
    @JoinColumn(name = "juridico_id_fk")
    private Juridico juridico;

    @ManyToOne
    @JoinColumn(name = "marketing_id_fk")
    private Marketing marketing;

    public Chamado(DadosCadastroChamado dados) {
        this.titulo = dados.titulo();
        this.dataAbertura = dados.dataAbertura();    
        this.dataFechamento = dados.dataFechamento();  
        this.prioridade = dados.prioridade();
        this.status = dados.status();
        this.observacao = dados.observacao();  
    }

}
