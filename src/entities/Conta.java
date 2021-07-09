package entities;

public class Conta {
	
	private int numero;
	private String nome;
	private double balanco;
	
	public Conta(int numero, String nome, double inicial) {
		this.nome = nome;
		this.numero = numero;
		deposito(inicial);
	}
	
	public Conta(int numero, String nome) {
		this.nome = nome;
		this.numero = numero;
	}
	
	public double deposito(double valor) {
		return balanco += valor;
	}
	
	public double saque(double saque) {
		return balanco -= saque + 5.0;
		 
	}
	
	public double getBalanco() {
		return balanco;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getNumero() {
		return numero;
	}
	
	@Override
	public String toString() {
		return "Conta: " 
				+ numero + ", Titular:  " 
				+ nome 
				+ ", Balanço: $" 
				+ balanco;
	}
	
}
