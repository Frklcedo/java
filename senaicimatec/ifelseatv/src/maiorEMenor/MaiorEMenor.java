package ifelseatv;

import java.util.Scanner;

public class MaiorEMenor {

	public static void main(String[] args) {
		
		int n1,n2;
		Scanner tc = new Scanner(System.in);
		System.out.println("Digite dois valores");
		System.out.print("Primeiro valor: ");
		n1 = tc.nextInt();
		System.out.print("Segundo valor: ");
		n2 = tc.nextInt();
		if (n1>n2) {
			System.out.printf("Maior = [%d] / Menor = [%d]\n",n1,n2);
		}
		else {
			if (n2>n1) {
				System.out.printf("Maior = [%d] / Menor = [%d]\n",n2,n1);
			}
			else {
				System.out.println("Os números são iguais");
			}
		}
		

	}

}
