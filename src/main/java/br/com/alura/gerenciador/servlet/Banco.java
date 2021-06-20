package br.com.alura.gerenciador.servlet;

import java.util.ArrayList;
import java.util.List;

public class Banco {

	private static List<Empresa> lista = new ArrayList<>(); 
	
	static {
		lista.add(new Empresa("Facebook"));
		lista.add(new Empresa("Google"));
	}
	
	public void adiciona(Empresa empresa) {
		Banco.lista.add(empresa);
	}
	
	public static List<Empresa> getEmpresas() {
		return Banco.lista;
	}

}
