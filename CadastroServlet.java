package br.fiap.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.fiap.dao.ContatoDAO;
import br.fiap.entidade.Contato;

/**
 * Servlet implementation class CadastroServlet
 */
@WebServlet("/cadastro")
public class CadastroServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String nome = request.getParameter("nome");
		String email = request.getParameter("email");
		String fone = request.getParameter("fone");
		
		Contato contato = new Contato(nome, email, fone);
		ContatoDAO dao = new ContatoDAO();
		
		dao.inserir(contato);
		
	}

}
