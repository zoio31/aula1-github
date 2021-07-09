package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Exercicio3 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);
		
		Student student = new Student();
		
		System.out.print("Name: ");
		student.name = teclado.nextLine();
		System.out.print("Note 1: ");
		student.a = teclado.nextDouble();
		System.out.print("Note 2: ");
		student.b = teclado.nextDouble();
		System.out.print("Note 3: ");
		student.c = teclado.nextDouble();
		
		System.out.println();
		System.out.println(student.note());
		
		teclado.close();

	}

}
