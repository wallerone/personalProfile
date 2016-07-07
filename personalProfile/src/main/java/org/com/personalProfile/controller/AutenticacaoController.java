package org.com.personalProfile.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(urlPatterns = {"/login"})
public class AutenticacaoController extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1246319857538189474L;

	@Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String action = req.getParameter("action");
	    if(action.equals("autenticar")){
	    	autenticarUsuario(req, resp);
	    }else if(action.equals("sair")){
	    	logout(req, resp);
	    }
	}

	private void logout(HttpServletRequest req, HttpServletResponse resp) {
		
		
	}

	private void autenticarUsuario(HttpServletRequest req, HttpServletResponse resp) {
		HttpSession session = req.getSession(true);
//        session.setAttribute("usuarioLogado", getLogin());
	}
}
