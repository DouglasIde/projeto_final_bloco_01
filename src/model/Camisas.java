package model;

public class Camisas extends Produto {

	private String tamanhoCamisa;
	
	public Camisas(int numero, String nome, String tamanhoCamisa ,String cor, float preco) {
		super(numero, nome, cor, preco);
		this.tamanhoCamisa = tamanhoCamisa;
	}

	public String getTamanhoCamisa() {
		return tamanhoCamisa;
	}

	public void setTamanhoCamisa(String tamanhoCamisa) {
		this.tamanhoCamisa = tamanhoCamisa;
	}
	
	@Override
	public void visualizar() {
		super.visualizar();
		if(this.tamanhoCamisa.equalsIgnoreCase("PP") || this.tamanhoCamisa.equalsIgnoreCase("P") || 
				this.tamanhoCamisa.equalsIgnoreCase("M") || this.tamanhoCamisa.equalsIgnoreCase("G") || 
				this.tamanhoCamisa.equalsIgnoreCase("GG")){
			System.out.println("Tamanho: " + this.tamanhoCamisa);
		}
	}

}
