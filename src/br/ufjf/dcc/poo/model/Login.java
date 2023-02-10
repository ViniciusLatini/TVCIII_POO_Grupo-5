package br.ufjf.dcc.poo.model;

public class Login {
	private String usuario;
	private String senha;
	private CarrinhoCompra carrinho;
	private Cliente cliente;
	
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public CarrinhoCompra getCarrinho() {
		return carrinho;
	}
	
	public void setCarrinho(CarrinhoCompra carrinho) {
		this.carrinho = carrinho;
	}
	public void createUsuario () {
		
	}
	public void efetuarLogin() {
		
	}
}
