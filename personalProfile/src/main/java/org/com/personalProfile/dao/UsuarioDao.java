package org.com.personalProfile.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.com.personalProfile.entity.Usuario;
import org.com.personalProfile.utils.ConnectionFactory;

public class UsuarioDao {

	public Usuario buscaUsuarioByLogin(String login) {
			
		Connection conn = null;
		StringBuilder sql = new StringBuilder();
		try {
			conn = ConnectionFactory.createConnection();
			
			sql.append(" select id, nome, endereco,telefone, email, login, senha  from usuario  where login = ?");
			PreparedStatement ps = conn.prepareStatement(sql.toString());
			ps.setString(1, login);
			ResultSet rs = ps.executeQuery();
			Usuario usuario;
			if(rs.next()){
				usuario = new Usuario();
				usuario.setId(rs.getLong("id"));
				usuario.setNome(rs.getString("nome"));
				usuario.setEndereco(rs.getString("endereco"));
				usuario.setEmail(rs.getString("email"));
				usuario.setLogin(rs.getString("login"));
				usuario.setSenha(rs.getString("senha"));
				return usuario;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return null;
	}

}
