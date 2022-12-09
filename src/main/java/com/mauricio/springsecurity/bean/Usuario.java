package com.mauricio.springsecurity.bean;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Usuario {
	private Long id;
	private String nombres;
	private String emial;
	private String password;
	private String estado;
	

}
