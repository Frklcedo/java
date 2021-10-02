package calculator;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Calculator {

	public static void main(String[] args) {
		char op;
		int nop = 0;
		float a,b,y = 0;
		Scanner Dg = new Scanner(System.in);
		System.out.print("Digite o primeiro valor:\t");
		a = Dg.nextFloat();
		System.out.print("Digite o segundo valor: \t");
		b = Dg.nextFloat();
		System.out.println("Digite a operação");
		System.out.println("Adição   \t[ + ]");
		System.out.println("Subtração\t[ - ]");
		System.out.println("Multiplicação\t[ * ]");
		System.out.println("Divisão  \t[ / ]");
		Dg.nextLine();
		op = Dg.nextLine().charAt(0);
		switch(op) {
		case '+': y = a + b;nop=1; break;
		case '-': y = a - b;nop=2; break;
		case '*': y = a * b;nop=3; break;
		case '/': y = a / b;nop=4; break;
		default: JOptionPane.showMessageDialog(null,"Operação inválida");
		}
		if(nop>=1 && nop<=4){
			JOptionPane.showMessageDialog(null,"Resultado\n" + y);
		}
	}

}
