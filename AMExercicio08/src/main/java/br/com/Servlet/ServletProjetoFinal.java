package br.com.Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletProjetoFinal
 */
@WebServlet("/ServletProjetoFinal")
public class ServletProjetoFinal extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletProjetoFinal() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		logicaProjeto(request, response);
	}
	
	private void logicaProjeto(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//Leitura dos Parâmetros
		int id = Integer.parseInt(request.getParameter("id"));
		
		String nome = request.getParameter("nome");
		String email = request.getParameter("email");
		String pais = request.getParameter("pais");
		
		User usuario = new User();
		
		usuario.setNome(nome);
		usuario.setEmail(email);
		usuario.setPais(pais);
		
		
		//request.setAttribute("resposta", resultado);
		//request.getRequestDispatcher("/index.jsp").forward(request, response); 
		
		
		
		
		
		
		
	}

}
