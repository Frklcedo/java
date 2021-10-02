package carro;

public class Carro {
	String cor;
	String modelo;
	double velocidadeAtual;
	double velocidadeMaxima;
	void ligar() {
		System.out.println("Carro ligado");
	}
	void acelerar(double a) {
		this.velocidadeAtual+=a;
	}
	int passarMarcha() {
		if(this.velocidadeAtual>0 && this.velocidadeAtual<=20){
			return 1;
		}
		else if(this.velocidadeAtual>20 && this.velocidadeAtual<=40) {
			return 2;
		}
		else if(this.velocidadeAtual>40 && this.velocidadeAtual<=60) {
			return 3;
		}
		else if(this.velocidadeAtual>60 && this.velocidadeAtual<=100) {
			return 4;	
		}
		else if(this.velocidadeAtual>100) {
			return 5;	
		}
		else {
			return 0;
		}
	}
}
