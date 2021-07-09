package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Conta;

public class Exercicio5 {

	public static void main(String[] args) {
		
	Locale.setDefault(Locale.US);
	Scanner teclado = new Scanner(System.in);
	
	Conta conta;
	
	System.out.print("Entre com o numero da conta: ");
	int numero = teclado.nextInt();
	System.out.print("Entre com o nome do titular: ");
	teclado.nextLine();
	String nome = teclado.nextLine();
	System.out.println();
	System.out.print("Deseja realizar um deposito inicial (s/n) ?");
	char resposta = teclado.next().charAt(0);
	
	
	if(resposta == 's') {
		System.out.print("Entre com o valor inicial: ");
		double inicial = teclado.nextDouble();
		conta = new Conta(numero, nome, inicial);

	}else {
		
		conta = new Conta(numero, nome);
		
	}
	
	System.out.println();
	System.out.println(conta);
	System.out.println();
	System.out.print("Deseja fazer um deposito? ");
	double deposito = teclado.nextDouble();
	conta.deposito(deposito);
	System.out.println("Conta atualizada!");
	System.out.println(conta);
	
	System.out.println();
	System.out.print("Deseja fazer um saque? ");
	double saque = teclado.nextDouble();
	conta.saque(saque);
	System.out.println("Conta atualizada!");
	System.out.println(conta);
	
	
		teclado.close();
	}

}
