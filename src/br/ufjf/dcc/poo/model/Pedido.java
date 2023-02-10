package br.ufjf.dcc.poo.model;

public class Pedido {
	private Pagamento pagamento;
	private CarrinhoCompra carrinho;
	
	public Pagamento getPagamento() {
		return pagamento;
	}
	public void setPagamento(Pagamento pagamento) {
		this.pagamento = pagamento;
	}
	public CarrinhoCompra getCarrinho() {
		return carrinho;
	}
	public void setCarrinho(CarrinhoCompra carrinho) {
		this.carrinho = carrinho;
	}
	
	public void criarPagamento() {
		
	}
	public void fecharPedido() {
		
	}
	public void buscarPedido() {
		
	}
	public int gerarNumeroPedido() {
		return 0;
	}
}
