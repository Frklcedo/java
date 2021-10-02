package whileDez;

import java.util.Scanner;

public class DezWhile {

	public static void main(String[] args) {
		int i=1,n,par=0,impar=0;
		Scanner Enter = new Scanner(System.in);
		while(i<=10){
			System.out.println("Digite o " + (i++) + " número");
			n = Enter.nextInt();
			if(n%2==0) {
				par++;
			}
			else {
				impar++;
			}
		}
		System.out.println("Número de pares: " + par);
		System.out.println("Número de ímpares: " + impar);
		
	}

}
