package vendaeletronicos;

import java.util.Scanner;

import produto.Celular;

public class Venda {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String scan;
		Celular cel = new Celular("Redmi", "preta", "Note 8", 2550.00);
		System.out.println(cel.getVendaFinal());
	}

}
