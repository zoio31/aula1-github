package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);
		
		Employee employee = new Employee();
		
		System.out.print("Name: ");
		employee.name = teclado.nextLine();
		System.out.print("Gross Salary: ");
		employee.grossSalary = teclado.nextDouble();
		System.out.print("Tax: ");
		employee.tax = teclado.nextDouble();
		
		System.out.println("Employeed: " + employee);
		
		System.out.print("Which percentage to increase salary? ");
		double percentage = teclado.nextDouble();
		employee.increaseSalary(percentage);
		
		System.out.println("Update data: " + employee);
		
		teclado.close();
	}

}
