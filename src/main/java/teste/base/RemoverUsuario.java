package teste.base;

import modelo.base.Usuario;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class RemoverUsuario {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence
                .createEntityManagerFactory("JPACourse");
        EntityManager em = emf.createEntityManager();



        Usuario user = em.find(Usuario.class, 1L);

        em.getTransaction().begin();

        if (user != null) {
            System.out.println(user);
            em.remove(user);
        }

        //em.merge(user);
        em.getTransaction().commit();


        em.close();
        emf.close();

    }
}
