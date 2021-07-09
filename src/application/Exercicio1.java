package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);
		
		Rectangle rectangle = new Rectangle();
		
		System.out.println("Enter rectangle width and height: ");
		rectangle.width = teclado.nextDouble();
		rectangle.height = teclado.nextDouble();
		
		System.out.println("The area is: " + rectangle.area());
		System.out.println("The perimeter is: " + rectangle.perimeter());
		System.out.println("The diagonal is: " + rectangle.diagonal());
		
		teclado.close();

	}

}
