package padroescomportamentais.chainofresponsability.arquitetura;

public class TipoProjetoGovernamental implements TipoProjeto {
    private static TipoProjetoGovernamental tipoProjetoGovernamental = new TipoProjetoGovernamental();
    private TipoProjetoGovernamental() {};
    public static TipoProjetoGovernamental getTipoProjetoGovernamental() {
        return tipoProjetoGovernamental;
    }
}