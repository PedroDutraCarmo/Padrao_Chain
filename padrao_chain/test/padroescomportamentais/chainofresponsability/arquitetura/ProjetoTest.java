package padroescomportamentais.chainofresponsability.arquitetura;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProjetoTest {

    EngenheiroChefe chefe;
    AvaliadorSenior senior;
    AvaliadorPleno pleno;
    AvaliadorJunior junior;

    @BeforeEach
    void setUp() {
        chefe = new EngenheiroChefe(null);
        senior = new AvaliadorSenior(chefe);
        pleno = new AvaliadorPleno(senior);
        junior = new AvaliadorJunior(pleno);
    }

    @Test
    void deveRetornarJuniorParaAssinaturaResidencial() {
        assertEquals("Arquiteto Júnior", junior.assinarProjeto(new Projeto(TipoProjetoResidencial.getTipoProjetoResidencial())));
    }

    @Test
    void deveRetornarPlenoParaAssinaturaComercial() {
        assertEquals("Arquiteto Pleno", junior.assinarProjeto(new Projeto(TipoProjetoComercial.getTipoProjetoComercial())));
    }

    @Test
    void deveRetornarSeniorParaAssinaturaUrbanistico() {
        assertEquals("Arquiteto Sênior", junior.assinarProjeto(new Projeto(TipoProjetoUrbanistico.getTipoProjetoUrbanistico())));
    }

    @Test
    void deveRetornarChefeParaAssinaturaIndustrial() {
        assertEquals("Engenheiro Chefe", junior.assinarProjeto(new Projeto(TipoProjetoIndustrial.getTipoProjetoIndustrial())));
    }

    @Test
    void deveRetornarSemAssinaturaParaAssinaturaGovernamental() {
        assertEquals("Sem assinatura", junior.assinarProjeto(new Projeto(TipoProjetoGovernamental.getTipoProjetoGovernamental())));
    }
}