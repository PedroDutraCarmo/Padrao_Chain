package padroescomportamentais.chainofresponsability.arquitetura;

public class TipoProjetoIndustrial implements TipoProjeto {
    private static TipoProjetoIndustrial tipoProjetoIndustrial = new TipoProjetoIndustrial();
    private TipoProjetoIndustrial() {};
    public static TipoProjetoIndustrial getTipoProjetoIndustrial() {
        return tipoProjetoIndustrial;
    }
}