package com.principal;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Principal {
	public static void main(String[] args) {
		List<String> nomes = new ArrayList<>();
		nomes.add("José");
		nomes.add("Rita");
		nomes.add("Juarez");
		
		
		nomes.forEach(new Consumer<String>() {

			@Override
			public void accept(String t) {
				System.out.println(t);
				
			}
		});
		
		System.out.println("--------------- LÃMBDA ---------------------------------------------\n");
		
		nomes.forEach(nome -> {
			System.out.println(nome);
		});
		
		
	
		
		
	}
}
