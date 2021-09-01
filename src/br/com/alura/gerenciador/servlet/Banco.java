package br.com.alura.gerenciador.servlet;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Banco {

	private static List<Empresa> lista = new ArrayList<>();
	
	private static int id;
	
	public void adiciona(Empresa empresa) {
		Banco.id = id + 1;
		empresa.setId(id);
		Banco.lista.add(empresa);
	}

	public List<Empresa> getEmpresas() {
		return Banco.lista;
	}

	public void remover(int parseid) {
		
		
		Iterator<Empresa> empresa = lista.iterator();
		
		while(empresa.hasNext()) {
			Empresa emp = empresa.next();
			if(emp.getId().equals(parseid)) {
				empresa.remove();
			}
		}
	}

	public Empresa buscarEmpresaPorId(int id2) {
		
		for (Empresa empresa : lista) {
			if(empresa.getId() == id2) {
				return empresa;
			}
		}
		return null;
		
	}

}
