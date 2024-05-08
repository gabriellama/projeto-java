package ecommerce;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import ecommerce.controller.EcommerceController;
import ecommerce.util.Cores;
import ecommerce.model.Ecommerce;


public class Menu {

	public static void main(String[] args) {
		
		EcommerceController ecommerce = new EcommerceController();
		
		Scanner leia = new Scanner(System.in);
		int opcao, numero, quantidade, valor;
		String nome;
		float preco;
		
		while (true) {
		
		System.out.println(Cores.TEXT_BLUE + Cores.ANSI_BLACK_BACKGROUND
				+ "❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️");
		System.out.println("                                                     ");
		System.out.println("              E-COMMERCE CORNIUS                     ");
		System.out.println("                                                     ");
		System.out.println("❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️");
		System.out.println("                                                     ");
		System.out.println("            1 - Cadastrar produtos                   ");
		System.out.println("            2 - Listar todas os produtos             ");
		System.out.println("            3 - Procurar produto por ID              ");
		System.out.println("            4 - Atualizar produto                    ");
		System.out.println("            5 - Deletar produto                      ");
		System.out.println("            6 - Sair                                 ");
		System.out.println("                                                     ");
		System.out.println("❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️");
		System.out.println("                                                     ");
		System.out.println("Entre com a opção desejada:                          ");
		System.out.println("                                                     " + Cores.TEXT_RESET);
		
		try {
			opcao = leia.nextInt();
		}catch(InputMismatchException e){
			System.out.println(Cores.TEXT_RED_BOLD + "\nDigite valores inteiros!");
			leia.nextLine();
			opcao=0;
		}
		
		if(opcao == 6) {
			System.out.println(Cores.TEXT_WHITE_BOLD + "\nE-commerce Cornius - Obrigada por fazer parte da empresa!" + Cores.TEXT_RESET);
			sobre();
			leia.close();
			System.exit(0);
		}

		switch(opcao) {
			case 1:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Cadastrar produtos\n\n");
				
				System.out.println("Digite o nome do produto: ");
				leia.skip("\\R?");
				nome = leia.nextLine();
				System.out.println("Digite a quantidade do produto: ");
				quantidade = leia.nextInt();
				
				System.out.println("Digite o valor do produto unitário (R$): ");
				preco = leia.nextFloat();
				
				//Ecommerce listaProdutos = new Ecommerce(ecommerce.gerarNumero(), quantidade, nome, preco);
				ecommerce.cadastrar(new Ecommerce(ecommerce.gerarNumero(), quantidade, nome, preco));
				
				keyPress();
				break;
			case 2:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Listar todos os produtos\n\n");
				ecommerce.listarTodos();
				keyPress();
				break;
			case 3:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Procurar produto por ID\n\n");
				
				System.out.println("Digite o ID do produto: ");
				numero = leia.nextInt();
				
				ecommerce.procurarPorNumero(numero);
				
				keyPress();
				break;
			case 4:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Atualizar produto\n\n");
				
				System.out.println("Digite o ID do produto: ");
				numero = leia.nextInt();
				
				var buscarProduto = ecommerce.buscarNaCollection(numero);
				
				if(buscarProduto != null) {
					
					
					System.out.println("Digite o nome do produto: ");
					leia.skip("\\R?");
					nome = leia.nextLine();
					System.out.println("Digite a quantidade do produto: ");
					quantidade = leia.nextInt();
					
					System.out.println("Digite o valor do produto unitário (R$): ");
					preco = leia.nextFloat();
					
					ecommerce.atualizar(new Ecommerce(ecommerce.gerarNumero(), quantidade, nome, preco));
					
				} else {
					System.out.println("O produto não foi encontrado!");
				}
				
				keyPress();
				break;
			case 5:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Deletar produto\n\n");
				
				keyPress();
				break;
			default:
				System.out.println(Cores.TEXT_RED_BOLD +"\nDigite um opção válida!" + Cores.TEXT_RESET);
				keyPress();
				break;
			}
		}
	}		
		public static void sobre() {
			System.out.println(Cores.TEXT_BLUE_BOLD + "\n❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️");
			System.out.println("Projeto Desenvolvido por: ");
			System.out.println("Gabriella Martins Alvares - contato.gabriellama@gmail.com");
			System.out.println("github.com/gabriellama");
			System.out.println("❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️" + Cores.TEXT_RESET);
			}

			public static void keyPress() {
		
			try {
		
				System.out.println(Cores.TEXT_RESET + "\n\nPressione Enter para Continuar...");
				System.in.read();
		
			} catch (IOException e) {
		
				System.out.println("Você pressionou uma tecla diferente de enter!");
		
			}
		}

	}
