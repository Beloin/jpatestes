package teste.umpraum;

import infra.DAO;
import modelo.umpraum.Assento;
import modelo.umpraum.Cliente;

public class NovoClienteAssento {

    public static void main(String[] args) {
        Assento assento = new Assento("73F");
        Cliente cliente = new Cliente("Lucas", assento);

        DAO<Object> dao = new DAO<>();

        // OneToOne tem que ser na mesma transação!
        dao.abrirTrans()
                .incluir(assento)
                .incluir(cliente)
                .fecharTrans()
                .fecharDAO();

    }
}
