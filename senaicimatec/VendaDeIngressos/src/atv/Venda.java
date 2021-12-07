package atv;

import java.util.ArrayList;
import java.util.Calendar;

public class Venda implements Interface{

	private Calendar data;
	private String comprador;
	private ArrayList<Ingresso> carrinho;
	private int quantidade;
	private int existeIN = 0;
	
	
	public Venda(String nome) {
		comprador = nome;
		quantidade = 0;
		carrinho = new ArrayList<>();
	}
	public void fecharCompra() {
		statusCarrinho();
		verData();
	}
	
	
	public void adicionarCarrinho(Ingresso ingresso) {
		quantidade += 1;
		ingresso.setNumeroID(quantidade);
		carrinho.add(ingresso);
	}
	
	private void verData() {
		data = Calendar.getInstance();
		int dia = data.get(Calendar.DAY_OF_MONTH);
		int mes = data.get(Calendar.MONTH);
		int ano = data.get(Calendar.YEAR);
		System.out.printf("Data de venda: %d/%d/%d", dia,mes,ano);
	}
	
	@Override
	public void statusCarrinho() {
		System.out.println("Comprador" + comprador);
		System.out.println("Id do ingresso/tNome\tValor");
		for (Ingresso ingressos : carrinho) {
			System.out.println(ingressos.getNumeroID() + "\t" + ingressos.getNome() + "\t" +  ingressos.getValor());
		}
		calcularValorTotal();
	}
	
	
	@Override
	public void calcularValorTotal() {
		
		Double valorTotal = 0d;
		for(Ingresso ingressos: carrinho) {
			valorTotal += ingressos.getValor();
		}
		System.out.println("Valor total da compra:\t\t\t" + valorTotal);
		
	}
	@Override
	public void buscarIngressos(Integer ID){
		
		for(Ingresso ingressos: carrinho) {
			
			if (ID == ingressos.getNumeroID()) {
				
				System.out.println(ingressos.getNumeroID() + "\t" + ingressos.getNome() + "\t" +  ingressos.getValor());
				existeIN = 1;		
			}
			
			
		}
		
		if(existeIN == 0) {
			
			System.out.println("Ingresso n�o encontrado");
			
		}
		
	}
	
	public void mostrarValorDoIngresso(Ingresso ingresso) {
		System.out.println("Valor do ingresso nº" + ingresso.getNumeroID() + " :\t" + ingresso.getValor());
	}

	
}
