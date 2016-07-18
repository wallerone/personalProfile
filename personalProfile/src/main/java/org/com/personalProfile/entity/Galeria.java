package org.com.personalProfile.entity;

import java.io.Serializable;

public class Galeria implements Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4325906195437252148L;

	private Long id;
		
	private byte[] imagem;
	
	private String extensaoArquivo;
	
	private String caminhoImagem;
	
	private Long usuario_id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public byte[] getImagem() {
		return imagem;
	}

	public void setImagem(byte[] imagem) {
		this.imagem = imagem;
	}

	public String getCaminhoImagem() {
		return caminhoImagem;
	}

	public void setCaminhoImagem(String caminhoImagem) {
		this.caminhoImagem = caminhoImagem;
	}

	public String getExtensaoArquivo() {
		return extensaoArquivo;
	}

	public void setExtensaoArquivo(String extensaoArquivo) {
		this.extensaoArquivo = extensaoArquivo;
	}

	public Long getUsuario_id() {
		return usuario_id;
	}

	public void setUsuario_id(Long usuario_id) {
		this.usuario_id = usuario_id;
	}
	
}
