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
		
//		Cliente cliente = buscarCliente(em);
//		Vendedor vendedor = buscarVendedor(em);
//		fazerPedido(em, cliente, vendedor);
		
		em.getTransaction().commit();
		em.close();
		emf.close();

	}
	
	private static Cliente buscarCliente(EntityManager em) {
		return em.find(Cliente.class, 1577);
	}
	
	private static void cadastrarCliente(EntityManager em) {
		Cliente cliente = new Cliente(null, "Julia", "Endereco", "Novo Hamburgo", "93415110", "RS", "000090-10");
		em.persist(cliente);
	}
	
	private static void cadastrarVendedor(EntityManager em) {
		Vendedor vendedor = new Vendedor(null, "Victoria", 1000.0, FaixaComissao.A);
		em.persist(vendedor);
	}
	
	private static Vendedor buscarVendedor(EntityManager em) {
		return em.find(Vendedor.class, 247);
	}	
	
	private static void fazerPedido(EntityManager em, Cliente cliente, Vendedor vendedor) {
		Pedido pedido = new Pedido(null, LocalDate.of(2020, 10, 10), LocalDate.now(), cliente, vendedor);
		em.persist(pedido);
	}
	
	private void cadastrarProduto(EntityManager em) {
		//TODO: implementar
	}
	
	private void adicionarProdutoEmPedido(EntityManager em) {
		//TODO: implementar
	}
	

}
