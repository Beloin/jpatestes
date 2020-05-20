package teste.base;

import infra.DAO;
import modelo.base.Produto;

public class NovoProduto {

    public static void main(String[] args) {

        DAO<Produto> dao = new DAO<>(Produto.class);

        Produto produto = new Produto("Skynet", 666.666);
        dao.incluirAtomico(produto).fecharDAO();

    }
}
