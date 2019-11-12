package model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Produto {
	
	public Produto() {}

	public Produto(Integer codProduto, String descricao, Double valorUnitario, List<ItemPedido> itensPedidos) {
		this.codProduto = codProduto;
		this.descricao = descricao;
		this.valorUnitario = valorUnitario;
		this.itensPedidos = itensPedidos;
	}

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "CodProduto", columnDefinition = "int(4)")
	private Integer codProduto;
	
	@Column(name = "Descricao", columnDefinition = "varchar(100)", nullable = false)
	private String descricao;
	
	@Column(name = "ValorUnitario", columnDefinition = "decimal(10,2)", nullable = false)
	private Double valorUnitario;
	
	@OneToMany(mappedBy = "produto", targetEntity = ItemPedido.class, cascade = CascadeType.ALL)
	private List<ItemPedido> itensPedidos;

	public Integer getCodProduto() {
		return codProduto;
	}

	public void setCodProduto(Integer codProduto) {
		this.codProduto = codProduto;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Double getValorUnitario() {
		return valorUnitario;
	}

	public void setValorUnitario(Double valorUnitario) {
		this.valorUnitario = valorUnitario;
	}
	
	public List<ItemPedido> getItensPedidos() {
		return itensPedidos;
	}

	public void setItensPedidos(List<ItemPedido> itensPedidos) {
		this.itensPedidos = itensPedidos;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codProduto == null) ? 0 : codProduto.hashCode());
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
		Produto other = (Produto) obj;
		if (codProduto == null) {
			if (other.codProduto != null)
				return false;
		} else if (!codProduto.equals(other.codProduto))
			return false;
		return true;
	}
	
	
}
