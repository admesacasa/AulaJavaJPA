package br.edu.pos.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.edu.pos.entity.Produto;

public class MainProduto {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence
				.createEntityManagerFactory("aulaJPA");
		EntityManager entityMananger = factory.createEntityManager();

		Produto produto = new Produto();
		produto.setNome("banana");
		try {
			Class.forName("org.postgresql.Driver");
			entityMananger.getTransaction().begin();
			entityMananger.persist(produto);
			entityMananger.getTransaction().commit();

		} catch (Exception e) {
			entityMananger.getTransaction().rollback();
		}finally{
			entityMananger.close();
			factory.close();
		}

	}
}
