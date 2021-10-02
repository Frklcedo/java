package prePost;

import java.util.Scanner;

public class PrePost {

	public static void main(String[] args) {
		int x;
		Scanner Enter = new Scanner(System.in);
		System.out.println("Digite um número");
		x = Enter.nextInt();	
		System.out.println("Número\t\t[" + x + "]");
		System.out.println("Antecessor =\t" + (x-1));
		System.out.println("Sucessor =\t" + (x+1));
	}

}
