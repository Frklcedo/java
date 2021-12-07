package br.senai.av01;

public class Fisica extends Contribuinte{
	//Atributos de Contribuinte (nome,idade e renda bruta)
	// Métodos de PessoaImp [ calcularIR() ,  status()  ]
	private String cpf;

	public Fisica(String nome, Integer idade,Double rendaBruta, String cpf) {
		super(nome, idade, rendaBruta);
		setCpf(cpf);
	}
	
	@Override
	public void status() {
		super.status();		
		System.out.println("CPF: " + getCpf());
	}
	@Override
	public Double calcularIR() {
		if(this.getRendaBruta()>=0 && this.getRendaBruta()<=2000) {
			return getRendaBruta()*10/100;
		}
		else if (this.getRendaBruta()>2000) {
			return getRendaBruta()*20/100;
		}
		return null;
	}

	// getters e setters
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
}

/*

Pessoa Física
	O imposto deve ser calculado de acordo com a seguinte tabela:
	Renda Bruta Alíquota
	
		Até R$ 2.000,00 10%
		Acima de R$ 2.000,00 20%
		
*/
