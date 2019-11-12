package dto;

import model.Produto;

public class QuantidadePedidaPorProdutoDTO {
	
	public QuantidadePedidaPorProdutoDTO() {};
	
	public QuantidadePedidaPorProdutoDTO(int codProduto, String descricao, long quantidade) {
		super();
		this.codProduto = codProduto;
		this.descricao = descricao;
		this.quantidade = quantidade;
	}

	private int codProduto;
	private String descricao;
	private long quantidade;
	
	public int getCodProduto() {
		return codProduto;
	}

	public void setCodProduto(int codPedido) {
		this.codProduto = codPedido;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public long getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	

}
