package repository;

import model.Produto;

public interface IProdutosRepository {
	
	public void cadastrar(Produto produto);
	public void listarProdutos();
	public void atualizarProduto(Produto produto);
	public void deletarProduto(int numero);
	
}
