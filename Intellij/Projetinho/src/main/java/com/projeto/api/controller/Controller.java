package com.projeto.api.controller;

import com.projeto.api.model.Client;
import com.projeto.api.service.Servico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@Autowired
	private Servico servico;

	@GetMapping("")
	public String mensagem(){
		return "Bem vindo";
	}

	@PostMapping("/cadastrar")
	public ResponseEntity<?> cadastrar(@RequestBody Client obj){
		return servico.cadastrar(obj);
	}

	@GetMapping("/selecionar")
	public ResponseEntity<?> selecionar(){
		return servico.selecionar();
	}
}
