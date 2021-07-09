package entities;


public class Zoo {
	
	private String nome;
	private double secao;
	
	public void cadastrarAnimal(String nome, double secao) {
		this.nome = nome;
		this.secao = secao;
		System.out.println("Animal: " + getNome() + " seção : " + getSecao() + " cadastrado!");
		
	}
	
	public void removerAnimal(String nome, double secao) {
		this.nome = nome;
		this.secao = secao;
		System.out.println("Animal: " + getNome() + " seção: " + getSecao() + " removido com sucesso!");
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSecao() {
		return secao;
	}

	public void setSecao(int secao) {
		this.secao = secao;
	}
	
	@Override
	public String toString() {
		return this.getNome() + this.getSecao();
	}
		
}
