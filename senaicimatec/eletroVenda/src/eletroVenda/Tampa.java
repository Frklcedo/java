package eletroVenda;

public class Tampa {
	private String cor;
	private String agregacao;
	
	public Tampa() {
		setCor("preta");
		setAgregacao("nula");
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getAgregacao() {
		return agregacao;
	}
	public void setAgregacao(String agregacao) {
		this.agregacao = agregacao;
	}
	
	public String toString() {
		return "cor=" + cor + ", agregacao=" + agregacao;
	}
	
}
