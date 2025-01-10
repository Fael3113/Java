package com.projeto.api.service;

import com.projeto.api.model.Client;
import com.projeto.api.model.Message;
import com.projeto.api.repositoty.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class Servico {

	@Autowired
	private Message mensagem;

	@Autowired
	private Repository acao;

	public ResponseEntity<?> cadastrar(Client obj){

		if(obj.getEmail().equals("")){
			mensagem.setMensagem("Informe um email válido");
			return new ResponseEntity<>(mensagem, HttpStatus.BAD_REQUEST);
		} else if (obj.getSenha().equals("")) {
			mensagem.setMensagem("Informe uma senha válida");
			return new ResponseEntity<>(mensagem,HttpStatus.BAD_REQUEST);
		} else{
			return new ResponseEntity<>(acao.save(obj), HttpStatus.CREATED);
		}
	}

	public ResponseEntity<?> selecionar(){
		return new ResponseEntity<>(acao.findAll(), HttpStatus.OK);
	}

}
