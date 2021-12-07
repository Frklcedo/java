package eletroVenda;

public class Liquidificador extends Eletrodomestico {

	Tampa tampa;
	public Liquidificador(String marca, Double preco, Double voltagem) {
		super(marca, preco, voltagem);
		tampa = new Tampa();
	}
	@Override
	public Double desconto(int mes) {
		if(mes == 8) {
			System.out.println("Mês do dia dos pais!!!");
			return super.getPreco()*0.1;
		}
		return 0.0;
	}
	public Double getPreco(int mes) {
		return super.getPreco()-desconto(mes);
	}
	public Double litrosPorSegundo(double quantidade, double segundos) {
		return quantidade/segundos;	
	}

	// Sobre a tampa
	public void setCorTampa(String cor) {
		tampa.setCor(cor);
	}
	public void setAgregacaoTampa(String agregacao) {
		tampa.setAgregacao(agregacao);
	}
	
	public void sobreATampa() {
		System.out.println(tampa);
	}
	@Override
	public String toString() {
		return "Liquidificador [tampa=" + tampa + super.toString() + "]";
	}
}
