package org.com.personalProfile.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.com.personalProfile.entity.Telefone;
import org.com.personalProfile.utils.ConnectionFactory;

/**
 * @author MarioJr
 *
 */
public class TelefoneDao {
	
	
	public Telefone buscaTelefoneById(Long id){
		
		Connection conn = null;
		StringBuilder sql = new StringBuilder();
		try {
			conn = ConnectionFactory.createConnection();
			
			sql.append(" select id, nomePessoa, numero, email, usuario_id from telefone  where id = ?");
			PreparedStatement ps = conn.prepareStatement(sql.toString());
			ps.setLong(1, id);
			ResultSet rs = ps.executeQuery();
			Telefone telefone = new Telefone();
			if(rs.next()){
				telefone.setId(id);
				telefone.setNomePessoa(rs.getString("nomePessoa"));
				telefone.setNumero(rs.getString("numero"));
				telefone.setEmail(rs.getString("email"));
				telefone.setUsuario_id(rs.getLong("usuario_id"));
				return telefone;
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
	
	public List<Telefone> buscaTelefonesByUsuarioId(Long id){
		
		Connection conn = null;
		StringBuilder sql = new StringBuilder();
		try {
			conn = ConnectionFactory.createConnection();
			
			sql.append(" select id, nomePessoa, numero, email, usuario_id from telefone  where usuario_id = ?");
			PreparedStatement ps = conn.prepareStatement(sql.toString());
			ps.setLong(1, id);
			ResultSet rs = ps.executeQuery();
			List<Telefone> listTelefone = new ArrayList<Telefone>();
			Telefone telefone = null;
			if(rs.next()){
				telefone = new Telefone();
				telefone.setId(id);
				telefone.setNomePessoa(rs.getString("nomePessoa"));
				telefone.setNumero(rs.getString("numero"));
				telefone.setEmail(rs.getString("email"));
				telefone.setUsuario_id(rs.getLong("usuario_id"));
				listTelefone.add(telefone);
			}
			return listTelefone;
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
	
	public boolean salvarAlterarTelefone(Telefone telefone) {
		try {
			if(telefone.getId() ==null){
				inserirTelefone(telefone);
			}else{
				alterarTelefone(telefone);
			}
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public Long buscaNextIdTelefone(Connection conn) throws SQLException{
		StringBuilder sql = new StringBuilder();
		sql.append(" select max(id) as max from telefone ");
		PreparedStatement ps = conn.prepareStatement(sql.toString());
		ResultSet rs = ps.executeQuery();
		if(rs.next()){
			return (rs.getLong(1)+1);
		}else{
			return 1l;
		}
	}
	
	private void alterarTelefone(Telefone telefone) throws SQLException{
		Connection conn = null;
		PreparedStatement ps = null;
		try {
			conn = ConnectionFactory.createConnection();
			conn.setAutoCommit(false);
			StringBuilder sql = new StringBuilder();
			sql.append(" update telefone set nomePessoa = ?, numero = ? , email = ? where id = ?");
			ps = conn.prepareStatement(sql.toString());
			ps.setString(1, telefone.getNomePessoa());
			ps.setString(2, telefone.getNumero());
			ps.setString(3, telefone.getEmail());
			ps.setLong(4, telefone.getId());
			ps.executeUpdate();
			
			conn.commit();
		} catch (SQLException e) {
			e.printStackTrace();
			conn.rollback();
		}finally{
			if(ps!= null){
				ps.close();
			}
			if(conn != null){
				conn.close();
			}
		}
		
	}

	private void inserirTelefone(Telefone telefone) throws SQLException{
		Connection conn = null;
		PreparedStatement ps = null;
		try {
			
			conn = ConnectionFactory.createConnection();
			conn.setAutoCommit(false);
			StringBuilder sql = new StringBuilder();
			sql.append(" insert into telefone(id, nomePessoa, numero, email) values(?,?,?,?) ");
			ps = conn.prepareStatement(sql.toString());
			ps.setLong(1, buscaNextIdTelefone(conn));
			ps.setString(2, telefone.getNomePessoa());
			ps.setString(3, telefone.getNumero());
			ps.setString(4, telefone.getEmail());
			ps.executeUpdate();
			
			conn.commit();
			
		} catch (SQLException e) {
			e.printStackTrace();
			conn.rollback();
		}finally{
			if(ps != null){
				ps.close();
			}
			if(conn!= null){
				conn.close();
			}
		}
		
	}
	
}
