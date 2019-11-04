package model;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;

public class JPQLQueries {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("compubras");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		buscarClientes(em);
//		CriteriaBuilder cb = em.getCriteriaBuilder();
//
//		CriteriaQuery<Table1> query = cb.createQuery(Table1.class);
//
//		Root<Table1> root = query.from(Table1.class);
//
//		List<Predicate> predicates = new ArrayList<Predicate>();
//
//		Calendar c = Calendar.getInstance();
//		c.add(Calendar.DAY_OF_YEAR, -20);
//		Date myDate = c.getTime();
//
//		predicates.add(cb.lessThanOrEqualTo(root.<Date>get("created"), myDate));
//
//		query.where(cb.and(predicates.toArray(new Predicate[0])));
		
		em.close();
		emf.close();

	}
	//questão 1
	private static void buscarQuantidade(EntityManager em) {
		Query query = em.createQuery("SELECT count(ip.pedido) FROM ItemPedido"
				+ " ip WHERE ip.produto.codProduto = :codigo");
		query.setParameter("codigo", 1);
		
		System.out.println(query.getSingleResult());
	}
	
	//questão 2
	private static void buscarClientes(EntityManager em) {
		
		TypedQuery<Cliente> buscarClientes = em.createQuery("SELECT distinct p.cliente FROM Pedido p "
				+ "WHERE (p.cliente.uf = 'RS' OR p.cliente.uf = 'SC') "
				+ "AND datediff(p.prazoEntrega, p.dataPedido) > 10", Cliente.class);
		
		List<Cliente> clientes = buscarClientes.getResultList();
		for (Cliente cliente : clientes) {
			System.out.println(cliente.getCodCliente() + " - " + cliente.getNome() + " - " + cliente.getUf());
		}
	}
	
	private static void buscarVendedores(EntityManager em) {
//		Exiba a relação com os melhores vendedores (considerando apenas a quantidade de pedidos) 
//		para o mês de setembro (incluindo todos os anos). Exiba o nome do vendedor, o ano e o número
//		total de pedidos daquele ano.
		TypedQuery<Vendedor> buscarClientes = em.createQuery("SELECT distinct p.cliente FROM Pedido p "
				+ "WHERE (p.cliente.uf = 'RS' OR p.cliente.uf = 'SC') "
				+ "AND datediff(p.prazoEntrega, p.dataPedido) > 10", Vendedor.class);
	}

}
