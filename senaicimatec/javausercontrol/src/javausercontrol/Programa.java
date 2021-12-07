package javausercontrol;

import java.util.Scanner;

import user.Cliente;

public class Programa {

	public static void main(String[] args) {
		
		Cliente comprador = new Cliente();
		Scanner scan = new Scanner(System.in);
		
		comprador.definirNome(scan.nextLine());
		System.out.println(comprador.pegarNome());
		scan.close();
	}

}
