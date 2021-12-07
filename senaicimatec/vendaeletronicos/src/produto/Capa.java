package produto;

public class Capa {
	private String cor;
	private String material;
	private double preco;
	
	public Capa(String cor,String material,double preco) {
		this.cor = cor;
		this.material = material;
		if(preco>=5000) {
			this.preco = 200;
		}
		else if(preco>2500) {
			this.preco = 150;
		}
		else if(preco>2000) {
			this.preco = 100;
		}
		else {
			this.preco = 80;
		}
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getCor() {
		return this.cor;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public String getMaterial() {
		return this.material;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public double getPreco() {
		return this.preco;
	}

}
