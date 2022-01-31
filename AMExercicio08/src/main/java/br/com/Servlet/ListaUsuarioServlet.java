package br.com.Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ListaUsuarioServlet
 */
@WebServlet("/ListaUsuarioServlet")
public class ListaUsuarioServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListaUsuarioServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Banco banco = new Banco();
		
		List<User> lista = banco.getUsuarios();
		
		PrintWriter saida = response.getWriter();
		saida.println("<html><body>");
		saida.println("<th>");
		
		for (User usuario : lista) {
			saida.println("<td>" + usuario.getNome() + "</td>");
			saida.println("<td>" + usuario.getEmail() + "</td>");
			saida.println("<td>" + usuario.getPais() + "</td>");
		}
		
		saida.println("</th>");
		saida.println("</body></html>");
		
		
		
	}

}
