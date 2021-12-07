package atv;

public class Camarote_Especial extends Ingresso {


	public Camarote_Especial(Double valor) {
		super(valor);
		this.adicionarValor();
		this.setNome("camarote_especial");
	}
	
	public void adicionarValor() {
		this.setValor(getValor()*30/100);
	}
	
}
