package teste.base;

import modelo.base.Usuario;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class NovoUsuario {
    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence
                .createEntityManagerFactory("JPACourse");
        EntityManager em = emf.createEntityManager();

        Usuario novoUser = new Usuario("Joao da Silva", "Joazin@gmail.com");
        Usuario novoUser1 = new Usuario("Sena Seinina", "sena@gmail.com");
        Usuario novoUser3 = new Usuario("Lucas SIlva", "Lucas@gmail.com");
        Usuario novoUser4 = new Usuario("Daniel Orivaldo", "daniel@gmail.com");

        em.getTransaction().begin();
        em.persist(novoUser);
        em.persist(novoUser1);
        em.persist(novoUser3);
        em.persist(novoUser4);
        em.getTransaction().commit();


        em.close();
        emf.close();


    }
}
