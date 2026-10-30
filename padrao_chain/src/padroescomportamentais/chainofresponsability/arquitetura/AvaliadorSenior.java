package padroescomportamentais.chainofresponsability.arquitetura;

public class AvaliadorSenior extends Avaliador {

    public AvaliadorSenior(Avaliador superior) {
        listaProjetos.add(TipoProjetoUrbanistico.getTipoProjetoUrbanistico());
        setAvaliadorSuperior(superior);
    }

    public String getDescricaoCargo() {
        return "Arquiteto Sênior";
    }
}