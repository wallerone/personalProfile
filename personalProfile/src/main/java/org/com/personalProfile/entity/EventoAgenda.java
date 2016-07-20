package org.com.personalProfile.entity;

import java.io.Serializable;
import java.sql.Date;

public class EventoAgenda implements Serializable {

	/**
	* 
	*/
	private static final long serialVersionUID = -4067536931764614737L;

	private Long id;

	private String nomeEvento;

	private String localEvento;

	private Date dataEvento;

	private String horarioEvento;

	private Long usuarioId;
	
	public EventoAgenda() {
	}

	public EventoAgenda(String nomeEvento, String localEvento, Date dataEvento, String horarioEvento, Long usuarioId) {
		super();
		this.setNomeEvento(nomeEvento);
		this.setLocalEvento(localEvento);
		this.setDataEvento(dataEvento);
		this.setHorarioEvento(horarioEvento);
		this.setUsuarioId(usuarioId);
		
	}

	public EventoAgenda(Long id, String nomeEvento, String localEvento, Date dataEvento, String horarioEvento, Long usuarioId) {
		super();
		this.id = id;
		this.setNomeEvento(nomeEvento);
		this.setLocalEvento(localEvento);
		this.setDataEvento(dataEvento);
		this.setHorarioEvento(horarioEvento);
		this.setUsuarioId(usuarioId);
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNomeEvento() {
		return nomeEvento;
	}

	public void setNomeEvento(String nomeEvento) {
		this.nomeEvento = nomeEvento;
	}

	public String getLocalEvento() {
		return localEvento;
	}

	public void setLocalEvento(String localEvento) {
		this.localEvento = localEvento;
	}

	public Date getDataEvento() {
		return dataEvento;
	}

	public void setDataEvento(Date dataEvento) {
		this.dataEvento = dataEvento;
	}

	public String getHorarioEvento() {
		return horarioEvento;
	}

	public void setHorarioEvento(String horarioEvento) {
		this.horarioEvento = horarioEvento;
	}

	public Long getUsuarioId() {
		return usuarioId;
	}

	public void setUsuarioId(Long usuarioId) {
		this.usuarioId = usuarioId;
	}

}
