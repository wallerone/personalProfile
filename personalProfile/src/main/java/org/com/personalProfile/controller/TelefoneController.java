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
import org.com.personalProfile.model.TelefoneModel;
import org.com.personalProfile.utils.UtilUsuario;

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
		String action = req.getParameter("action");
	    if(action.equals("adicionar")){
	    	adicionarTelefone(req, resp);
	    }else if(action.equals("editar")){
	    	editarLivro(req, resp);
	    }else if(action.equals("remover")){
	    	removerTelefone(req, resp);
	    }
	}
	
    private void adicionarTelefone(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        String nomePessoa = req.getParameter("nomePessoa");
        String numero = req.getParameter("numero");
        String email = req.getParameter("email");
        String usuarioId = req.getParameter("usuarioId");
        
        Telefone telefone = new Telefone(nomePessoa, numero, email, Long.valueOf(usuarioId));
        
        getTelefoneModel().salvarAlterarTelefone(telefone);
        
        List<Telefone> result = getTelefoneModel().buscaTelefoneByUsuarioId(Long.valueOf(usuarioId));  
        req.setAttribute("idTelefone", telefone.getId());
        req.setAttribute("message", "Telefone salvo com sucesso!");
        forwardListTelefones(req, resp, result);
        
    }

    private void editarLivro(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
    	String nomePessoa = req.getParameter("nomePessoa");
        String numero = req.getParameter("numero");
        String email = req.getParameter("email");
        String usuarioId = req.getParameter("usuarioId");
        long idTelefone = Integer.valueOf(req.getParameter("idTelefone"));
        
        Telefone telefone = new Telefone(idTelefone,nomePessoa, numero, email, Long.valueOf(usuarioId));
        
        getTelefoneModel().salvarAlterarTelefone(telefone);
        
        List<Telefone> result = getTelefoneModel().buscaTelefoneByUsuarioId(Long.valueOf(usuarioId));  
        req.setAttribute("idTelefone", telefone.getId());
        req.setAttribute("message", "Telefone alterado com sucesso!");
        forwardListTelefones(req, resp, result);
    } 
    
    private void removerTelefone(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        long idTelefone = Integer.valueOf(req.getParameter("idTelefone"));
        getTelefoneModel().removerTelefone(idTelefone);
        req.setAttribute("message", "Telefone removido com sucesso!");
        Usuario usuario = UtilUsuario.getUsusarioLogado(req);
        List<Telefone> result = getTelefoneModel().buscaTelefoneByUsuarioId(usuario.getId());  
        forwardListTelefones(req, resp, result);
    }
    
    private void forwardListTelefones(HttpServletRequest req, HttpServletResponse resp, List<Telefone> listTelefones)
            throws ServletException, IOException {
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/personalTelefone.jsp");
        req.setAttribute("listTelefones", listTelefones);
        dispatcher.forward(req, resp);
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
