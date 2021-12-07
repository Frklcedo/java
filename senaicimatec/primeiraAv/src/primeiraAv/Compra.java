package primeiraAv;

import java.util.ArrayList;

public class Compra implements Produtos{
	private String nomeDoCliente;
	private Double valorTotal;
	public ArrayList<Produto> produtos;
	public Compra(String nome) {
		this.nomeDoCliente = nome;
		this.valorTotal = 0.0;
		produtos = new ArrayList<Produto>();
	}
	@Override
	public Double calcularValorTotalDosProdutos() {
		return valorTotal;
	}
	@Override
	public void statusDaCompra() {
		int cont = 1;
		System.out.println("Cliente: " + nomeDoCliente + "\n");
		System.out.println("Produtos no carrinho:");
		System.out.println("\tQtd  NOME DO PRODUTO - CÓDIGO  |  PREÇO");
		for(Produto prodUnico: produtos) {
			System.out.println("\t" + cont + "- " + prodUnico);
			cont++;
		}
	}
	
	public void adicionarProduto(Produto produtoAdicionado) {
		produtos.add(produtoAdicionado);
		valorTotal += produtoAdicionado.getPreco()-produtoAdicionado.desconto;
	}
}
