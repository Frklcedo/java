package testio;
import java.util.Scanner;

public class TestIO {

	public static void main(String[] args) {
		
		int idade;
		String nome;
		float n1,n2,n3,n4;
		
		Scanner tc = new Scanner(System.in);
		
		System.out.print("Digite seu nome: ");
		nome = tc.nextLine();
		System.out.println("Digite sua idade: ");
		idade = tc.nextInt();
		
		System.out.println("Aluno: " + nome + "\tIdade: " + idade);
		
		System.out.print("Ola " + nome + ", digite sua nota da primeira unidade: ");
		n1 = tc.nextFloat();
		System.out.print(nome + ", digite sua nota da segunda unidade: ");
		n2 = tc.nextFloat();
		System.out.print(nome + ", digite sua nota da terceira unidade: ");
		n3 = tc.nextFloat();
		System.out.print(nome + ", digite sua nota da quarta unidade: ");
		n4 = tc.nextFloat();
		
		System.out.println("\nAluno: " + nome + "\tIdade: " + idade);
		System.out.println( "\nmedia total = " + (n1+n2+n3+n4)/4);
		System.out.println(((n1+n2+n3+n4)/4)>=7.0? "Aprovado":"Reprovado");
	}

}
