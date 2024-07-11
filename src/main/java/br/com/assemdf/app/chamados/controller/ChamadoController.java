package br.com.assemdf.app.chamados.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.assemdf.app.chamados.repository.ChamadoRepository;

import br.com.assemdf.app.chamados.dto.DadosCadastroChamado;
import br.com.assemdf.app.chamados.model.Chamado;

@RestController
@RequestMapping("/chamados")
public class ChamadoController {

    @Autowired
    private ChamadoRepository chamadoRepository;
 
    @PostMapping
    public void cadastrar(@RequestBody DadosCadastroChamado dados) {
        chamadoRepository.save(new Chamado(dados));
    }

}
