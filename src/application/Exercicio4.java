package application;

import java.util.Locale;
import java.util.Scanner;

import entities.currencyConverter;

public class Exercicio4 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Dollar price: ");
		currencyConverter.dollar = teclado.nextDouble();
		System.out.print("How many dollars will be bought: ");
		currencyConverter.bought = teclado.nextDouble();
		
		System.out.print("Amount to be paid in reais: " + currencyConverter.convert());
		
		
		
		teclado.close();
	}

}
