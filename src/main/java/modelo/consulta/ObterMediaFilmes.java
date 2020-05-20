package modelo.consulta;

import infra.DAO;

public class ObterMediaFilmes {
    public static void main(String[] args) {
        DAO<NotaFilme> dao = new DAO<>(NotaFilme.class);
        NotaFilme mediaFilme = dao.consultarUm("obterMediaGeral");

        System.out.println(mediaFilme.getMedia());

        dao.fecharDAO();
    }
}
