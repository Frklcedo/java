package testio1;

import javax.swing.JOptionPane;

public class Testio1 {

	public static void main(String[] args) {
		String nome;
		float n1,n2,n3,n4, med;
		JOptionPane.showMessageDialog(null,"Ola, seja bem vindo!!!");
		nome = JOptionPane.showInputDialog("Digite seu nome");
		n1 = Float.parseFloat(JOptionPane.showInputDialog("Digite sua primeira nota"));
		n2 = Float.parseFloat(JOptionPane.showInputDialog("Digite sua segunda nota"));
		n3 = Float.parseFloat(JOptionPane.showInputDialog("Digite sua terceira nota"));
		n4 = Float.parseFloat(JOptionPane.showInputDialog("Digite sua quarta nota"));
		
		med = (n1 + n2 + n3 + n4)/ 4;
		
		System.out.println(nome + ", sua media esse ano foi de " + med);
		System.out.println(med>=7? "Aprovado":"Reprovado");
	}

}
