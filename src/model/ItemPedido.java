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
	@Column(name = "CodItemPedido", columnDefinition = "int(4)")
	private Integer codItemPedido;
	
	@ManyToOne
	@JoinColumn(name = "CodPedido", columnDefinition = "int(4)", nullable = false)
	private Pedido pedido;
	
	@ManyToOne
	@JoinColumn(name = "CodProduto", columnDefinition = "int(4)", nullable = false)
	private Produto produto;
	
	@Column(name = "Quantidade", columnDefinition = "int(5)", nullable = false)
	private Integer quantidade;
	
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codItemPedido == null) ? 0 : codItemPedido.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ItemPedido other = (ItemPedido) obj;
		if (codItemPedido == null) {
			if (other.codItemPedido != null)
				return false;
		} else if (!codItemPedido.equals(other.codItemPedido))
			return false;
		return true;
	}
	
	
}
