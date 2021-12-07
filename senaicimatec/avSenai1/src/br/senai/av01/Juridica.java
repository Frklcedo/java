package br.senai.av01;

public class Juridica extends Contribuinte{
	//Atributos de Contribuinte (nome,idade e renda bruta)
	// Métodos de PessoaImp [ calcularIR() ,  status()  ]
	private String cnpj;

	public Juridica(String nome, Integer idade,Double rendaBruta, String cnpj) {
		super(nome, idade, rendaBruta);
		this.setCnpj(cnpj);
	}
	
	@Override
	public void status() {
		super.status();		
		System.out.println("CNPJ: " + getCnpj());
	}
	@Override
	public Double calcularIR() {
		Double imposto = this.getRendaBruta() * 10/100;
		return imposto;
	}
	
	// getters e setters
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
}
/*

Pessoas
Jurídicas possuem CNPJ

Pessoa Jurídica
	O imposto deve corresponder a 10% da renda bruta da empresa.

*/