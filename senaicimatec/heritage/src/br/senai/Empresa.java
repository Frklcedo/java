package br.senai;

public class Empresa {

	public static void main(String[] args) {
		Assalariado profissional1 = new Assalariado("Jarvas","Gane", "022.262.552-55", 1100.00);
		Comissionado c1 = new Comissionado("Hobbit", "Baggins", "432.424.432-23", 5163.50,400.0);
		Horista h1 = new Horista("Relo", "Gio", "789.685.254-56", 5.25, 160.0);
		
		System.out.println(profissional1.vencimento());
		System.out.println(c1.vencimento());
		System.out.println(h1.vencimento());
		System.out.println(profissional1);
		System.out.println(c1);
		System.out.println(h1);
	}

}
