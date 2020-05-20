package teste.muitospramuitos;

import infra.DAO;
import modelo.muitospramuitos.Sobrinho;
import modelo.muitospramuitos.Tio;

public class NovoTioSobrinho {

    public static void main(String[] args) {
        Tio tia1 = new Tio("Maria");
        Tio tio2 = new Tio("João");

        Sobrinho sob1 = new Sobrinho("Junior Chicó");
        Sobrinho sob2 = new Sobrinho("Ana Mina");

        tia1.getSobrinhos().add(sob1);
        sob1.getTios().add(tia1);

        tia1.getSobrinhos().add(sob2);
        sob2.getTios().add(tia1);

        tio2.getSobrinhos().add(sob1);
        sob1.getTios().add(tio2);

        tio2.getSobrinhos().add(sob2);
        sob2.getTios().add(tio2);

        DAO<Object> objectDAO = new DAO<>();
        objectDAO.abrirTrans()
                .incluir(tia1)
                .incluir(tio2)
                .incluir(sob1)
                .incluir(sob2)
                .fecharTrans()
                .fecharDAO();;
    }

}
