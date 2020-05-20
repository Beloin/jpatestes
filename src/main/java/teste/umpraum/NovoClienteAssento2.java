package teste.umpraum;

import infra.DAO;
import modelo.umpraum.Assento;
import modelo.umpraum.Cliente;

public class NovoClienteAssento2 {

    public static void main(String[] args) {

        Assento assento = new Assento("9K");
        Cliente cliente = new Cliente("Juliana", assento);

        DAO<Cliente> dao = new DAO<Cliente>(Cliente.class);
        dao.incluirAtomico(cliente);


    }
}
