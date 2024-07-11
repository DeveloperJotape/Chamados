package br.com.assemdf.app.chamados.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Marketing extends Funcionario{

    @OneToMany(mappedBy = "marketing")
    private List<Chamado> chamados = new ArrayList<>();  

}
