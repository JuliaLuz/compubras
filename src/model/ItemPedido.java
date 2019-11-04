package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class ItemPedido {
	
	public ItemPedido() {}

	public ItemPedido(Integer codItemPedido, Pedido pedido, Produto produto) {
		super();
		this.codItemPedido = codItemPedido;
		this.pedido = pedido;
		this.produto = produto;
	}

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "CodItemPedido")
	private Integer codItemPedido;
	
	@ManyToOne
	@JoinColumn(name = "CodPedido")
	private Pedido pedido;
	
	@ManyToOne
	@JoinColumn(name = "CodProduto")
	private Produto produto;
	
	public Integer getCodItemPedido() {
		return codItemPedido;
	}


	public void setCodItemPedido(Integer codItemPedido) {
		this.codItemPedido = codItemPedido;
	}


	public Pedido getPedido() {
		return pedido;
	}


	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}


	public Produto getProduto() {
		return produto;
	}


	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	
}
