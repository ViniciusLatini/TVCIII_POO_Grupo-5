package br.ufjf.dcc.poo.model;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoCompra {
	private Pedido pedido;
	private Login login;
	private List<ItensCompra> itensCompra = new ArrayList<ItensCompra>();
	
	public Pedido getPedido() {
		return pedido;
	}
	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}
	public Login getLogin() {
		return login;
	}
	public void setLogin(Login login) {
		this.login = login;
	}
	public List<ItensCompra> getItensCompra() {
		return itensCompra;
	}
	public void setItensCompra(List<ItensCompra> itensCompra) {
		this.itensCompra = itensCompra;
	}
	
	public void inserirProdutos() {
		
	}
	public void excluirProdutos() {
		
	}
	public void alterarProdutos() {
		
	}
	public void finalizarCompra() {
		
	}
}
