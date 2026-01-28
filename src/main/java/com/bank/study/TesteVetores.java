package com.bank.study;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TesteVetores {

	public static void main(String[] args) {
		
		List<String> nomes = new ArrayList<>();
		nomes.add("Mariana");
		nomes.add("Melissa");
		nomes.add("João");
		nomes.add("Paulo");
		
		/*for(int i = 0; i<nomes.size(); i++) {
			String nome = nomes.get(i);
			System.out.println(nome);
			
		}*/
		
		for(String nome:nomes) {
			System.out.println(nome);

		}
		
		nomes.forEach(nome-> System.out.println(nome));

	}

}
