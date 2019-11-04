package model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Pedido {
	
	public Pedido() {}
	
	public Pedido(Integer codPedido, LocalDate prazoEntrega, LocalDate dataPedido, Cliente cliente, Vendedor vendedor) {
		this.codPedido = codPedido;
		this.prazoEntrega = prazoEntrega;
		this.dataPedido = dataPedido;
		this.cliente = cliente;
		this.vendedor = vendedor;
	}

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer codPedido;
	
	private LocalDate prazoEntrega;
	
	private LocalDate dataPedido;
	
	@ManyToOne
	@JoinColumn(name = "CodCliente")
	private Cliente cliente;
	
	@ManyToOne
	@JoinColumn(name = "CodVendedor")
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

}
