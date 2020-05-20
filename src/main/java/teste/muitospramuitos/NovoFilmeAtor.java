package teste.muitospramuitos;

import infra.DAO;
import modelo.muitospramuitos.Ator;
import modelo.muitospramuitos.Filme;

public class NovoFilmeAtor {

    public static void main(String[] args) {
        Filme filme1 = new Filme(8.7, "Star Wars EP4");
        Filme filme2 = new Filme(4.5, "O Fugitop 4");


        Ator ator1 = new Ator("Harrizon Ford");
        Ator atriz2 = new Ator("Carrie Fisher");

        filme1.adicionarAtor(ator1);
        filme1.adicionarAtor(atriz2);

        filme2.adicionarAtor(ator1);

        DAO<Filme> dao = new DAO<>();
        dao.incluirAtomico(filme1);

    }

}
