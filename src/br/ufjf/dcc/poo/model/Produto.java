package br.ufjf.dcc.poo.model;

public class Produto {
	private EspecificacaoProduto especificacao;
	private ItensCompra itensCompra;
	
	public EspecificacaoProduto getEspecificacao() {
		return especificacao;
	}
	public void setEspecificacao(EspecificacaoProduto especificacao) {
		this.especificacao = especificacao;
	}
	public ItensCompra getItensCompra() {
		return itensCompra;
	}
	public void setItensCompra(ItensCompra itensCompra) {
		this.itensCompra = itensCompra;
	}
	
	public void incluirItens() {
		
	}
}
