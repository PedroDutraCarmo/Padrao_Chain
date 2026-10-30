package padroescomportamentais.chainofresponsability.arquitetura;

public class TipoProjetoComercial implements TipoProjeto {
    private static TipoProjetoComercial tipoProjetoComercial = new TipoProjetoComercial();
    private TipoProjetoComercial() {};
    public static TipoProjetoComercial getTipoProjetoComercial() {
        return tipoProjetoComercial;
    }
}