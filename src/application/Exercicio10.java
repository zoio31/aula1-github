package application;

import java.text.ParseException;
import java.util.Locale;
import java.util.Scanner;

import entities.Aluga;

public class Exercicio10 {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Aluga[] dados = new Aluga[10];
		
		
		System.out.print("How many rooms will be rented? ");
		int n = sc.nextInt();
		
	
		for(int i=1; i<=n; i++) {
			System.out.println();
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int quarto = sc.nextInt();
			dados[quarto] = new Aluga(name, email);
		}
//		String todos = "";
//		for(int i=0; i<n; i++) {
//			todos = dados[i].getNome() + " ," + dados[i].getEmail();
//		}
		System.out.println();
		System.out.println("Busy rooms:");
			for (int i=0; i<10; i++) {
				if (dados[i] != null) {
					System.out.println(i + ": " + dados[i]);
				}
			}
		
		sc.close();
	}

}
