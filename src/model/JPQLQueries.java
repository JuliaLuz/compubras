package model;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class JPQLQueries {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("compubras");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		TypedQuery<Integer> query = em.createQuery("SELECT count(ip.pedido) FROM ItemPedido"
				+ " ip WHERE ip.produto.codProduto = :codigo", Integer.class);
		query.setParameter("codigo", 1);
		
		System.out.println(query.getSingleResult());
		
//		em.getTransaction().commit();
		em.close();
		emf.close();

	}

}
