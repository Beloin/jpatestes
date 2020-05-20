package teste.namedquery;

import infra.DAO;
import modelo.muitospramuitos.Filme;

import java.util.List;

public class ObterFilmes {

    public static void main(String[] args) {

        DAO<Filme> dao = new DAO<Filme>(Filme.class);
        List<Filme> filmes = dao.consultar("obterFilmesComNotaMaiorQue", "nota", 8.0);

        for (Filme f : filmes) {
            System.out.println("Filmes com nota maior de 8.0:" + f.getNome() + "\n" + "Com nota de:" + f.getNota());
            System.out.println("    Atores desse filme:" + f.getAtores().toString());
        }

    }
}
