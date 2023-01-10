package com.mauricio.springsecurity.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mauricio.springsecurity.bean.Usuario;

@RestController
public class TestController {
	
	@GetMapping("/hola")
	public List<Usuario> name() {
		
		return UsuarioMock.getListUsuario();
	}

	

}
