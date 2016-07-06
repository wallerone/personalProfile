package org.com.personalProfile.entity;

import java.io.Serializable;

public class Telefone implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7250742412343960629L;

	private Long id;
	
	private String nomePessoa;
	
	private String numero;
	
	private String email;
	
	private Long usuario_id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNomePessoa() {
		return nomePessoa;
	}

	public void setNomePessoa(String nomePessoa) {
		this.nomePessoa = nomePessoa;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getUsuario_id() {
		return usuario_id;
	}

	public void setUsuario_id(Long usuario_id) {
		this.usuario_id = usuario_id;
	}
	
}
