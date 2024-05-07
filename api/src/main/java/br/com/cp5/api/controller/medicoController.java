package br.com.cp5.api.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.cp5.api.medico.DadosCadastroMedico;

@RestController
@RequestMapping("medicos")
public class medicoController {
	
	@PostMapping
	public void cadastrar(@RequestBody DadosCadastroMedico dados) {
		System.out.println(dados);
	}

}
