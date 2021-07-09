package entities;

public class Nota {
	
	private String nome;
	private double nota;
	private double a;
	private double b;
	private double c;
	private double media;
	
	public Nota(String nome, double a, double b, double c) {
		this.nome = nome;
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public double calculaMedia() {
		 media = (a + b + c) / 3;
		
		if(media >= 6.0) {
			System.out.println();
			System.out.println("PASS");
		}else {
			System.out.println();
			System.out.println("FAILED");
		}
		return media;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}
	
	@Override
	public String toString() {
		return "Nome: " + nome 
				+ " Média: " + calculaMedia();
	}
}
