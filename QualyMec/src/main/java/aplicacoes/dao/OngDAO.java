package aplicacoes.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import entidades.CadastroOng;

public class OngDAO {

    public EntityManager getEM() {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("qualy-mec");
        return factory.createEntityManager();
    }

    public CadastroOng salvar(CadastroOng ong) throws Exception {
        EntityManager em = getEM();

        try {
            em.getTransaction().begin();
            if (ong.getIdOng() == null) {
                em.persist(ong);
            } else {
                if (!em.contains(ong)) {
                    if (em.find(CadastroOng.class, ong.getIdOng()) == null) {
                        throw new Exception("Erro ao atualizar a ONG!!");
                    }
                }
                ong = em.merge(ong);
            }
            em.getTransaction().commit();
        } finally {
            em.close();
        }
        return ong;
    }

    public void removerOng(Long idOng) {
        EntityManager em = getEM();
        CadastroOng ongDelete = em.find(CadastroOng.class, idOng);
        try {
            em.getTransaction().begin();
            em.remove(ongDelete);
            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }
}
