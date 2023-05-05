package com.principal;

import java.util.ArrayList;
import java.util.List;

public class Principal {
	public static void main(String[] args) {
		List<String> nomes = new ArrayList<>();
		nomes.add("José");
		nomes.add("Rita");
		nomes.add("Juarez");
		
		
		System.out.println(nomes);
		
		nomes.remove(1);
		System.out.println(nomes);
		nomes.remove("José");
		System.out.println(nomes);
	}
}
