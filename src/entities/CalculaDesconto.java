package entities;

public class CalculaDesconto {
	
	private String nome;
	private double preco;
	private int quantidade;
	
	public CalculaDesconto(String nome, double preco, int quantidade) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}
	
	
	public double Desconto() {
		
		if(quantidade <= 10) {
			System.out.println("Nome : " + this.getNome() + ", Valor a ser pago: " + (quantidade * preco));
		}else if(quantidade >= 11 && quantidade <= 20) {
			double total = (quantidade * preco);
			double desconto = total * 0.1;
			System.out.println("Nome : " + this.getNome() + ", Valor com 10% de desconto: " + (total - desconto)); 
		}else if(quantidade >= 21 && quantidade <= 50) {
			double total = (quantidade * preco);
			double desconto = total * 20/100;
			System.out.println("Nome : " + this.getNome() + ", Valor com 20% de desconto: " + (total - desconto));
		}else {
			double total = (quantidade * preco);
			double desconto = total * 0.25;
			System.out.println("Nome : " + this.getNome() + ", Valor com 25% de desconto: " + (total - desconto));
		}
		System.out.println();
		return 0;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public double getPreco() {
		return preco;
	}


	public void setPreco(double preco) {
		this.preco = preco;
	}


	public int getQuantidade() {
		return quantidade;
	}


	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	@Override
	public String toString() {
		return "Nome: " + getNome()
				+ " Preco: " + getPreco()
				+ " Quantidade: " + getQuantidade();
	}
	
}
