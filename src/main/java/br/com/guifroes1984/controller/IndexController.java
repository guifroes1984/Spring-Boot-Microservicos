package br.com.guifroes1984.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.guifroes1984.model.Usuario;

@RestController /*Arquitetura REST*/
@RequestMapping(value = "/usuario")
public class IndexController {
	
	/*Serviço RESTfull*/
	@GetMapping(value = "/", produces = "application/json")
	public ResponseEntity<Usuario> init() {
		
		Usuario usuario = new Usuario();
		usuario.setId(1L);
		usuario.setLogin("gui@gmail.com");
		usuario.setNome("Guilherme");
		usuario.setSenha("123456");
		
		Usuario usuario2 = new Usuario();
		usuario2.setId(2L);
		usuario2.setLogin("fran@gmail.com");
		usuario2.setNome("Fran");
		usuario2.setSenha("654321");
		
		List<Usuario> usuarios = new ArrayList<Usuario>();
		usuarios.add(usuario);
		usuarios.add(usuario2);
		
		
		return new  ResponseEntity(usuarios, HttpStatus.OK);
	}

}
