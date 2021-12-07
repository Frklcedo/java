package medicalHierarchy;

public class MedicoAuxiliar extends Medico{
	
	public MedicoAuxiliar(String crm, String nome, Integer idade, Double salario) {
		super(crm, nome, idade, salario);
	}

	@Override
	public void medicoAposentado() {
		if(idade > 60) {
			System.out.println("O médico auxiliar " + nome + " já está aposentado");
		}
		else {
			System.out.println("Faltam " + (60-idade) + " anos para " + nome + "(médico auxiliar) se aposentar");	
		}
	}	
}
