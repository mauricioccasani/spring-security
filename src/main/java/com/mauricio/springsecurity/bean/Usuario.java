package com.mauricio.springsecurity.bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "users")
public class Usuario {
	@Id
	private Long id;
	private String nombres;
	private String emial;
	private String password;
	private String estado;
	//private Set<Role> roles;
	

}
