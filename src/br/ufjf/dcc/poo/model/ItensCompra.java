package br.ufjf.dcc.poo.model;

import java.util.*;

public class ItensCompra {
	private Produto produto;
	private CarrinhoCompra carrinho;
	
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	public CarrinhoCompra getCarrinho() {
		return carrinho;
	}
	public void setCarrinho(CarrinhoCompra carrinho) {
		this.carrinho = carrinho;
	}

	public List<Produto> buscarProdutos() {
		List<Produto> produtos= new ArrayList<Produto>();
		return produtos;
	}
}
