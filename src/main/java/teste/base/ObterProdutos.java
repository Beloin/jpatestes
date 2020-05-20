package teste.base;

import infra.DAO;
import modelo.base.Produto;

import java.util.List;

public class ObterProdutos {

    public static void main(String[] args) {
        DAO<Produto> dao = new DAO<>(Produto.class);

        List<Produto> produtos = dao.obterTodos();

        produtos.forEach(System.out::println);

        double precoTotal = produtos.stream()
                .map(Produto::getPreco)
                .reduce(0.0, (t, p) -> t += p);

        System.out.println(precoTotal);

        dao.fecharDAO();


    }

}
