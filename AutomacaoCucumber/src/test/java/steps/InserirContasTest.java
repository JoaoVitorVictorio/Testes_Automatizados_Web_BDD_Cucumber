package steps;
import org.junit.Assert;

import basepages.DriverManager;
import io.cucumber.java.After;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import pages.Pages;

public class InserirContasTest extends Pages {
	Pages page = new Pages();

	@Dado("que esteja acessando a aplicação")
	public void queEstejaAcessandoAAplicação() {
		abreNavegador();
        acesseSite("https://seubarriga.wcaquino.me/login");
	}

	@E("informar o usuário correto")
	public void informarOUsuárioCorreto() {
		page.setEmail("joaoteste@gmail.com"); 
	}

	@E("a senha correta")
	public void aSenhaCorreta() {
		page.setSenha("123456");
	}

	@E("clicar em entrar")
	public void clicarEmEntrar() {
		page.clicarEntrar();
	}

	@E("estiver na tela inicial")
	public void estiverNaTelaInicial() {
		Assert.assertEquals("Bem vindo, João Vitor!", page.getTextoPaginaInicial());
	}
	
	@E("clicar em contas")
	public void clicarEmContas() {
	   page.clicarContas();
	}

	@E("clicar em adicionar")
	public void clicarEmAdicionar() {
	    page.clicarAdicionar();
	}

	@E("informar a conta {string}")
	public void informarAConta(String contaTeste) {
	    page.informaConta(contaTeste);
	}

	@Quando("clicar em Salvar")
	public void clicarEmSalvar() {
		page.clicarSalvar();
	}

	@Então("a conta será inserida será salva com sucesso")
	public void aContaSeráInseridaSeráSalvaComSucesso() {
		Assert.assertEquals("Conta adicionada com sucesso!", page.getContaSalvaComSucesso());
	}

	@After
	public void fecharNavegador() {
		DriverManager.driver.quit();
	}

}
