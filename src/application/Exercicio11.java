package application;

public class Exercicio11 {

	public static void main(String[] args) {
		
		String[] nomes = new String[] {"Diego", "Lucas", "Gabi"};
		
		for(int i=0; i<nomes.length; i++) {
			System.out.println(nomes[i]);
		}
		
		System.out.println("=======================");
		//for each declaracao: Tipo(String) apelido(valores) : array(nomes)
		for(String valores : nomes) {
			System.out.println(valores);
		}

	}

}
