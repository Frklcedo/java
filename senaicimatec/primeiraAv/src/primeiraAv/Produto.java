package primeiraAv;

public abstract class Produto {
	private Integer codigo;
	private String nome;
	private Double preco;
	protected Double desconto;
	
	public Produto(Integer codigo, String nome){
		this.codigo = codigo;
		this.nome = nome;
	}
	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Double getPreco() {
		return preco;
	}
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	public abstract void calcularDesconto();
	public String toString() {
		return nome + " -  cod." + codigo + "  |  R$" + (preco - desconto) + "(desconto: R$" + desconto + ")";
	}
	
}
