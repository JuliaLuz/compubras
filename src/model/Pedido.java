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

//	CREATE TABLE `pedido` (
//			  `CodPedido` int(4) NOT NULL AUTO_INCREMENT,
//			  `PrazoEntrega` date NOT NULL,
//			  `DataPedido` date NOT NULL,
//			  `CodCliente` int(4) NOT NULL,
//			  `CodVendedor` int(4) NOT NULL,
//			  PRIMARY KEY (`CodPedido`),
//			  KEY `CodCliente` (`CodCliente`),
//			  KEY `CodVendedor` (`CodVendedor`),
//			  CONSTRAINT `pedido_ibfk_1` FOREIGN KEY (`CodCliente`) REFERENCES `cliente` (`CodCliente`),
//			  CONSTRAINT `pedido_ibfk_2` FOREIGN KEY (`CodVendedor`) REFERENCES `vendedor` (`CodVendedor`)
//			) ENGINE=InnoDB AUTO_INCREMENT=8433 DEFAULT CHARSET=utf8;
	
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
