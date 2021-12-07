package br.senai.av01;

import java.util.ArrayList;
import java.util.Scanner;

/*
	SENAI CIMATEC
	CURSO TÉCNICO EM INFORMÁTICA Turma Desenvolvimento de Sistemas
	
	Disciplina: Desenvolvimento de Sistemas I Docente: Westn Melo
	Data:24/11/2021
	Aluno(a): Franklin Macedo Andrade do Nascimento 
	Nota:
	
*/
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Fisica f1 = new Fisica("Franklin", 20, 1100.0, "06521038849");
		Fisica f2 = new Fisica("Westn", 18, 10000.0, "777544555661");
		Juridica rico1 = new Juridica("Billy Portas", 55, 5556120.99, "15612341651983288");
		
		ArrayList<Contribuinte> listaContribuintes = new ArrayList<>();
		listaContribuintes.add(f1);
		listaContribuintes.add(f2);
		listaContribuintes.add(rico1);	
		
		for(Contribuinte contribuinte: listaContribuintes) {
			System.out.println("_______________________________________________________\n");
			contribuinte.status();
			
			System.out.println("Imposto de renda: " + contribuinte.calcularIR());
		}
	}

}

/* 

Você foi convidado a desenvolver um sistema para calcular o Imposto de Renda dos contribuintes,
que podem ser pessoas físicas ou pessoas jurídicas. Todos os contribuintes devem possuir (nome,
idade e renda bruta). Pessoas físicas além dos atributos do contribuinte, possui cpf e Pessoas
Jurídicas possuem CNPJ.

Todos os contribuintes devem possuir um método status para imprimir seus dados

O cálculo do IR deve ser feito da seguinte maneira:
	Pessoa Jurídica
	O imposto deve corresponder a 10% da renda bruta da empresa.
Pessoa Física
	O imposto deve ser calculado de acordo com a seguinte tabela:
	Renda Bruta Alíquota
	
		Até R$ 2.000,00 10%
		Acima de R$ 2.000,00 20%

Crie uma interface com método para calcular o valor do imposto a ser pago por cada
contribuinte e imprimir na tela.

Na classe Main, instancie todos os objetos e chame todos os métodos para testar

*/