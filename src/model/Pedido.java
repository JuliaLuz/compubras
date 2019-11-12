package model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Pedido {
	
	public Pedido() {}
	
	public Pedido(Integer codPedido, LocalDate prazoEntrega, LocalDate dataPedido, Cliente cliente, Vendedor vendedor ) {
		this.codPedido = codPedido;
		this.prazoEntrega = prazoEntrega;
		this.dataPedido = dataPedido;
		this.cliente = cliente;
		this.vendedor = vendedor;
	}

	@Id
	@Column(name = "CodPedido", columnDefinition="int(4)")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer codPedido;
	
	@Column(name = "PrazoEntrega", columnDefinition="date", nullable = false)
	private LocalDate prazoEntrega;
	
	@Column(name = "DataPedido", columnDefinition="date", nullable = false)
	private LocalDate dataPedido;
	
	@ManyToOne
	@JoinColumn(name = "CodCliente", columnDefinition="int(4)", nullable = false)
	private Cliente cliente;
	
	@ManyToOne
	@JoinColumn(name = "CodVendedor", columnDefinition="int(4)", nullable = false)
	private Vendedor vendedor;
	
	public Integer getCodPedido() {
		return codPedido;
	}

	public void setCodPedido(Integer codPedido) {
		this.codPedido = codPedido;
	}

	public LocalDate getPrazoEntrega() {
		return prazoEntrega;
	}

	public void setPrazoEntrega(LocalDate prazoEntrega) {
		this.prazoEntrega = prazoEntrega;
	}

	public LocalDate getDataPedido() {
		return dataPedido;
	}

	public void setDataPedido(LocalDate dataPedido) {
		this.dataPedido = dataPedido;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Vendedor getVendedor() {
		return vendedor;
	}

	public void setVendedor(Vendedor vendedor) {
		this.vendedor = vendedor;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codPedido == null) ? 0 : codPedido.hashCode());
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
		Pedido other = (Pedido) obj;
		if (codPedido == null) {
			if (other.codPedido != null)
				return false;
		} else if (!codPedido.equals(other.codPedido))
			return false;
		return true;
	}

	
}
