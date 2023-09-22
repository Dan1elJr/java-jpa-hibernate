package application;

import java.util.Locale;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Pessoa;

public class Program {
	public static void main (String [] args) {
		Locale.setDefault(Locale.US);
		
		Pessoa p1 = new Pessoa (null,"Carlos da Silva", "carlosgmail.com");
		Pessoa p2 = new Pessoa (null,"Joaquim Torres", "joaquim@gmail.com");
		Pessoa p3 = new Pessoa (null,"Ana Maria", "ana@gmail.com");
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		em.persist(p1);
		em.persist(p2);
		em.persist(p3);
		em.getTransaction().commit();
		System.out.println("Pronto");
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		
	}
}
