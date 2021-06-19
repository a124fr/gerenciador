package br.com.alura.gerenciador.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/nova-empresa")
public class NovaEmpresaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Cadastrando nova empresa");
		String nome = request.getParameter("nome");
		
		PrintWriter out = response.getWriter();		
		out.println("<html>");
		out.println("<body>");
		out.println("<p>Empresa " + nome + " cadastrada com sucesso!</p>");
		out.println("</body>");
		out.println("</html>");
	}

}
