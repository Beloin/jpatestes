package teste.umpraum;

import infra.DAO;
import modelo.umpraum.Assento;
import modelo.umpraum.Cliente;

public class ObterClienteAssento {

    public static void main(String[] args) {

        DAO<Cliente> dao = new DAO<>(Cliente.class);
        Cliente cli = dao.obterPorId(1L);
        System.out.println("Assento pego por cliente: " + cli.getAssento().getName());

        DAO<Assento> ass = new DAO<>(Assento.class);
        Assento assento = ass.obterPorId(1L);
        System.out.println("Assento pego por assento: " + assento.getName());
        System.out.println("Assento e cliente por assento: " + "\n"
                + "Cliente:" + assento.getCliente().getName() + "\n" +
                "Assento:" + assento.getName());

    }
}
