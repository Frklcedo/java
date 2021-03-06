package br.senai;

import java.util.Scanner;

import conta.Conta;

public class Programa {

	public static void main(String[] args) {
		
		// Declaração de variáveis
		int op,op2,oper;
		double depot,value;
		Scanner Enter = new Scanner(System.in);
		Conta minhaConta = new Conta();
		Conta minhaConta2 = new Conta();
		
		minhaConta.abrirConta();
		minhaConta.setDono("Anderson");
		minhaConta.setNumero(0001);
		minhaConta.depositar(20000);
		minhaConta.setLimite(2500);
		minhaConta.depositar(500);
		
		do {
			System.out.println("\nSelecione a operação de escolha:");
			System.out.println("\t1- Ativar conta");
			System.out.println("\t2- Entrar em conta");
			System.out.println("\t0- Encerrar programa");
			op = Enter.nextInt();
			if(op==0) {
				break;
			}
			else {
				if(op==1){
					do {
						System.out.println("\nAtivação de conta");
						System.out.print("\t1- conta: " + minhaConta.getDono());
						System.out.print(minhaConta.ativa()? " (Ativa)\n":"\n");
						if(minhaConta2.getDono()==null) {
							System.out.println("\t2 - Criar nova conta");
						}
						else {
							System.out.print("\t2- conta: " + minhaConta2.getDono());
							System.out.print(minhaConta2.ativa()? " (Ativa)\n":"\n");
						}
						System.out.println("\t0- Cancelar ativação de conta");
						op2 = Enter.nextInt();
						switch(op2) {
						case 1:
							if(minhaConta.ativa()) {
								System.out.println("Conta já está ativa");
							}
							else {
								minhaConta.abrirConta();
								System.out.println("Conta ativada com sucesso");
							}
							break;
						case 2: 
							minhaConta2.abrirConta();
							if(minhaConta2.getDono()==null) {
								System.out.println("Digite o nome do dono da conta");
								Enter.nextLine();
								minhaConta2.setDono(Enter.nextLine());
								System.out.println("Digite número para a conta");
								minhaConta2.setNumero(Enter.nextInt());
								System.out.println("Depósito inicial? (caso não, digitar \"0\")");
								depot = Enter.nextDouble();
								minhaConta2.depositar(depot);
								minhaConta2.setLimite(depot);
								minhaConta2.status();
								System.out.println("Conta criada com sucesso");
							}
							else {
								if(minhaConta.ativa()) {
									System.out.println("Conta já está ativa");
								}
								else {
									minhaConta.abrirConta();
									System.out.println("Conta ativada com sucesso");
								}
							}
							break;
						case 0:
							System.out.println("Ativação de conta cancelada");
							break;
						default: 
							System.out.println("Opção inválida");
							continue;
						}
						break;
					}
					while(true);
				}
				else {
					if(op==2) {
						do {
							System.out.println("\nEntrar em conta");
							System.out.println("\t1- conta: " + minhaConta.getDono());
							System.out.println((minhaConta2.getDono()!=null)? "\t2- conta: " + minhaConta2.getDono():"");
							System.out.println("\t0- Cancelar entrada em conta");
							op2 = Enter.nextInt();
							if(minhaConta.ativa() && op2 == 1) {
								System.out.println("__________________________________________\n");
								do {
									minhaConta.status();
									System.out.println("\nDigite a operação desejada");
									System.out.println("\t1- Consultar saldo");
									System.out.println("\t2- Depósito");
									System.out.println("\t3- Saque");
									System.out.println("\t4- Fechar conta");
									System.out.println("\t0- Sair da conta");
									oper = Enter.nextInt();
									switch(oper) {
									case 1:
										minhaConta.consultarSaldo();
										continue;
									case 2:
										System.out.println("\t\tInserir valor de depósito");
										value = Enter.nextDouble();
										minhaConta.depositar(value);
										continue;
									case 3:
										System.out.println("\t\tInserir valor de saque");
										value = Enter.nextDouble();
										minhaConta.sacar(value);
										continue;
									case 4:
										minhaConta.fecharConta();
										continue;
									case 0:
										System.out.println("Saída da conta efetuada");
										break;
									default:
										System.out.println("Operação inválida");
										continue;
									}
									break;
								}
								while(true);
							}
							else {
								if(minhaConta2.ativa() && op2 == 2) {
									System.out.println("__________________________________________\n");
									do {
										minhaConta2.status();
										System.out.println("\nDigite a operação desejada");
										System.out.println("\t1- Consultar saldo");
										System.out.println("\t2- Depósito");
										System.out.println("\t3- Saque");
										System.out.println("\t4- Fechar conta");
										System.out.println("\t0- Sair da conta");
										oper = Enter.nextInt();
										switch(oper) {
										case 1:
											minhaConta2.consultarSaldo();
											continue;
										case 2:
											System.out.println("\t\tInserir valor de depósito");
											value = Enter.nextDouble();
											minhaConta2.depositar(value);
											continue;
										case 3:
											System.out.println("\t\tInserir valor de saque");
											value = Enter.nextDouble();
											minhaConta2.sacar(value);
											continue;
										case 4:
											minhaConta2.fecharConta();
											continue;
										case 0:
											System.out.println("Saída da conta efetuada");
											break;
										default:
											System.out.println("Operação inválida");
											continue;
										}
										break;
									}
									while(true);
									
								}
								else {
									if(op2==0) {
										System.out.println("Entrada em conta cancelada");
										break;
									}
									else {
										System.out.println("Opção inválida. Digite novamente");
										continue;
									}
								}
							}
						}
						while(true);
					}
					else {
						System.out.println("Operação inválida");
						continue;
					}
				}
			}
			
		}
		while(true);
		System.out.println("Programa encerrado");
		Enter.close();
	}

}
