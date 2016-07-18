package org.com.personalProfile.model;

import java.util.List;

import org.com.personalProfile.dao.TelefoneDao;
import org.com.personalProfile.entity.Telefone;

public class TelefoneModel {

	
	private TelefoneDao telefoneDao;

	
	public Telefone buscaTelefoneById(Long id){
		return getTelefoneDao().buscaTelefoneById(id);
	}

	public List<Telefone> buscaTelefoneByUsuarioId(Long usuarioId) {
		return getTelefoneDao().buscaTelefonesByUsuarioId(usuarioId);
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
