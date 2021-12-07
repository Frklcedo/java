package televisao;

import java.util.Scanner;

public class Televisao {
	public static void main(String[] args) {
		
		Scanner enter = new Scanner(System.in);
		char ontv,op;
		int i,j,canal;
		int TVHEIGHT = 8, TVWIDTH = 24;
		ControleRemoto control = new ControleRemoto();
		do {
			System.out.println("Ligar televisão? \n[ n - para fechar programa ]\n[ s - para status da tv ]");
			ontv = enter.next().charAt(0);
			if(ontv == 's' || ontv == 'S') {
				control.status();
			}
			else if(ontv != 'n' && ontv != 'N') {
				System.out.println();
				control.ligarTV();				
				System.out.println();
				do {
					for(i = 0;i<=TVHEIGHT;i++) {
						System.out.print("||");
						for(j=0;j<=TVWIDTH;j++) {
							if(i==0 || i==TVHEIGHT) {
								System.out.print("=");
							}
							else {
								System.out.print(" ");
							}
						}
						System.out.println("||");
					}
					System.out.println("\n");
					System.out.println("  Volume\t Canal");
					System.out.println("  ( + )\t\t ( > )");
					System.out.println("       \t\t      ");
					System.out.println("  ( - )\t\t ( < )");
					System.out.println();
					System.out.println("\t c - digitar canal");
					System.out.println("\t i - info");
					System.out.println("\t d - desligar\n");
					op = enter.next().charAt(0);
					if(op >= 'A' && op<= 'Z') {
						op = Character.toLowerCase(op);
					}
					switch(op) {
					case '+':
					case '-': System.out.println("\nVol: " + control.alterarVolume(op));
						System.out.println();
						break;
					case '>':
					case '<': System.out.println("\nCanal: " + control.alterarCanal(op));
						System.out.println();
						break;
					case 'i': control.status();
						break;
					case 'c':
						System.out.println("\n   1   2   3");
						System.out.println("   4   5   6");
						System.out.println("   7   8   9");
						System.out.println("       0    ");
						canal = enter.nextInt();
						System.out.println("Canal: " + control.setCanal(canal));
						break;
					case 'd': control.desligarTV();
						break;
					default: System.out.println("Resposta inválida"); continue;
					}
				}
				while(op != 'd');
			}
			else {
				break;
			}
		}
		while(true);
	}
}
