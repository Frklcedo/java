package oddsEvens;

import java.util.Scanner;

public class OddsEvens {

	public static void main(String[] args) {
		int oe;
		Scanner Enter = new Scanner(System.in);
		System.out.println("Digite um valor");
		oe = Enter.nextInt();
		if (oe % 2 == 0) {
			System.out.println("Par");
			System.out.println("Sua metade: " + (oe / 2 ));
		}
		else {
			System.out.println("Impar");
			System.out.println("Seu triplo: " + (oe * 3 ));
		}
	}

}
