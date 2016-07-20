package org.com.personalProfile.utils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.com.personalProfile.entity.Usuario;

public class UtilUsuario {
	
	public static final String loginPage = "login.jsp";
	public static final String homePage = "personalProfile.jsf";
 
	public static Usuario getUsusarioLogado(HttpServletRequest req) {
		HttpSession session = req.getSession();
		return (Usuario)session.getAttribute("usuarioLogado");
	}
	
	public static void setUsusarioLogado(HttpServletRequest req, Usuario usuario) {
		HttpSession session = req.getSession();
		session.setAttribute("usuarioLogado", usuario);
	}
	
	public static void invalidadeSession(HttpServletRequest req){
		HttpSession session = req.getSession();
		session.invalidate();
	}
}
