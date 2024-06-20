package model; 

public class Tenis extends Produto {

	int tamanhoTenis;
	
	public Tenis(int numero, String nome, String cor, int tamanhoTenis ,float preco) {
		super(numero, nome, cor, preco);
		this.tamanhoTenis = tamanhoTenis;
	}

	public int getTamanhoTenis() {
		return tamanhoTenis;
	}

	public void setTamanhoTenis(int tamanhoTenis) {
		this.tamanhoTenis = tamanhoTenis;
	}
	
	@Override
	public void visualizar() {
		super.visualizar();
		if(tamanhoTenis < 50 && tamanhoTenis > 29) {
			System.out.println("Tamanho: " + tamanhoTenis);
		}
	}

	
}
