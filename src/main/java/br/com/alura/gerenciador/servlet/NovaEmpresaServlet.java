package br.com.alura.gerenciador.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/nova_empresa")
public class NovaEmpresaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Cadastrando nova empresa");
		
		String nome = request.getParameter("nome");
		Empresa empresa = new Empresa();
		empresa.setNome(nome);
		
		Banco banco = new Banco();
		banco.adiciona(empresa);
				
//		PrintWriter out = response.getWriter();		
//		out.println("<html>");
//		out.println("<body>");
//		out.println("<p>Empresa " + nome + " cadastrada com sucesso!</p>");
//		out.println("</body>");
//		out.println("</html>");
		
		// chamar o JPS
		request.setAttribute("empresa", empresa.getNome());
		RequestDispatcher rd = request.getRequestDispatcher("/nova_empresa_criada.jsp");
		rd.forward(request, response);
		
	}

}
