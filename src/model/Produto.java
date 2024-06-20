package model;

public class Produto {
	
	// VARIÁVEIS
	
	private String nome, cor;
	private int numero;
	private float preco;
	private char tamanho;
	
	// CONSTRUTOR 
	
	public Produto(int numero, String nome, String cor, char tamanho, float preco) {
		this.numero = numero;
		this.nome = nome;
		this.cor = cor;
		this.tamanho = tamanho;
		this.preco = preco;
		
	}
	
	// SETTERS E GETTERS

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

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public char getTamanho() {
		return tamanho;
	}

	public void setTamanho(char tamanho) {
		this.tamanho = tamanho;
	}
	
	// MÉTODOS
	
	public void visualizar() {
		System.out.println("""
				****************************************
				DADOS DO PRODUTO: 
				****************************************
				""");
		System.out.println("Número do Produto: " + this.numero);
		System.out.println("Nome do Produto: " + this.nome);
		System.out.println("Cor: " + this.cor);
		System.out.println("Tamanho: " + this.tamanho);
		System.out.println("Valor: R$" + this.preco);
	}
}
