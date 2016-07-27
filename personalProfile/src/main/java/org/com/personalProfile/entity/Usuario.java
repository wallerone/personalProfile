package org.com.personalProfile.entity;

import java.io.Serializable;
import java.util.List;

public class Usuario implements Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = -7392382825046201545L;

	private Long id;
	
	private String nome;
	
	private String endereco;
	
	private String email;
	
	private String telefone;
	
	private String login;
	
	private String senha;

	private List<Telefone> listTelefones;
	
	private List<Galeria> listGalerias;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public List<Telefone> getListTelefones() {
		return listTelefones;
	}

	public void setListTelefones(List<Telefone> listTelefones) {
		this.listTelefones = listTelefones;
	}

	public List<Galeria> getListGalerias() {
		return listGalerias;
	}

	public void setListGalerias(List<Galeria> listGalerias) {
		this.listGalerias = listGalerias;
	}
	
}
