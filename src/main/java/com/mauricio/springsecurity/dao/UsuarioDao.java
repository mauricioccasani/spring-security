package com.mauricio.springsecurity.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mauricio.springsecurity.bean.Usuario;

@Repository
public interface UsuarioDao extends JpaRepository<Usuario, Long>{
	Optional<Usuario> findByEmial(String emial);

	Boolean existsByNombres(String nombres);

	Boolean existsByEmial(String emial);
}
