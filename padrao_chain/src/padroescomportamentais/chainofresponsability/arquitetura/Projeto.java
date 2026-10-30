package padroescomportamentais.chainofresponsability.arquitetura;

public class Projeto {
    private TipoProjeto tipoProjeto;

    public Projeto(TipoProjeto tipoProjeto) {
        this.tipoProjeto = tipoProjeto;
    }

    public TipoProjeto getTipoProjeto() {
        return tipoProjeto;
    }

    public void setTipoProjeto(TipoProjeto tipoProjeto) {
        this.tipoProjeto = tipoProjeto;
    }
}