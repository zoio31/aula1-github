package application;

import java.util.ArrayList;
import java.util.List;

public class Exercicio13 {

	public static void main(String[] args) {
		
		List<Integer> numeros = new ArrayList<>();
		
		numeros.add(01);
		numeros.add(02);
		numeros.add(03);
		numeros.add(04);
		numeros.add(05);
		
		for(Integer num : numeros) {
			System.out.println(num * 2);
		}

	}

}
