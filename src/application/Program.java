package application;

import java.util.Scanner;

import entities.Triangle;

public class Program {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		Triangle x, y;
		x = new Triangle();
		y = new Triangle();
		
		System.out.println("Entre com as medidas do X: ");
		x.a = teclado.nextDouble();
		x.b = teclado.nextDouble();
		x.c = teclado.nextDouble();
		System.out.println("Entre com as medidas do Y: ");
		y.a = teclado.nextDouble();
		y.b = teclado.nextDouble();
		y.c = teclado.nextDouble();
		
		double areaX = x.area();
		double areaY = y.area();
		
		System.out.println("A area do X é: " + areaX);
		System.out.println("A area do Y é: " + areaY);
		
		//operador ternario
		System.out.println((areaX > areaY) ? "A maior area é do X" : "A maior area é do Y");
		
		teclado.close();
	}

}
