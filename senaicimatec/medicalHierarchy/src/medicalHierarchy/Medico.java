package medicalHierarchy;

public class Medico {
	protected String crm;
	protected String nome;
	protected Integer idade;
	protected Double salario;
	
	// Construct
	public Medico(String crm,String nome,Integer idade,Double salario) {
		this.crm = crm;
		this.nome = nome;
		this.idade = idade;
		this.salario = salario;
	}
	
	// Calculo de aposentadoria (se o medico tiver mais de 55 anos ele estará aposentado)
	public void medicoAposentado() {
		if(idade > 55) {
			System.out.println("O médico " + nome + " já está aposentado");
		}
		else {
			System.out.println("Faltam " + (55-idade) + " anos para " + nome + " se aposentar");	
		}
	}
	
	public Double valorAposentadoria() {
		return getSalario() * 0.8;
	}
	
	// getters e setters
	public String getCrm() {
		return crm;
	}
	public void setCrm(String crm) {
		this.crm = crm;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getIdade() {
		return idade;
	}
	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	public Double getSalario() {
		return salario;
	}
	public void setSalario(Double salario) {
		this.salario = salario;
	}
}
