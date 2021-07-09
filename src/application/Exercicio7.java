package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Zoo;

public class Exercicio7 {

	public static void main(String[] args) {
	
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);	
		
		Zoo zoo = new Zoo();
		
		
		System.out.println("Digite r para remover o animal e c para cadastrar");
		char opcao = sc.next().charAt(0);
		
		if(opcao == 'c') {
			System.out.println("Cadastre o animal: ");
			String animal = sc.nextLine();
			sc.nextLine();
			System.out.println("Cadastre sua seção: ");
			double secao = sc.nextDouble(); 
			
			zoo.cadastrarAnimal(animal, secao);			
		}else {
			System.out.println("Digite o animal para remoção: ");
			String animal = sc.nextLine();
			sc.nextLine();
			System.out.println("Digite sua seção: ");
			double secao = sc.nextDouble();
			
			zoo.removerAnimal(animal, secao);
		}
		
		
		
		sc.close();
		
	}
}
