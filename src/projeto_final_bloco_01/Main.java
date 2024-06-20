package projeto_final_bloco_01;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
	Scanner scanner = new Scanner(System.in);
	
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
	}
	

	}

}
