package teste.umpramuitos;

import infra.DAO;
import modelo.umpramuitos.ItemPedido;
import modelo.umpramuitos.Pedido;

public class ObterPedidos {

    public static void main(String[] args) {
        DAO<Pedido> pedidoDAO = new DAO<>(Pedido.class);
        Pedido pedido = pedidoDAO.obterPorId(1L);
        for (ItemPedido it : pedido.getItens()) {
            System.out.println("Quantidade de Pedidos:" + it.getQuantidade());
            System.out.println(it.getProduto().getPreco());
        }

        pedidoDAO.fecharDAO();

    }

}
