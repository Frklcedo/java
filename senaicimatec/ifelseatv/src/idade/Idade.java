package idade;

import javax.swing.JOptionPane;

public class Idade {

	public static void main(String[] args) {
		int anoNascetur,idade,anoAtual;
		anoAtual  = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano atual"));
		anoNascetur = Integer.parseInt(JOptionPane.showInputDialog("Digite seu ano de nascimento"));
		idade = anoAtual-anoNascetur;
		JOptionPane.showMessageDialog(null, "Sua idade atual = [" + idade + " anos]");
	}

}
