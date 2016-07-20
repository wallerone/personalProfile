package org.com.personalProfile.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.com.personalProfile.entity.EventoAgenda;
import org.com.personalProfile.utils.ConnectionFactory;

public class EventoAgendaDao {

		public EventoAgenda buscaEventoAgendaById(Long id){
			
			Connection conn = null;
			StringBuilder sql = new StringBuilder();
			try {
				conn = ConnectionFactory.createConnection();
				
				sql.append(" select id, nomeevento, localevento, dataevento, horarioevento from eventoagenda  where id = ?");
				PreparedStatement ps = conn.prepareStatement(sql.toString());
				ps.setLong(1, id);
				ResultSet rs = ps.executeQuery();
				EventoAgenda eventoAgenda = new EventoAgenda();
				if(rs.next()){
					eventoAgenda.setId(id);
					eventoAgenda.setNomeEvento(rs.getString("nomeEvento"));
					eventoAgenda.setLocalEvento(rs.getString("localEvento"));
					eventoAgenda.setDataEvento(rs.getDate("dataEvento"));
					eventoAgenda.setHorarioEvento(rs.getString("horarioEvento"));
					return eventoAgenda;
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
		
		public ArrayList<EventoAgenda> buscaEventoAgendaByUsuarioId(Long id){
			
			Connection conn = null;
			StringBuilder sql = new StringBuilder();
			try {
				conn = ConnectionFactory.createConnection();
				
				sql.append(" select id, nomeevento, localevento, dataevento, horarioevento from eventoagenda  where usuario_id = ?");
				PreparedStatement ps = conn.prepareStatement(sql.toString());
				ps.setLong(1, id);
				ResultSet rs = ps.executeQuery();
				ArrayList<EventoAgenda> listEventoAgenda = new ArrayList<EventoAgenda>();
				EventoAgenda eventoAgenda = null;
				if(rs.next()){
					eventoAgenda = new EventoAgenda();
					eventoAgenda.setId(id);
					eventoAgenda.setNomeEvento(rs.getString("nomeEvento"));
					eventoAgenda.setLocalEvento(rs.getString("localEvento"));
					eventoAgenda.setDataEvento(rs.getDate("dataEvento"));
					eventoAgenda.setHorarioEvento(rs.getString("horarioEvento"));
					listEventoAgenda.add(eventoAgenda);
				}
				return listEventoAgenda;
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
		
		public boolean salvarAlterarEventoAgenda(EventoAgenda eventoAgenda) {
			try {
				if(eventoAgenda.getId() ==null){
					inserirEventoAgenda(eventoAgenda);
				}else{
					alterarEventoAgenda(eventoAgenda);
				}
				return true;
			} catch (SQLException e) {
				e.printStackTrace();
				return false;
			}
		}
		
		public Long buscaNextIdEventoAgenda(Connection conn) throws SQLException{
			StringBuilder sql = new StringBuilder();
			sql.append(" select max(id) as max from eventoagenda ");
			PreparedStatement ps = conn.prepareStatement(sql.toString());
			ResultSet rs = ps.executeQuery();
			if(rs.next()){
				return (rs.getLong(1)+1);
			}else{
				return 1l;
			}
		}
		
		private void alterarEventoAgenda(EventoAgenda eventoAgenda) throws SQLException{
			Connection conn = null;
			PreparedStatement ps = null;
			try {
				conn = ConnectionFactory.createConnection();
				conn.setAutoCommit(false);
				StringBuilder sql = new StringBuilder();
				sql.append(" update eventoagenda set nomeevento = ?, localevento = ? , dataevento = ?, horarioevento = ? where id = ?");
				ps = conn.prepareStatement(sql.toString());
				ps.setString(1, eventoAgenda.getNomeEvento());
				ps.setString(2, eventoAgenda.getLocalEvento());
				ps.setDate(3, eventoAgenda.getDataEvento());
				ps.setString(4, eventoAgenda.getHorarioEvento());
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

		private void inserirEventoAgenda(EventoAgenda eventoAgenda) throws SQLException{
			Connection conn = null;
			PreparedStatement ps = null;
			try {
				
				conn = ConnectionFactory.createConnection();
				conn.setAutoCommit(false);
				StringBuilder sql = new StringBuilder();
				sql.append(" insert into eventoagenda(id, nomeEvento, localEvento, dataEvento, horarioEvento) values(?,?,?,?,?) ");
				ps = conn.prepareStatement(sql.toString());
				ps.setLong(1, buscaNextIdEventoAgenda(conn));
				ps.setString(2, eventoAgenda.getNomeEvento());
				ps.setString(3, eventoAgenda.getLocalEvento());
				ps.setDate(4, eventoAgenda.getDataEvento());
				ps.setString(5, eventoAgenda.getHorarioEvento());
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
		
		public boolean removerEventoAgenda(Long id) throws SQLException{
			Connection conn = null;
			PreparedStatement ps = null;
			try {
				conn = ConnectionFactory.createConnection();
				conn.setAutoCommit(false);
				StringBuilder sql = new StringBuilder();
				sql.append(" delete from telefone where id = ? ");
				ps = conn.prepareStatement(sql.toString());
				ps.setLong(1, id);
				ps.executeUpdate();
				
				conn.commit();
			} catch (SQLException e) {
				e.printStackTrace();
				conn.rollback();
				return false;
			}finally{
				if(ps != null){
					ps.close();
				}
				if(conn!= null){
					conn.close();
				}
			}
			return true;
		}

	}
