package model;

public class Calcas extends Produto{

	int tamanhoCalca;
	
	public Calcas(int numero, String nome, String cor, float preco, int tamanhoCalca) {
		super(numero, nome, cor, preco);
		this.tamanhoCalca = tamanhoCalca;
	}

	public int getTamanhoCalca() {
		return tamanhoCalca;
	}

	public void setTamanhoCalca(int tamanhoCalca) {
		this.tamanhoCalca = tamanhoCalca;
	}
	
	@Override
	public void visualizar() {
		super.visualizar();
		if(tamanhoCalca < 60 && tamanhoCalca > 34) {
			System.out.println("Tamanho: " + tamanhoCalca);
		}
	}

}
