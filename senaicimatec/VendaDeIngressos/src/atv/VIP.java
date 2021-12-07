package atv;

public class VIP extends Ingresso{

	public VIP(Double valor) {
		super(valor);
		adicionaValor();
	}

	
	public void adicionaValor() {
		
		this.valor =+ (valor * 15 / 100);
		
			
	}
	
	
}
