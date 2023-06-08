package aplicacoes.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import entidades.CadastroUsuario;

public class UsuarioDAO {

	public EntityManager getEM() {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("qualy-mec");
		return factory.createEntityManager();
	}

	public CadastroUsuario salvar (CadastroUsuario usuario) throws Exception {
		EntityManager em = getEM();

		try {
			em.getTransaction().begin();
			if (usuario.getIdUsuario() == null) { // Se o campo id passado nao existir, ou for igual a null faça um	insert. SENAO faça um update
				em.persist(usuario);// executa insert
			} else {
				if(!em.contains(usuario)) {
					if(em.find(CadastroUsuario.class, usuario.getIdUsuario()) == null) {
						throw new Exception("Erro ao atualizar o usuario!!");
					}
				}
				usuario = em.merge(usuario);// executa update
			}
			em.getTransaction().commit();
		} finally {
			em.close();
		}
		return usuario;

	}


	public void removerUsuario (Long idUsuario) {
		EntityManager em = getEM();
		CadastroUsuario usuarioDelete = em.find(CadastroUsuario.class, idUsuario);
		try {
		em.getTransaction().begin();
			em.remove(usuarioDelete);
		em.getTransaction().commit();
		}finally {
			em.close();
		}

}
	














}



