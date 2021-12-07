package user;

public class Cliente {
	
	private String nome;
	private String endereco;
	private String cpf;
	private int idade;
	
	public void mudarCPF(String cpf) {
		validarCPF(cpf);
		this.cpf=cpf;
		
	}
	private void validarCPF(String cpf) {
		
	}
	public void definirNome(String nome) {
		this.nome=nome;
	}
	public String pegarNome() {
		return this.nome;
	}
}
