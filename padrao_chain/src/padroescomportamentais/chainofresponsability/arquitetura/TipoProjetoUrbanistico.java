package padroescomportamentais.chainofresponsability.arquitetura;

public class TipoProjetoUrbanistico implements TipoProjeto {
    private static TipoProjetoUrbanistico tipoProjetoUrbanistico = new TipoProjetoUrbanistico();
    private TipoProjetoUrbanistico() {};
    public static TipoProjetoUrbanistico getTipoProjetoUrbanistico() {
        return tipoProjetoUrbanistico;
    }
}