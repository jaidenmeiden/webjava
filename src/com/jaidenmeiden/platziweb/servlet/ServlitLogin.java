package com.jaidenmeiden.platziweb.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServlitLogin
 */
@WebServlet(description = "Servlet para amnipular la petición del Login", urlPatterns = { "/ingrese" })
public class ServlitLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public ServlitLogin() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		String usuario = request.getParameter("usuario");
		String empresa = request.getParameter("empresa");
		PrintWriter escritor = response.getWriter();
		if(usuario != null && empresa != null){
			if(empresa.equals("Platzi")) {
				escritor.println("Bienvenido a Platzi");
			} else  {
				escritor.println("Bienvenido...");
			}
		} else {
			escritor.println("Usuario incorrecto!!");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
