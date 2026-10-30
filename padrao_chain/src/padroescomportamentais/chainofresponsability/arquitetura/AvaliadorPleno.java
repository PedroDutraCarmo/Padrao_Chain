package padroescomportamentais.chainofresponsability.arquitetura;

public class AvaliadorPleno extends Avaliador {

    public AvaliadorPleno(Avaliador superior) {
        listaProjetos.add(TipoProjetoComercial.getTipoProjetoComercial());
        setAvaliadorSuperior(superior);
    }

    public String getDescricaoCargo() {
        return "Arquiteto Pleno";
    }
}
