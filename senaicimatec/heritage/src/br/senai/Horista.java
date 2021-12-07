package br.senai;

public class Horista extends Empregado{
	private Double precoHora;
	private Double horasTrabalhadas;
	public Horista(String nome, String sobrenome, String cpf, Double precoHora, Double horasTrabalhadas) {
		super(nome,sobrenome,cpf);
		this.precoHora = precoHora;
		this.horasTrabalhadas = horasTrabalhadas;
	}
	public Horista(){
	}
	
	@Override
	public Double vencimento() {
		return 0.0;
	}
	
	public Double getPrecoHora() {
		return precoHora;
	}
	public void setPrecoHora(Double precoHora) {
		this.precoHora = precoHora;
	}
	public Double getHorasTrabalhadas() {
		return horasTrabalhadas;
	}
	public void setHorasTrabalhadas(Double horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}
	@Override
	public String toString() {
		return "Horista [" + super.toString() + "precoHora=" + precoHora + ", horasTrabalhadas=" + horasTrabalhadas + "]";
	}
	
}
