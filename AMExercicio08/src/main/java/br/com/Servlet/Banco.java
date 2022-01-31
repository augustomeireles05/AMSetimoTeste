package br.com.Servlet;

import java.util.ArrayList;
import java.util.List;

public class Banco {
	
	public static List<User> lista = new ArrayList<>();

	public void adiciona(User usuario) {
		
		lista.add(usuario);
	}
	
	public List<User> getUsuarios() {
		return Banco.lista;
	}

}
