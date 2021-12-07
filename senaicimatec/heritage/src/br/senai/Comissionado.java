package br.senai;

public class Comissionado extends Empregado{
	@Override
	public String toString() {
		return "Comissionado [" + super.toString() + "totalVenda=" + totalVenda + ", totalComissao=" + totalComissao + "]";
	}
	Double totalVenda;
	Double totalComissao;
	
	public Comissionado(String nome, String sobrenome, String cpf, Double totalVenda, Double totalComissao) {
		super(nome,sobrenome,cpf);
		this.totalVenda = totalVenda;
		this.totalComissao = totalComissao;
	}
	public Comissionado(){
	}
	
	@Override
	public Double vencimento() {
		return 0.0;
	}
	
	public Double getTotalVenda() {
		return totalVenda;
	}
	public void setTotalVenda(Double totalVenda) {
		this.totalVenda = totalVenda;
	}
	public Double getTotalComissao() {
		return totalComissao;
	}
	public void setTotalComissao(Double totalComissao) {
		this.totalComissao = totalComissao;
	}
}
