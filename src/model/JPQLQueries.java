package model;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;

import dto.QuantidadePedidaPorProdutoDTO;
import dto.VendedorDTO;

public class JPQLQueries {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("compubras");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
//		buscarQuantidade(em);
		
		buscarClientes(em);
		
//		buscarVendedores(em);
		
		em.close();
		emf.close();

	}
	//questão 1
	//Mostrar a quantidade pedida para um determinado produto com um determinado código a partir da tabela item de pedido.
	private static void buscarQuantidade(EntityManager em) {
		//lista de todos produtos
		TypedQuery<QuantidadePedidaPorProdutoDTO> typedQuery = em.createQuery(
				"SELECT new dto.QuantidadePedidaPorProdutoDTO(p.codProduto, p.descricao, coalesce(sum(ip.quantidade), 0))"
				+ " FROM Produto p LEFT JOIN ItemPedido ip ON ip.produto.codProduto = p.codProduto"
				+ " GROUP BY p.codProduto "
				+ " ORDER BY coalesce(sum(ip.quantidade), 0) ASC, p.codProduto ASC ", QuantidadePedidaPorProdutoDTO.class);

		List<QuantidadePedidaPorProdutoDTO> results = typedQuery.getResultList();

		for(QuantidadePedidaPorProdutoDTO result: results) {
			System.out.println(result.getCodPedido() + " | " + result.getDescricao() + " | " + result.getQuantidade());
		}

	}
	
	//questão 2
	//Clientes com prazo de entrega superior a 10 dias e que pertençam aos estados do Rio Grande do Sul ou Santa Catarina.
	private static void buscarClientes(EntityManager em) {
		TypedQuery<Cliente> buscarClientes = em.createQuery("SELECT p.cliente FROM Pedido p "
				+ "WHERE (p.cliente.uf = 'RS' OR p.cliente.uf = 'SC') "
				+ "AND datediff(p.prazoEntrega, p.dataPedido) > 10 group by p.cliente.codCliente", Cliente.class);
		
		List<Cliente> clientes = buscarClientes.getResultList();
		for (Cliente cliente : clientes) {
			System.out.println(cliente.getCodCliente() + " - " + cliente.getNome() + " - " + cliente.getUf());

		}
	}
	
	//questão 3
	//Exiba a relação com os melhores vendedores (considerando apenas a quantidade de pedidos) 
	//para o mês de setembro (incluindo todos os anos). Exiba o nome do vendedor, o ano e o número
	//total de pedidos daquele ano.
	private static void buscarVendedores(EntityManager em) {		
		TypedQuery<VendedorDTO> buscarVendedor = em.createQuery("SELECT new dto.VendedorDTO(p.vendedor.nome,"
				+ " year(p.dataPedido), count(p))"
				+ " FROM Pedido p where month(p.dataPedido) = 9"
				+ " group by p.vendedor.codVendedor, year(p.dataPedido)"
				+ " order by year(p.dataPedido) desc, count(p) desc, p.vendedor.nome", VendedorDTO.class);
		
		List<VendedorDTO> results = buscarVendedor.getResultList();
		System.out.println("VENDEDOR  |  ANO  |  QTD PEDIDOS");
		for (VendedorDTO result : results) {
			System.out.println(result.getNome() + " | "
					+ result.getAno() + " | "
					+ result.getQuantidadePedidos());
		}
		
	}

}
