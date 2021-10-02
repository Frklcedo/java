package condAtv;

import java.util.Scanner;

public class DezParesImpares {

	public static void main(String[] args) {
		int n,totImp=0,totPar=0;
		Scanner Enter = new Scanner(System.in);
		for(int i = 0;i<10;i++) {
			System.out.println("Digite o " + (i+1) + "º número");
			n = Enter.nextInt();
			if(n%2==0) {
				totPar++;
			}
			else {
				totImp++;
			}
		}
		System.out.println("Pares: " + totPar);
		System.out.println("Impares: " + totImp);
	}

}
