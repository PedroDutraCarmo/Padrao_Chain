package padroescomportamentais.chainofresponsability.arquitetura;

import java.util.ArrayList;

public abstract class Avaliador {

    protected ArrayList listaProjetos = new ArrayList();
    private Avaliador avaliadorSuperior;

    public Avaliador getAvaliadorSuperior() {
        return avaliadorSuperior;
    }

    public void setAvaliadorSuperior(Avaliador avaliadorSuperior) {
        this.avaliadorSuperior = avaliadorSuperior;
    }

    public abstract String getDescricaoCargo();

    public String assinarProjeto(Projeto projeto) {
        if (listaProjetos.contains(projeto.getTipoProjeto())) {
            return getDescricaoCargo();
        }
        else {
            if (avaliadorSuperior != null) {
                return avaliadorSuperior.assinarProjeto(projeto);
            }
            else {
                return "Sem assinatura";
            }
        }
    }
}