package primeiraAv;

public class Esporte extends Produto{
	
	
	public Esporte(Integer codigo, String nome, Double preco) {
		super(codigo, nome);
		setPreco(preco);
		calcularDesconto();
	}
	@Override
	public void calcularDesconto() {
		this.desconto = this.getPreco() * 15 / 100;
		System.out.println("\tPreço original: " + getPreco());
		System.out.println("\tPreço final: " + (getPreco()-desconto) + " (Desconto de 15%)");
	}
	
}
