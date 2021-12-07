package eletroVenda;

public class FerroDePassar extends Eletrodomestico {

	public FerroDePassar(String marca, Double preco, Double voltagem) {
		super(marca, preco, voltagem);
	}
	@Override
	public Double desconto(int mes) {
		if(mes == 5) {
			System.out.println("Mês do dia das mães!!!");
			return super.getPreco()*0.15;
		}
		return 0.0;
	}
	public Double getPreco(int mes) {
		return super.getPreco()-desconto(mes);
	}
	
	@Override
	public String toString() {
		return "FerroDePassar [ " + super.toString() + " ]";
	}

}
