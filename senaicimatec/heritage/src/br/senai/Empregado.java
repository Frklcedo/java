package br.senai;

public abstract class Empregado {
	
	private String nome;
	private String sobrenome;
	private String cpf;
	
	public Empregado(String nome, String sobrenome, String cpf) {
		this.nome=nome;
		this.sobrenome=sobrenome;
		this.cpf=cpf;
	}
	public Empregado() {
		
	}
	public abstract Double vencimento();
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	@Override
	public String toString() {
		return "nome=" + nome + ", sobrenome=" + sobrenome + ", cpf=" + cpf;
	}
	
}
