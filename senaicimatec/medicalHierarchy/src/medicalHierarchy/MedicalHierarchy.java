package medicalHierarchy;

import java.util.Scanner;

public class MedicalHierarchy {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Medico medico = new Medico("159641949641","Jorge",57,15000.0);
		
		medico.medicoAposentado();
		System.out.println("Valor da aposentadoria de " + medico.getNome() + ": R$" + medico.valorAposentadoria());
		
		System.out.println("\n\n");
		
		MedicoAuxiliar medico1 = new MedicoAuxiliar("159641949641","Westn",57,11000.0);
		
		medico1.medicoAposentado();
		System.out.println("Valor da aposentadoria de " + medico1.getNome() + ": R$" + medico1.valorAposentadoria());
		
		System.out.println("\n\n");
		
		MedicoCirurgiao medico2 = new MedicoCirurgiao("159641949641","Jorge",57,15000.0);
		
		medico2.medicoAposentado();
		System.out.println("Valor da aposentadoria de " + medico2.getNome() + ": R$" + medico2.valorAposentadoria());


	}

}
