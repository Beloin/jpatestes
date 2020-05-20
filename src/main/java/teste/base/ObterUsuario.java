package teste.base;

import modelo.base.Usuario;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ObterUsuario {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence
                .createEntityManagerFactory("JPACourse");
        EntityManager em = emf.createEntityManager();

        Usuario user = em.find(Usuario.class, 2L);
        System.out.println("Nome:" + user.getNome() + "  Email:" + user.getEmail());

    }
}
