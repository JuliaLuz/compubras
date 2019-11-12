package model;

import java.io.Serializable;

import javax.persistence.Column;
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
	@Column(name = "CodCliente", columnDefinition="int(4)")
	private Integer codCliente;
	
	@Column(name = "Nome", columnDefinition = "varchar(100)", nullable = false)
	private String nome;
	
	@Column(name = "Endereco", columnDefinition = "varchar(255)", nullable = false)
	private String endereco;
	
	@Column(name = "Cidade", columnDefinition = "varchar(60)", nullable = false)
	private String cidade;
	
	@Column(name = "Cep", columnDefinition = "varchar(11)", nullable = false)
	private String cep;
	
	@Column(name = "Uf", columnDefinition = "char(2)", nullable = false)
	private String uf;
	
	@Column(name = "Ie", columnDefinition = "varchar(12)", nullable = false)
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codCliente == null) ? 0 : codCliente.hashCode());
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
		Cliente other = (Cliente) obj;
		if (codCliente == null) {
			if (other.codCliente != null)
				return false;
		} else if (!codCliente.equals(other.codCliente))
			return false;
		return true;
	}
	
	
}
