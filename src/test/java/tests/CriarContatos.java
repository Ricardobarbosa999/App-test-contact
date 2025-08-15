package tests;

import base.BaseTest;
import org.junit.Assert;
import org.junit.Test;
import pages.ContatosPage;
import utils.DriverFactory;

public class CriarContatos extends BaseTest {

    @Test
    public void deveCriarNovoContato() {
        ContatosPage contatosPage = new ContatosPage(DriverFactory.getDriver());

        contatosPage.abrirIconeTelefone();
        contatosPage.abrirdisknumber();
        contatosPage.clicarAddContato();

        String telefone = "11999999999";
        String nome = "João";
        String sobrenome = "Teste";
        String email = "joao.barbosa@testes.com";

        contatosPage.clicarNovoContato();
        contatosPage.preencherNome(nome);
        contatosPage.preencherSobrenome(sobrenome);
        contatosPage.preencherTelefone(telefone);
        contatosPage.preencherEmail(email);

        contatosPage.salvarContato();

        String nomeCompletoSalvo = contatosPage.obterNomeContatoSalvo();
        Assert.assertEquals(nome + " " + sobrenome, nomeCompletoSalvo);
    }
}
