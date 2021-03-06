package conta;

public class Conta {
	
	private int numero;
	private String dono;
	private double saldo;
	private double limite;
	private boolean ativa;
	
	//Status geral da conta
	public void status() {
		System.out.print("\nStatus da conta: ");
		System.out.println((this.ativa)? "Ativa":"Inativa");
		System.out.println("Número da conta: " + this.numero);
		System.out.println("Dono da conta: " + this.dono);

	}	
	
	// Abertura e fechamento da conta
	public void abrirConta() {
		this.ativa = true;
	}
	public void fecharConta() {
		if(this.saldo>0) {
			System.out.println("Saldo positivo, saque o valor = " + this.saldo + " para fechar a conta");
		}
		else {
			if(this.saldo < 0) {
				System.out.println("Saldo negativo, Deposite o valor = " + (this.saldo * -1) + " para fechar esta conta");
			}
			else {
				if(this.ativa==false) {
					System.out.println("Conta já está fechada");
				}
				else {
					this.ativa = false;
				}
			}
		}
	}
	public boolean ativa() {
		return this.ativa;
	}
	
	// Número geral da conta
	public int getNumero() {
		return this.numero;
	}
	public void setNumero(int n) {
		this.numero = n;
	}
	
	// Dono da conta 
	public String getDono() {
		return this.dono;
	}
	public void setDono(String nome) {
		this.dono = nome;
	}
	
	// Consultar saldo, depositar, sacar e definir limite
	public void consultarSaldo() {
		System.out.println();
		if(this.ativa) {
			System.out.println("Saldo: " + this.saldo);
			System.out.println("Limite: " + this.limite);
		}
		else {
			System.out.println("CONTA INATIVA");
		}
		System.out.println();
	}
	public void setLimite(double primeiroDeposito) {
		if(primeiroDeposito<=500) {
			this.limite+=500;
		}
		else {
			this.limite+= 500+(primeiroDeposito*0.2);
		}
	}
	public void sacar(double valor) {
		if(this.ativa) {
			if(valor<=(this.saldo + this.limite)) {
				this.saldo-=valor;
				this.consultarSaldo();
			}
			else {
				System.out.println("\nLimite da conta ultrapassado");
			}
		}
		else {
			System.out.println("\nNão posso sacar de uma conta inativa.");
		}
	}
	public void depositar(double valor) {
		
		if(this.ativa) {
			this.saldo += valor;
		}
		else {
			System.out.println("\nNão posso depositar em uma conta inativa.");
		}
			
	}
	
}