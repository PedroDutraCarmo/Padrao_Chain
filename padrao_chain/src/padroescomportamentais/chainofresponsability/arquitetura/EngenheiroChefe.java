package padroescomportamentais.chainofresponsability.arquitetura;

public class EngenheiroChefe extends Avaliador {

    public EngenheiroChefe(Avaliador superior) {
        listaProjetos.add(TipoProjetoIndustrial.getTipoProjetoIndustrial());
        setAvaliadorSuperior(superior);
    }

    public String getDescricaoCargo() {
        return "Engenheiro Chefe";
    }
}