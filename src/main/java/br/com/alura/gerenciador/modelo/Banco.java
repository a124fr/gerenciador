package br.com.alura.gerenciador.modelo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Banco {

	private static List<Empresa> lista = new ArrayList<>(); 
	private static Integer chaveSequencial = 1;
	
	static {
		Empresa empresa = new Empresa("Facebook");
		empresa.setId(chaveSequencial++);
		lista.add(empresa);
		
		Empresa empresa2 = new Empresa("Google");		
		empresa2.setId(chaveSequencial++);
		lista.add(empresa2);
	}
	
	public void adiciona(Empresa empresa) {
		empresa.setId(Banco.chaveSequencial++);
		Banco.lista.add(empresa);
	}
	
	public static List<Empresa> getEmpresas() {
		return Banco.lista;
	}

	public void remove(Integer id) {
		
		Iterator<Empresa> it = lista.iterator();
		
		while(it.hasNext()) {
			Empresa empresa = it.next();
			
			if(empresa.getId() == id) {
				it.remove();
			}
		}		
	}

	public Empresa buscaEmpresaPorId(Integer id) {		
		for (Empresa empresa : lista) {
			if(empresa.getId() == id) {
				return empresa;
			}
		}
		
		return null;
	}

}
