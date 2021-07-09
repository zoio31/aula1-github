package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Exercicio12 {

	public static void main(String[] args) {
		
		
		List<String> lista = new ArrayList<>();
		
		lista.add("Maria");
		lista.add("João");
		lista.add("Denis");
		lista.add("Diego");
		lista.add("Lucas");
		lista.add(2, "Bob");
		
		for(String nomes : lista) {
			System.out.println(nomes);
		}
		System.out.println("==================");
		lista.removeIf(z -> z.charAt(0) == 'D'); //lambda
		for(String nomes : lista) {
			System.out.println(nomes);
		}
		System.out.println("==================");
		System.out.println("Index of Lucas: " + lista.indexOf("Lucas"));
		System.out.println("==================");
		List<String> resultado = lista.stream().filter(z -> z.charAt(0) == 'B').collect(Collectors.toList());
		for(String nomes : resultado) {
			System.out.println(nomes);
		}
		System.out.println("==================");
		String name = lista.stream().filter(z -> z.charAt(0) == 'Z').findFirst().orElse(null);
		System.out.println(name);
	}

}
