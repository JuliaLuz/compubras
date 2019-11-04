package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
	@GeneratedValue(strategy=GenerationType.IDENTITY)
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
