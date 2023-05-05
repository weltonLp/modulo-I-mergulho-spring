package com.principal;

import java.util.ArrayList;
import java.util.List;

import com.classe.Cliente;

public class Principal {
	public static void main(String[] args) {
		List<Cliente> clientes = new ArrayList<>();
		
		clientes.add(new Cliente(15L, "José"));
		clientes.add(new Cliente(38L, "Ricardo"));
		clientes.add(new Cliente(78L, "Francelia"));
	
		
		clientes.forEach(cliente ->System.out.printf("ID: %d, Nome: %s%n", cliente.getId(), cliente.getNome()));
	}
}
