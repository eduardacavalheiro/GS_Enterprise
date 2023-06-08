package aplicacoes.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import entidades.CadastroAlimento;

public class AlimentoDAO {

    public EntityManager getEM() {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("qualy-mec");
        return factory.createEntityManager();
    }

    public CadastroAlimento salvar(CadastroAlimento alimento) throws Exception {
        EntityManager em = getEM();

        try {
            em.getTransaction().begin();
            if (alimento.getIdCadAlimento() == null) {
                em.persist(alimento);
            } else {
                if (!em.contains(alimento)) {
                    if (em.find(CadastroAlimento.class, alimento.getIdCadAlimento()) == null) {
                        throw new Exception("Erro ao atualizar o alimento!!");
                    }
                }
                alimento = em.merge(alimento);
            }
            em.getTransaction().commit();
        } finally {
            em.close();
        }
        return alimento;
    }

    public void removerAlimento(Long idCadAlimento) {
        EntityManager em = getEM();
        CadastroAlimento alimentoDelete = em.find(CadastroAlimento.class, idCadAlimento);
        try {
            em.getTransaction().begin();
            em.remove(alimentoDelete);
            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }
}
