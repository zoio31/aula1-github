package application;

import java.util.Locale;
import java.util.Scanner;

import entities.CalculaDesconto;

public class Exercicio6 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe o nome do produto: ");
		String nome = sc.nextLine();
		System.out.print("Informe o preço do produto: ");
		double preco = sc.nextDouble();
		System.out.print("Informe a quantidade do produto: ");
		int quant = sc.nextInt();
		
		CalculaDesconto cal = new CalculaDesconto(nome, preco, quant);
		
		System.out.println();
		System.out.println(cal.Desconto());
		
		
		sc.close();
	}

}
