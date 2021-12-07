package br.senai.av01;

public abstract class Contribuinte implements PessoaImp{
	
	//Atributos de Contribuinte (nome,idade e renda bruta)
	// Métodos de PessoaImp [ calcularIR() ,  status()  ]
	private String nome;
	private Integer idade;
	private Double rendaBruta;
	
	// construct
	public Contribuinte(String nome, Integer idade,Double rendaBruta){
		this.setNome(nome);
		this.setIdade(idade);
		this.setRendaBruta(rendaBruta);
	}	
	
	public void status() {
		System.out.println("Nome: " + getNome());
		System.out.println("\nIdade: " + getIdade());
		System.out.println("Renda Bruta: " + getRendaBruta());
	}
	
	public abstract Double calcularIR();
	
	// getters and setters
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
	public Double getRendaBruta() {
		return rendaBruta;
	}
	public void setRendaBruta(Double rendaBruta) {
		this.rendaBruta = rendaBruta;
	}
}

/*

que podem ser pessoas físicas ou pessoas jurídicas. Todos os contribuintes devem possuir (nome,
idade e renda bruta). Pessoas físicas além dos atributos do contribuinte, possui cpf e Pessoas
Jurídicas possuem CNPJ.
*/