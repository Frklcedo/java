package medicalHierarchy;

public class MedicoCirurgiao extends Medico{
	
	public MedicoCirurgiao(String crm, String nome, Integer idade, Double salario) {
		super(crm, nome, idade, salario);
	}

	@Override
	public void medicoAposentado() {
		if(idade > 50) {
			System.out.println("O médico cirurgião " + nome + " já está aposentado");
		}
		else {
			System.out.println("Faltam " + (50-idade) + " anos para " + nome + "(médico cirurgião) se aposentar");	
		}
	}	
	
	@Override
	public Double valorAposentadoria() {
		return super.valorAposentadoria()+800;
	}
}
