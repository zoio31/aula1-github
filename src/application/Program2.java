package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		String name = teclado.nextLine();
		
		System.out.print("Price: ");
		double price = teclado.nextDouble();
		
		Product product = new Product(name, price);
		
		product.setName("Computer");
		System.out.println("Update name: " + product.getName());
		product.setPrice(1200.00);
		System.out.println("Update price: " + product.getPrice());
		
		
		System.out.println("Quantity: " + product.getQuantity());
		
		System.out.println();
		System.out.println("Product data: " + product);
		
		System.out.println();
		System.out.print("Enter the number of products to be added in stock: ");
		int quantity = teclado.nextInt();
		product.addProducts(quantity);
		
		System.out.println();
		System.out.println("Upated data: " + product);
		
		System.out.println();
		System.out.print("Enter the number of products to be removed from stock: ");
		quantity = teclado.nextInt();
		product.removeProducts(quantity);
		
		System.out.println();
		System.out.println("Removed data: " + product);
		
		teclado.close();
	}

}
