package teste.heranca;

import infra.DAO;
import modelo.heranca.Aluno;
import modelo.heranca.AlunoBolsista;

public class NovoAluno {

    public static void main(String[] args) {
        DAO<Aluno> dao = new DAO<>(Aluno.class);
        Aluno aluno = new Aluno((long) 1234, "João");
        AlunoBolsista alunoBolsista = new AlunoBolsista(1235L, "Victor", 250.0);

        dao.incluirAtomico(aluno);
        dao.incluirAtomico(alunoBolsista);
        dao.fecharDAO();

    }

}
