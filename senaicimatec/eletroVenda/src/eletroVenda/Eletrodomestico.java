package eletroVenda;

public abstract class Eletrodomestico {
	private String marca;
	private Double preco;
	private Double voltagem;
	public Eletrodomestico(String marca,Double preco,Double voltagem) {
		setMarca(marca);
		setPreco(preco);
		setVoltagem(voltagem);
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public Double getPreco() {
		return preco;
	}
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	public Double getVoltagem() {
		return voltagem;
	}
	public void setVoltagem(Double voltagem) {
		this.voltagem = voltagem;
	}
	public String toString() {
		return " marca=" + marca + ", preco=" + preco + ", voltagem=" + voltagem;
	}
	public abstract Double desconto(int mes);
	
}
