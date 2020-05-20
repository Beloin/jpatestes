package teste.umpramuitos;

import infra.DAO;
import modelo.base.Produto;
import modelo.umpramuitos.ItemPedido;
import modelo.umpramuitos.Pedido;

public class NovoPedido {

    public static void main(String[] args) {
        DAO<Object> dao = new DAO<>();
        Pedido pedido = new Pedido();
        Produto produto = new Produto("Geladeira Tsunami", 2777.0);
        ItemPedido itemPedido = new ItemPedido(pedido, produto, 10);
        dao.abrirTrans()
                .incluir(produto)
                .incluir(pedido)
                .incluir(itemPedido)
                .fecharTrans()
                .fecharDAO();
    }
}
