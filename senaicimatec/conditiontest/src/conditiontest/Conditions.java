package conditiontest;
import java.util.Scanner;

public class Conditions {

	public static void main(String[] args) {
		
		Scanner Enter = new Scanner(System.in);
		int n1,n2;
		System.out.println("Digite um valor");
		n1 = Enter.nextInt();
		System.out.println("Digite um segundo valor");
		n2 = Enter.nextInt();
		if(n1==n2) {
			System.out.println("Ambos os numeros tem o mesmo valor");
		}
		else {
			if( n1 > n2 ) {
				System.out.println(n1 + " e maior que " + n2);
			}
			else {
				System.out.println(n2 + " e maior que " + n1);
			}
		}
		
	}

}
