package controller;

import java.util.ArrayList;

import model.Produto;
import repository.IProdutosRepository;


public class ProdutoController implements IProdutosRepository{

	private ArrayList<Produto> listaProdutos = new ArrayList<Produto>();

	@Override
	public void cadastrar(Produto produto) {
		listaProdutos.add(produto);
		System.out.println("O produto " + produto.getNome() + " foi Criado com Sucesso!");
	}

	@Override
	public void listarProdutos() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void atualizarProduto(Produto produto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deletarProduto(int numero) {
		// TODO Auto-generated method stub
		
	}
	
	
}
