package model;

import javax.persistence.Column;
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
	@Column(name = "CodProduto", columnDefinition = "int(4)")
	private Integer codProduto;
	
	@Column(name = "Descricao", columnDefinition = "varchar(100)", nullable = false)
	private String descricao;
	
	@Column(name = "ValorUnitario", columnDefinition = "decimal(10,2)", nullable = false)
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
