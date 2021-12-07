package primeiraAv;

public class Informatica extends Produto {
	public Informatica(Integer codigo, String nome, Double preco) {
		super(codigo, nome);
		setPreco(preco);
		calcularDesconto();
	}
	@Override
	public void calcularDesconto() {
		this.desconto = this.getPreco() * 10 / 100;
		System.out.println("\tPreço original: " + getPreco());
		System.out.println("\tPreço final: " + (getPreco()-desconto) + " (Desconto de 10%)");
	}
	
}
