package primeiraAv;

import java.util.Scanner;

public class Loja {

	public static void main(String[] args) {
		boolean breaker = false;
		Integer cod;
		Double preco;
		Scanner sc = new Scanner(System.in);
		String lsc, nomeProduto;
		char lscc;
		System.out.println("Qual é o seu nome?");
		lsc = sc.nextLine();
		Compra compra = new Compra(lsc);
		do {
			System.out.println("Departamento de:");
			System.out.println("1- Esportes");
			System.out.println("2- Informática");
			System.out.println("3- Sobre o carrinho");
			System.out.println("0- Finalizar compra");
			lsc = sc.nextLine();
			switch(Integer.parseInt(lsc)) {
			case 1: 
				System.out.println("Qual é o produto[esportivo] que você vai comprar?");
				nomeProduto = sc.nextLine();
				System.out.println("Qual é o código do produto[esportivo]?");
				lsc = sc.nextLine();
				cod = Integer.parseInt(lsc);
				System.out.println("Qual é o preço do produto[esportivo]?");
				lsc = sc.nextLine();
				preco = Double.parseDouble(lsc);
				Esporte esportivo = new Esporte(cod, nomeProduto, preco);
				do {
					System.out.println("\n\t" + esportivo);
					System.out.println("Deseja adicionar o produto acima ao carrinho? [S/n]");
					lscc = sc.nextLine().charAt(0);
					if(lscc == 'Y' || lscc == 'y' || lscc == 'S' || lscc == 's') {
						compra.adicionarProduto(esportivo);
					}
					else if(!(lscc == 'n' || lscc == 'N')) {
						System.out.println("Resposta inválida! Digite novamente");
					}
				}
				while(!(lscc == 'n' || lscc == 'N' || lscc == 'Y' || lscc == 'y' || lscc == 'S' || lscc == 's'));
				break;
			case 2:
				System.out.println("Qual é o produto[informática] que você vai comprar?");
				nomeProduto = sc.nextLine();
				System.out.println("Qual é o código do produto[informática]?");
				lsc = sc.nextLine();
				cod = Integer.parseInt(lsc);
				System.out.println("Qual é o preço do produto[informática]?");
				lsc = sc.nextLine();
				preco = Double.parseDouble(lsc);
				Informatica ti = new Informatica(cod, nomeProduto, preco);
				do {
					System.out.println("\n\t" + ti);
					System.out.println("Deseja adicionar o produto acima ao carrinho? [S/n]");
					lscc = sc.nextLine().charAt(0);
					if(lscc == 'Y' || lscc == 'y' || lscc == 'S' || lscc == 's') {
						compra.adicionarProduto(ti);
					}
					else if(!(lscc == 'n' || lscc == 'N')) {
						System.out.println("Resposta inválida! Digite novamente");
					}
				}
				while(!(lscc == 'n' || lscc == 'N' || lscc == 'Y' || lscc == 'y' || lscc == 'S' || lscc == 's'));
				break;
			case 3: 
				compra.statusDaCompra();
				break;
			case 4:
				System.out.println("Valor total da compra: R$" + compra.calcularValorTotalDosProdutos());
				break;
			case 0:
				breaker = true;
				System.out.println("Compra encerrada!!!\n");
				break;
			default: 
				System.out.println("Operação inválida. Responda novamente");
			}
			
		}
		while(!breaker);
		compra.statusDaCompra();
		System.out.println("Valor final da compra: R$" + compra.calcularValorTotalDosProdutos());		
	}

}
