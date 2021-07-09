package entities;

public class Empregados {
	
	private Integer id;
	private String nome;
	private Double salario;
	
	public Empregados() {
		
	}
	
	public Empregados(int id, String nome, double salario) {
		this.id = id;
		this.nome = nome;
		this.salario = salario;
	}
	
	public void aumento(double aum) {
		salario += salario * aum / 100.0; //tinha feito mas errado.
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getSalario() {
		return salario;
	}

	public String toString() {
		return id + ", " + nome + ", " + String.format("%.2f", salario); //copiado
	}
	
	
	
}
