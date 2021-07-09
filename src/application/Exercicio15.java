package application;

import java.util.ArrayList;
import java.util.List;

import entities.Empregados;


public class Exercicio15 {

	public static void main(String[] args) {

		List<Empregados> emp = new ArrayList<>();
		
		
		
		System.out.println(emp.stream().filter(c -> c.getId() == 0));
		System.out.println(emp.size());
		
		
		

	}

}
