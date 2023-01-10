package com.mauricio.springsecurity.controller;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import com.mauricio.springsecurity.bean.Usuario;

public final class UsuarioMock {
	
	

	private UsuarioMock() {
		
	}

	public static List<Usuario> getListUsuario() {
		return Arrays.asList(
				Usuario.builder().id(UUID.randomUUID().getMostSignificantBits()).nombres("Mauricio Ccasani").estado("1")
						.password("12345").build(),
				Usuario.builder().id(UUID.randomUUID().getMostSignificantBits()).nombres("Fabricio Ccasani").estado("1")
						.password("12345").build());
	}

}
