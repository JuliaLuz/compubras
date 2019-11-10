package dto;

public class QuantidadePedidaPorProdutoDTO {
	
	public QuantidadePedidaPorProdutoDTO() {};
	
	public QuantidadePedidaPorProdutoDTO(int codPedido, String descricao, long quantidade) {
		super();
		this.codPedido = codPedido;
		this.descricao = descricao;
		this.quantidade = quantidade;
	}

	private int codPedido;
	private String descricao;
	private long quantidade;
	
	public int getCodPedido() {
		return codPedido;
	}

	public void setCodPedido(int codPedido) {
		this.codPedido = codPedido;
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
