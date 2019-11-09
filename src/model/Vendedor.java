package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "vendedor")
public class Vendedor implements Serializable {
	
	public Vendedor() {}

	public Vendedor(Integer codVendedor, String nome, Double salarioFixo, FaixaComissao faixaComissao) {
		super();
		this.codVendedor = codVendedor;
		this.nome = nome;
		this.salarioFixo = salarioFixo;
		this.faixaComissao = faixaComissao;
	}

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "CodVendedor", columnDefinition = "int(4)")
	private Integer codVendedor;
	
	@Column(name = "Nome", columnDefinition = "varchar(45)", nullable = false)
	private String nome;
	
	@Column(name = "SalarioFixo", columnDefinition = "decimal(10,2)", nullable = false)
	private Double salarioFixo;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "FaixaComissao", columnDefinition = "enum('A','B','C','D')", nullable = false)
	private FaixaComissao faixaComissao;

	public Integer getCodVendedor() {
		return codVendedor;
	}

	public void setCodVendedor(Integer codVendedor) {
		this.codVendedor = codVendedor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getSalarioFixo() {
		return salarioFixo;
	}

	public void setSalarioFixo(Double salarioFixo) {
		this.salarioFixo = salarioFixo;
	}

	public FaixaComissao getFaixaComissao() {
		return faixaComissao;
	}

	public void setFaixaComissao(FaixaComissao faixaComissao) {
		this.faixaComissao = faixaComissao;
	}
	
}
