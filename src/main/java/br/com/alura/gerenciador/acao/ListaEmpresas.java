package br.com.alura.gerenciador.acao;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.alura.gerenciador.modelo.Banco;
import br.com.alura.gerenciador.modelo.Empresa;
import br.com.alura.gerenciador.modelo.Usuario;

public class ListaEmpresas implements Acao {
	
	public String executa(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		System.out.println("Ação listando empresas");
		
		List<Empresa> lista = Banco.getEmpresas();
		PrintWriter out = response.getWriter();
		
		request.setAttribute("empresas", lista);
		
		return "forward:lista_empresas.jsp";
	}	
}
