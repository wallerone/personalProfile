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
}
