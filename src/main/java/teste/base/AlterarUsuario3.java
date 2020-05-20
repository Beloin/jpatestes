package teste.base;

import modelo.base.Usuario;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AlterarUsuario3 {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence
                .createEntityManagerFactory("JPACourse");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        Usuario user = em.find(Usuario.class, 1L);
        // Utiliza-se para impedir a atualização automática do banco
        em.detach(user);
        user.setNome("Leonardo Leitão");

        System.out.println(user);

        /*
            Está no estado Gerenciável, então todas suas alterações serão incluidas
            mesmo sem dar merge.
                Precisa usar o detach(obj);
         */

        em.merge(user);
        em.getTransaction().commit();


        em.close();
        emf.close();

    }
}
