package model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cliente implements Serializable{
	
	public Cliente() {}
	
	public Cliente(Integer codCliente, String nome, String endereco, String cidade, String cep, String uf, String iE) {
		super();
		this.codCliente = codCliente;
		this.nome = nome;
		this.endereco = endereco;
		this.cidade = cidade;
		this.cep = cep;
		this.uf = uf;
		this.iE = iE;
	}

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer codCliente;

	private String nome;
	
	private String endereco;
	
	private String cidade;
	
	private String cep;
	
	private String uf;
	
	private String iE;
	

	public Integer getCodCliente() {
		return codCliente;
	}

	public void setCodCliente(Integer codCliente) {
		this.codCliente = codCliente;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public String getiE() {
		return iE;
	}

	public void setiE(String iE) {
		this.iE = iE;
	}
	
}
