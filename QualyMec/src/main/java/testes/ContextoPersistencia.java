package testes;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class ContextoPersistencia {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory(null);
		EntityManager em =emf.createEntityManager();
		
		
	}

}
