package br.senai;

public class Assalariado extends Empregado{
	@Override
	public String toString() {
		return "Assalariado [" + super.toString() + "salario=" + salario + "]";
	}
	private Double salario;
	
	public Assalariado(String nome, String sobrenome, String cpf, Double salario) {
		super(nome,sobrenome,cpf);
		this.salario = salario;
	}
	public Assalariado(){
	}
	
	@Override
	public Double vencimento() {
		return 0.0;
	}
	
	public Double getSalario() {
		return salario;
	}
	public void setSalario(Double salario) {
		this.salario = salario;
	}
	
}
