package model;

import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Executavel {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("teste");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
//		cadastrarCliente(em);
//		cadastrarVendedor(em);
//		cadastrarProduto(em);
		
		Cliente cliente = buscarCliente(em, 1);
		Vendedor vendedor = buscarVendedor(em, 1);
		Produto produto = buscarProduto(em, 1);

		System.out.println(cliente.getNome() + " - " + vendedor.getNome() + " - " + produto.getDescricao());
	
//		fazerPedido(em, produto, cliente, vendedor);
		
		em.getTransaction().commit();
		em.close();
		emf.close();
	}
	
	private static Cliente buscarCliente(EntityManager em, int id) {
		return em.find(Cliente.class, id);
	}
	
	private static void cadastrarCliente(EntityManager em) {
		Cliente cliente = new Cliente(null, "Julia", "Endereco", "Novo Hamburgo", "93415110", "RS", "000090-10");
		em.persist(cliente);
	}
	
	private static void cadastrarVendedor(EntityManager em) {
		Vendedor vendedor = new Vendedor(null, "Victoria", 1000.0, FaixaComissao.A);
		em.persist(vendedor);
	}
	
	private static Vendedor buscarVendedor(EntityManager em, int id) {
		return em.find(Vendedor.class, id);
	}	
	
	private static void fazerPedido(EntityManager em, Cliente cliente, Vendedor vendedor) {
		Pedido pedido = new Pedido(null, LocalDate.of(2020, 10, 10), LocalDate.now(), cliente, vendedor);
		em.persist(pedido);
	}
	
	private static void cadastrarProduto(EntityManager em) {
		Produto produto = new Produto(null, "Produto bem top", 10.5);
		em.persist(produto);
	}
	
	private static Produto buscarProduto(EntityManager em, int id) {
		return em.find(Produto.class, id);
	}
	
	private static void fazerPedido(EntityManager em, Produto produto, Cliente cliente, Vendedor vendedor) {
		Pedido pedido = new Pedido(null, LocalDate.of(2019, 11, 13), LocalDate.now(), cliente, vendedor);
		em.persist(pedido);
	}

}
