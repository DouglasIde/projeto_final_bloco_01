package model;

public abstract class Produto {
	
	private String nome, cor;
	private double preco;
	private char tamanho;
	
	public Produto(String nome, String cor, double preco, char tamanho) {
		super();
		this.nome = nome;
		this.cor = cor;
		this.preco = preco;
		this.tamanho = tamanho;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public char getTamanho() {
		return tamanho;
	}

	public void setTamanho(char tamanho) {
		this.tamanho = tamanho;
	}
	
	
}
