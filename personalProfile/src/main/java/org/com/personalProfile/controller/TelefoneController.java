package org.com.personalProfile.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.com.personalProfile.model.TelefoneModel;

@WebServlet(urlPatterns = {"/telefones"})
public class TelefoneController extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2550383676190259228L;
	
	private TelefoneModel telefoneModel;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	}
	
	@Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	}
	
	
	public TelefoneModel getTelefoneModel() {
		if(telefoneModel == null){
			telefoneModel = new TelefoneModel();
		}
		return telefoneModel;
	}

	public void setTelefoneModel(TelefoneModel telefoneModel) {
		this.telefoneModel = telefoneModel;
	}
	
}
