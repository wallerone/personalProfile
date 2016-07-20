package org.com.personalProfile.model;

import org.com.personalProfile.dao.UsuarioDao;
import org.com.personalProfile.entity.Usuario;

public class UsuarioModel {
	
	private UsuarioDao usuarioDao;

	public Usuario buscaUsuarioByLogin(String login){
		return getUsuarioDao().buscaUsuarioByLogin(login);
	}
	
	
	public UsuarioDao getUsuarioDao() {
		if(usuarioDao == null){
			usuarioDao = new UsuarioDao();
		}
		return usuarioDao;
	}

	public void setUsuarioDao(UsuarioDao usuarioDao) {
		this.usuarioDao = usuarioDao;
	}
}
