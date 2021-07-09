package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Empregados;

public class Exercicio14 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Empregados> lista = new ArrayList<>();
		
		
		System.out.print("Digite o numero de empregados que serão cadastrados: ");
		int num = sc.nextInt();
		
		for(int i=0; i<num; i++) {
			System.out.print("Digite o ID do funcionario: ");
			int id = sc.nextInt();
			
			while(hasId(lista, id)) {	//condicao copiada
				System.out.print("Id already taken. Try again: ");
				id = sc.nextInt();
			}
			sc.nextLine();
			System.out.print("Digite o nome do funcionário: ");
			String nome = sc.nextLine();
			System.out.print("Digite o salário do funcionário: ");
			double salario = sc.nextDouble();
			lista.add(new Empregados(id, nome, salario));
			
			}
		System.out.print("Digite o ID do funcionário para aumento: ");
		int id = sc.nextInt();
		//tudo copiado
		Empregados emp = lista.stream().filter(x -> x.getId() == id).findFirst().orElse(null); 
		if (emp == null) {
			System.out.println("This id does not exist!"); 
		}else {
			System.out.print("Digite a porcentagem do aumento: ");
			double aum = sc.nextDouble();
			emp.aumento(aum);
		}
		
		System.out.println("List of employees:");
		for (Empregados obj : lista) {
			System.out.println(obj);
		}
		
		
		sc.close();
	}
	//metodo copiado
	public static boolean hasId(List<Empregados> lista, int id) {
		Empregados emp = lista.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}


}
