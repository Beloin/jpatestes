package teste.base;

import modelo.base.Usuario;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.util.List;

public class ObterUsuarios {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence
                .createEntityManagerFactory("JPACourse");
        EntityManager em = emf.createEntityManager();

        String jpql = "select u from Usuario u";
//        TypedQuery<Usuario> query = em.createQuery(jpql, Usuario.class);
//        query.setMaxResults(5);

        List<Usuario> results = em
                .createQuery(jpql, Usuario.class)
                .setMaxResults(5)
                .getResultList();

        results.forEach(u -> System.out.println("ID:" + u.getId() + " Nome:"
                + u.getNome() + " Email:" + u.getEmail()));

        emf.close();
        em.close();
    }
}
