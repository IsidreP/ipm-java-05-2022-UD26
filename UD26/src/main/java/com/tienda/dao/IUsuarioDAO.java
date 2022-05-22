package com.tienda.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tienda.dto.Usuario;


public interface IUsuarioDAO extends JpaRepository<Usuario, Long> {

	Usuario findByUsername(String username);
}