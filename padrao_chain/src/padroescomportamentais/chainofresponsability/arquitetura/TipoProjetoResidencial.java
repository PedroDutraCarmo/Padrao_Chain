package padroescomportamentais.chainofresponsability.arquitetura;

public class TipoProjetoResidencial implements TipoProjeto {
    private static TipoProjetoResidencial tipoProjetoResidencial = new TipoProjetoResidencial();
    private TipoProjetoResidencial() {};
    public static TipoProjetoResidencial getTipoProjetoResidencial() {
        return tipoProjetoResidencial;
    }
}