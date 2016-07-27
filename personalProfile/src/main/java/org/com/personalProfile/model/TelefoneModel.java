package org.com.personalProfile.model;

import java.util.List;

import org.com.personalProfile.dao.TelefoneDao;
import org.com.personalProfile.entity.Telefone;
import org.com.personalProfile.entity.Usuario;

public class TelefoneModel {

	
	private TelefoneDao telefoneDao;

	
	public Telefone buscaTelefoneById(Long id){
		return getTelefoneDao().buscaTelefoneById(id);
	}

	public List<Telefone> buscaTelefoneByUsuarioId(Long usuarioId) {
		return getTelefoneDao().buscaTelefonesByUsuarioId(usuarioId);
	}
	
	public List<Telefone> buscaTelefoneByQuery(String query, Usuario usuario) {
		return getTelefoneDao().buscaTelefoneByQuery(query, usuario);
	}
	
	public boolean salvarAlterarTelefone(Telefone telefone){
		return getTelefoneDao().salvarAlterarTelefone(telefone);
	}
	
	public boolean removerTelefone(Long id){
		return getTelefoneDao().removerTelefone(id);
	}
	
	public TelefoneDao getTelefoneDao() {
		if(telefoneDao == null){
			telefoneDao = new TelefoneDao();
		}
		return telefoneDao;
	}

	public void setTelefoneDao(TelefoneDao telefoneDao) {
		this.telefoneDao = telefoneDao;
	}
	
}
