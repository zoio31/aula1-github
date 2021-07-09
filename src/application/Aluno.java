package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Nota;

public class Aluno {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Entre com o nome do aluno: ");
		String nome = sc.nextLine();
		System.out.print("Entre com a 1° nota do aluno: ");
		double a = sc.nextDouble();
		System.out.print("Entre com a 2° nota do aluno: ");
		double b = sc.nextDouble();
		System.out.print("Entre com a 3° nota do aluno: ");
		double c = sc.nextDouble();
		
		Nota notas = new Nota(nome, a, b, c);
		
		System.out.println(notas);
		
		sc.close();
	}

}
