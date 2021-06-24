package br.com.alura.gerenciador.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciador.acao.Acao;
import br.com.alura.gerenciador.acao.AlteraEmpresa;
import br.com.alura.gerenciador.acao.ListaEmpresas;
import br.com.alura.gerenciador.acao.MostraEmpresa;
import br.com.alura.gerenciador.acao.NovaEmpresa;
import br.com.alura.gerenciador.acao.NovaEmpresaForm;
import br.com.alura.gerenciador.acao.RemoveEmpresa;

@WebServlet("/entrada")
public class UnicaEntradaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
		
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
		String paramAcao = request.getParameter("acao");
		String nomeDaClasse = "br.com.alura.gerenciador.acao." + paramAcao;
		String nome = "";
		
		Class classe;
		
		try {
			classe = Class.forName(nomeDaClasse);
			Object obj = classe.newInstance();
			Acao acao = (Acao)obj;
			nome = acao.executa(request, response);
			
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {			
			throw new ServletException(e);
		}
		
		String[] nomes = nome.split(":");
				
		if(nomes[0].equals("forward")) {
			RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/view/"+nomes[1]);
			rd.forward(request, response);
		} else {
			response.sendRedirect(nomes[1]);
		}				
	}
}
