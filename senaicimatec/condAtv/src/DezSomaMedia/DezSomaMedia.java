package DezSomaMedia;

import java.util.Scanner;

public class DezSomaMedia {

	public static void main(String[] args) {
		int n,sumImp=0,totImp=0,sumPar=0;
		float mediaImp;
		Scanner Enter = new Scanner(System.in);
		for(int i = 0;i<10;i++) {
			System.out.println("Digite o " + (i+1) + "º número");
			n = Enter.nextInt();
			if(n%2==0) {
				sumPar+=n;
			}
			else {
				totImp++;
				sumImp+=n;
			}
		}
		System.out.println("A soma dos pares é de: " + sumPar);
		mediaImp = sumImp/totImp;
		System.out.println("A média dos impares é de: " + mediaImp);
	}

}
