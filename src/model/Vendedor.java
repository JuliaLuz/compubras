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
public class Vendedor implements Serializable{
	
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
	@Column(name = "CodVendedor")
	private Integer codVendedor;
	
	private String nome;
	
	private Double salarioFixo;
	
	@Enumerated(EnumType.STRING)
	private FaixaComissao faixaComissao;
	
//	CREATE TABLE `vendedor` (
//			  `CodVendedor` int(4) NOT NULL AUTO_INCREMENT,
//			  `Nome` varchar(45) NOT NULL,
//			  `SalarioFixo` decimal(10,2) NOT NULL,
//			  `FaixaComissao` enum('A','B','C','D') NOT NULL,
//			  PRIMARY KEY (`CodVendedor`)
//			) ENGINE=InnoDB AUTO_INCREMENT=247 DEFAULT CHARSET=utf8;
//			/*!40101 SET character_set_client = @saved_cs_client */;

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
