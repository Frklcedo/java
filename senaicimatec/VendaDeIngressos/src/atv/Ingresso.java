package atv;

public class Ingresso {
	
	protected Double valor;
	protected Integer numeroID = 0;
	protected String nome;
	
	public Ingresso(Double valor) {
		this.valor = valor;
		this.setNome("Normal");
	}
	
	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public Integer getNumeroID() {
		return numeroID;
	}

	public void setNumeroID(Integer numeroID) {
		this.numeroID = numeroID;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void status() {
		
		System.out.println("numero do ingresso " + numeroID);
		
	}
	public void mostrarValorDoIngresso(Ingresso ingresso) {
		System.out.println("Valor do ingresso nº" + this.getNumeroID() + " :\t" + this.getValor());
	}

}
