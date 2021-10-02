package media;

import java.util.Scanner;

public class Media {
		
	public static void main(String[] args) {
		int a, b;
		Scanner Tc = new Scanner(System.in);
		System.out.println("Digite dois valores");
		System.out.print("Primeiro valor: ");
		a = Tc.nextInt();
		System.out.print("Segundo valor: ");
		b = Tc.nextInt();
		System.out.println("Media entre os valores " + a + " e " + b + " eh de " + ((a+b)/2));
	}
}
