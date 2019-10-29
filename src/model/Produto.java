package model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Produto {
	
	public Produto() {}

	public Produto(Integer codProduto, String descricao, Double valorUnitario) {
		this.codProduto = codProduto;
		this.descricao = descricao;
		this.valorUnitario = valorUnitario;
	}

	@Id
	private Integer codProduto;
	
	private String descricao;
	
	private Double valorUnitario;
	

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
	
}
