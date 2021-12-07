package eletroVenda;

public class Batedeira extends Eletrodomestico {
	Integer helices;
	public Batedeira(String marca, Double preco, Double voltagem, Integer helices) {
		super(marca, preco, voltagem);
		this.helices=helices;
	}

	public Integer getHelices() {
		return helices;
	}

	public void setHelices(Integer helices) {
		this.helices = helices;
	}
	public Double litrosPorSegundo(double quantidade, double segundos) {
		return quantidade/segundos;	
	}

	@Override
	public Double desconto(int mes) {
		if(mes == 12) {
			System.out.println("Mês do Natal e do Ano novo!!!");
			return super.getPreco()*0.2;
		}
		return 0.0;
	}
	public Double getPreco(int mes) {
		return super.getPreco()-desconto(mes);
	}

	@Override
	public String toString() {
		return "Batedeira [helices=" + helices + super.toString() + "]";
	}
	
}
