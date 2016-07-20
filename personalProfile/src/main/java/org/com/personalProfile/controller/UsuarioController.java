package org.com.personalProfile.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.com.personalProfile.entity.Telefone;
import org.com.personalProfile.entity.Usuario;
import org.com.personalProfile.model.UsuarioModel;
import org.com.personalProfile.utils.UtilUsuario;

@WebServlet(urlPatterns = {"/usuarioLogin"})
public class UsuarioController extends HttpServlet{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 105878987583278746L;
	
	private UsuarioModel usuarioModel;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String action = req.getParameter("action");
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/login.jsp");
		dispatcher.forward(req, resp);
	}

	@Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
    		throws ServletException, IOException {
        String action = req.getParameter("action");
        if(action.equals("autenticar")){
            autenticarUsuario(req, resp);
        }
	}

	private void autenticarUsuario(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String login = req.getParameter("login");
        String senha = req.getParameter("senha");
        RequestDispatcher dispatcher;
        if(login != null && senha != null){
	        Usuario usuario = getUsuarioModel().buscaUsuarioByLogin(login);
	        
	        if(usuario != null && senha.equals(usuario.getSenha())){
	        	UtilUsuario.setUsusarioLogado(req, usuario);	
				dispatcher = getServletContext().getRequestDispatcher("/pages/personalProfile.jsp");
			    req.setAttribute("usuario", usuario);
	        }else{
	        	dispatcher = getServletContext().getRequestDispatcher("/login.jsp");
	        }
        }else{
        	dispatcher = getServletContext().getRequestDispatcher("/login.jsp");
        }
        
        dispatcher.forward(req, resp);
       
	}

	public UsuarioModel getUsuarioModel() {
		if(usuarioModel == null){
			usuarioModel = new UsuarioModel();
		}
		return usuarioModel;
	}

	public void setUsuarioModel(UsuarioModel usuarioModel) {
		this.usuarioModel = usuarioModel;
	}
	
}
