package teste.base;

import modelo.base.Usuario;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AlterarUsuario1 {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence
                .createEntityManagerFactory("JPACourse");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        Usuario user = em.find(Usuario.class, 1L);
        user.setNome("Leonardo");
        user.setEmail("lenardo@lanche.com");
        System.out.println(user);
        em.merge(user);
        em.getTransaction().commit();




        em.close();
        emf.close();

    }

}
