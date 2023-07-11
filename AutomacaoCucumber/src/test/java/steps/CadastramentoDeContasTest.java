package steps;
import org.junit.Assert;

import basepages.DriverManager;
import io.cucumber.java.After;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import pages.Pages;

public class CadastramentoDeContasTest extends Pages {
	Pages page = new Pages();

	@Dado("que esteja acessando a aplicação")
	public void queEstejaAcessandoAAplicação() {
		abreNavegador();
        acesseSite("https://seubarriga.wcaquino.me/login");
	}

	@E("que informe o usuário correto")
	public void queInformeOUsuárioCorreto() {
		page.setEmail("joaoteste@gmail.com"); 
	}

	@E("a senha correta")
	public void aSenhaCorreta() {
		page.setSenha("123456");
	}

	@E("clique em entrar")
	public void cliqueEmEntrar() {
		page.clicarEntrar();
	}

	@E("esteja na tela inicial")
	public void estejaNaTelaInicial() {
		Assert.assertEquals("Bem vindo, João Vitor!", page.getTextoPaginaInicial());
	}
	
	@E("clique em contas")
	public void cliqueEmContas() {
	   page.clicarContas();
	}

	@E("clique em adicionar")
	public void cliqueEmAdicionar() {
	    page.clicarAdicionar();
	}

	@E("informe a conta {string}")
	public void informeAConta(String contaTeste) {
	    page.informaConta(contaTeste);
	}

	@Quando("clicar em Salvar")
	public void clicarEmSalvar() {
		page.clicarSalvar();
	}
	
	@Quando("clicar no botão reset")
	public void clicarNoBotãoReset() {
		page.clicarEmResetarDados();
	}


	@Então("a conta será salva com sucesso")
	public void a_conta_será_salva_com_sucesso() {
		Assert.assertEquals("Conta adicionada com sucesso!", page.getContaSalvaComSucesso());
	}
	
	@Então("devera ser exibido a mensagem que já existe uma conta com o mesmo nome")
	public void deveraSerExibidoAMensagemQueJáExisteUmaContaComOMesmoNome() {
		Assert.assertEquals("Já existe uma conta com esse nome!", page.getContaComMesmoNome());
	}
	
	@Então("os dados serao resetados com sucesso")
	public void osDadosSeraoResetadosComSucesso() {
		Assert.assertEquals("Dados resetados com sucesso!", page.getDadosResetadosComSucesso());
	}
	
	@After
	public static void fecharNavegador() {
		DriverManager.driver.quit();
	}
}
