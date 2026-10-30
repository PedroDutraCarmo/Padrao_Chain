package padroescomportamentais.chainofresponsability.arquitetura;

public class AvaliadorJunior extends Avaliador {

    public AvaliadorJunior(Avaliador superior) {
        listaProjetos.add(TipoProjetoResidencial.getTipoProjetoResidencial());
        setAvaliadorSuperior(superior);
    }

    public String getDescricaoCargo() {
        return "Arquiteto Júnior";
    }
}