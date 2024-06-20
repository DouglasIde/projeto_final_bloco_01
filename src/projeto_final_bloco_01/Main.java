package projeto_final_bloco_01;

import model.*;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
	Scanner scanner = new Scanner(System.in);
	
	Camisas camisa1 = new Camisas(123, "Camiseta do Corinthians", "G", "Preto", 300f);
	camisa1.visualizar();
	
	Tenis tenis1 = new Tenis(312, "Nike Air Jordan", "Branco e Vermelho", 42, 1000f);
	tenis1.visualizar();
	
	Calcas calca1 = new Calcas(532, "Calça Jeans", "Azul Marinho", 200f, 42);
	calca1.visualizar();
	
	int opcao;
	
	while(true) {
		System.out.println("""
				
				************************
				
				CENTOURO
				
				************************
				Selecione uma das opções abaixo:
				
				1 - Cadastrar Produto
				2 - Listar todos os Produtos
				3 - Atualizar um Produto
				4 - Apagar um Produto
				5 - Sair
				
				Digite a sua opção:
				""");
		opcao = scanner.nextInt();
		
		switch(opcao) {
		case 1:
			System.out.println("****** CADASTRAR PRODUTO ******");
			break;
		case 2:
			System.out.println("****** LISTAR TODOS OS PRODUTOS ******");
			break;
		case 3:
			System.out.println("****** ATUALIZAR UM PRODUTO ******");
			break;
		case 4:
			System.out.println("****** APAGAR UM PRODUTO ******");
			break;
		case 5:
			System.out.println("SAINDO...");
			return;
			default:
				System.out.println("Por favor digite uma das opções acima!");
				break;
		}
	}
	

	}

}
