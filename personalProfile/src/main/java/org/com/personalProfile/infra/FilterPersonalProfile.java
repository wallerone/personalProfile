package org.com.personalProfile.infra;

import java.io.IOException;
import java.io.Serializable;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebFilter("/*")
public class FilterPersonalProfile implements Filter, Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4866683945454659329L;

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain)
			throws IOException, ServletException {
		try{
	        HttpServletRequest req = (HttpServletRequest) request;
	        HttpServletResponse res = (HttpServletResponse) response;
	        HttpSession ses = req.getSession(false);
	        String reqURI = req.getRequestURI();
	        
	        if (isDoFilter(reqURI, ses, req)) {
	            filterChain.doFilter(request, response);
	        }else{
	        	res.sendRedirect(req.getContextPath() + "/login.jsf"); 
	        }
		}catch(Throwable t) {
	     System.out.println( t.getMessage());
		}
	}
	
	public void destroy() {
		
	}

	public void init(FilterConfig arg0) throws ServletException {
		
	}
	
	public boolean isDoFilter(String reqURI, HttpSession ses, HttpServletRequest req){
		if((reqURI.startsWith(req.getContextPath()) || reqURI.startsWith(req.getContextPath() + "/img")
	        		|| (reqURI.startsWith(req.getContextPath() + "/login.jsp"))
	        		||	(ses != null && ses.getAttribute("usuarioLogado") != null))){
			return true;
		}
		return false;
	}

}
