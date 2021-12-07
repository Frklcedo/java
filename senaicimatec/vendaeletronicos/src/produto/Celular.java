package produto;

public class Celular {
	private String marca;
	private String cor;
	private String modelo;
	private double valor;
	private Capa capa;
	
	public Celular(String marca, String cor, String modelo, double valor){
		this.marca = marca;
		this.cor = cor;
		this.modelo = modelo;
		this.valor = valor;
		 capa = new Capa(this.cor, "plastico", this.valor);
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getMarca() {
		return this.marca;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getCor() {
		return this.cor;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getModelo() {
		return this.modelo;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public double getValor() {
		return this.valor;
	}
	
	//setCapa
	public void setCapaCor(String cor) {
		capa.setCor(cor);
	}
	public String getCapaCor() {
		return capa.getCor();
	}
	public void setCapaMaterial(String modelo) {
		capa.setMaterial(modelo);
	}
	public String getCapaMaterial() {
		return capa.getMaterial();
	}
	public void setCapaValor(double valor) {
		capa.setPreco(valor);
	}
	public double getCapaValor() {
		return capa.getPreco();
	}
	
	// resultado valor 
	public String getVendaFinal() {
		return ("O valor total do celular " + this.marca + " com a capa " + capa.getCor() + " de " + capa.getMaterial() + " ficou de: " + (this.valor + capa.getPreco()));
	}
}
