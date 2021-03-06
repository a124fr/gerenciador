package br.com.alura.gerenciador.acao;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciador.modelo.Banco;
import br.com.alura.gerenciador.modelo.Empresa;

public class MostraEmpresa implements Acao {
	
	public String executa(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Ação mostrando empresas");
		
		String paramId = request.getParameter("id");
		Integer id = Integer.valueOf(paramId);
		
		Banco banco = new Banco();
		
		System.out.println("Empresa ID: " + paramId);
		
		Empresa empresa = banco.buscaEmpresaPorId(id);
		
		System.out.println(empresa.getNome());		
		
		request.setAttribute("empresa", empresa);
				
		return "forward:form_altera_empresa.jsp";
	}
}
