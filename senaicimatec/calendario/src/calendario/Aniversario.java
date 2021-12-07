package calendario;

import java.util.*;

public class Aniversario {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Calendar hoje = Calendar.getInstance();
		String nome;
		int nascimentoDia;
		int nascimentoMes;
		int nascimentoAno;
		int idade;
		
		int ano = hoje.get(Calendar.YEAR);
		int mes = hoje.get(Calendar.MONTH) + 1;
		int dia = hoje.get(Calendar.DAY_OF_MONTH);
		int hora = hoje.get(Calendar.HOUR_OF_DAY);
		int minutos= hoje.get(Calendar.MINUTE);
		int segundos= hoje.get(Calendar.SECOND);
		
		System.out.printf("Data:\t%02d/%02d/%d %02d:%02d:%02d\n",dia,mes,ano,hora,minutos,segundos);
		System.out.println("___________________________________________________________________\n");
		System.out.println("Qual é o seu nome?");
		nome = sc.nextLine();
		System.out.println("Que ANO nasceu?");
		nascimentoAno = sc.nextInt();
		System.out.println("Que MÊS desse ano?");
		nascimentoMes = sc.nextInt();
		System.out.println("Que DIA desse mês?");
		nascimentoDia = sc.nextInt();
		idade = ano - nascimentoAno - 1;
		if(nascimentoMes <= mes) {
			if(nascimentoMes == mes){
				if(nascimentoDia <= dia) {
					idade++;
				}
			}
			else {
				idade++;
			}
		}
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
	}

}
