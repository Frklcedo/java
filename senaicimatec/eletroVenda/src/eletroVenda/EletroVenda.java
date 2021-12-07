package eletroVenda;

import java.util.ArrayList;
import java.util.Scanner;

public class EletroVenda {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String op, marca, cor, descricao;	
		Double preco, voltagem;
		double litros, segundos;
		int helices, mes = 12;
		
		System.out.println("Qual é o objeto de venda?");
		System.out.println("1- Liquidificador");
		System.out.println("2- Ferro de passar");
		System.out.println("3- Batedeira");
		op = sc.nextLine();
		switch(Integer.parseInt(op)) {
		case 1:
			System.out.print("Marca do produto: ");
			marca = sc.nextLine();
			System.out.print("Preço do produto: ");
			preco = sc.nextDouble();
			System.out.print("Voltagem do produto: ");
			voltagem = sc.nextDouble();
			Liquidificador item = new Liquidificador(marca,preco,voltagem);
			do {
				System.out.println("Sobre seu liquidificador");
				System.out.println("1- Sobre a tampa");
				System.out.println("2- Customizar tampa");
				System.out.println("3- Capacidade do liquidificador");
				System.out.println("4- Possível desconto");
				System.out.println("0- FINALIZAR COMPRA");
				
				op = sc.nextLine();
				if (op == "") {
					op = sc.nextLine();
				}
				switch(Integer.parseInt(op)) {
				case 1:
					item.sobreATampa(); break;
				case 2:
					System.out.println("Qual é a cor da tampa? [ATUAL=" + item.tampa.getCor() + "]");
					cor = sc.nextLine();
					item.setCorTampa(cor);
					System.out.println("Qual é a descrição/agregação da tampa? [ATUAL=" + item.tampa.getAgregacao() + "]");
					descricao = sc.nextLine();
					item.setAgregacaoTampa(descricao);
					break;
				case 3:
					System.out.print("Quantidade em litros[ L ] adicionada: ");
					litros = sc.nextDouble();
					System.out.print("Segundos[ s ] de em uso: ");
					segundos = sc.nextDouble();
					System.out.println("Quantidade média: " + item.litrosPorSegundo(litros, segundos) + "L/s");
					break;
				case 4:
					if(item.desconto(mes) == 0) {
						System.out.println("Não há desconto nesse mês");
					}
					else {
						System.out.println("Desconto: " + item.desconto(mes));
					}
					break;
				case 0:
					System.out.println("Compra finalizada!!!");	break;	
				default: 
					System.out.println("Operação inválida. Digite novamente");
				}
			} 
			while(Integer.parseInt(op) != 0);
			System.out.println(item);
			break;
		case 2:
			System.out.print("Marca do produto: ");
			marca = sc.nextLine();
			System.out.print("Preço do produto: ");
			preco = sc.nextDouble();
			System.out.print("Voltagem do produto: ");
			voltagem = sc.nextDouble();
			FerroDePassar item1 = new FerroDePassar(marca, preco, voltagem);
			do {
				System.out.println("Sobre seu ferro de passar");
				System.out.println("1- Informações");
				System.out.println("2- Possível desconto");
				System.out.println("0- FINALIZAR COMPRA");
				op = sc.nextLine();
				if (op == "") {
					op = sc.nextLine();
				}
				switch(Integer.parseInt(op)) {
				case 1:
					System.out.println(item1);
					break;
				case 2: 
					if(item1.desconto(mes) == 0) {
						System.out.println("Não há desconto nesse mês");
					}
					else {
						System.out.println("Desconto: " + item1.desconto(mes));
					}
					break;
				case 0: 
					System.out.println("Compra finalizada!!!");	break;	
				default: 
					System.out.println("Operação inválida. Digite novamente");
				}
			}
			while(Integer.parseInt(op) != 0);
			System.out.println(item1);
			break;
		case 3: 
			System.out.print("Marca do produto: ");
			marca = sc.nextLine();
			System.out.print("Preço do produto: ");
			preco = sc.nextDouble();
			System.out.print("Voltagem do produto: ");
			voltagem = sc.nextDouble();
			System.out.println("Qual é a sua preferência de quantidade de hélices");
			helices = sc.nextInt();
			Batedeira item2 = new Batedeira(marca, preco, voltagem, helices);		
			do {
				System.out.println("Sobre seu ferro de passar");
				System.out.println("1- Informações");
				System.out.println("2- Capacidade da batedeira");
				System.out.println("3- Possível desconto");
				System.out.println("0- FINALIZAR COMPRA");

				op = sc.nextLine();
				if (op == "") {
					op = sc.nextLine();
				}

				switch(Integer.parseInt(op)) {
				case 1:
					System.out.println(item2);
					break;
				case 2: 
					System.out.print("Quantidade em litros[ L ] adicionada: ");
					litros = sc.nextDouble();
					System.out.print("Segundos[ s ] de em uso: ");
					segundos = sc.nextDouble();
					System.out.println("Quantidade média: " + item2.litrosPorSegundo(litros, segundos) + "L/s");
					break;
				case 3:
					if(item2.desconto(mes) == 0) {
						System.out.println("Não há desconto nesse mês");
					}
					else {
						System.out.println("Desconto: " + item2.desconto(mes));
					}
					break;
				case 0: 
					System.out.println("Compra finalizada!!!");	break;	
				default: 
					System.out.println("Operação inválida. Digite novamente");
				}
			}
			while(Integer.parseInt(op) != 0);
			System.out.println(item2);
			break;
			
		// Caso opção inválida
		default:
			System.out.println("Venda encerrada!");
		}
	}

}
