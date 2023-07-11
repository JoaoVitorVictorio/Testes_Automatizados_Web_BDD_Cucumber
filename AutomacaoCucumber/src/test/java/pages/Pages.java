package pages;

import org.openqa.selenium.By;

import basepages.BasePages;

public class Pages extends BasePages {

	public void setEmail(String email) {
		escrever(By.id("email"), email, true);
	}

	public void setSenha(String senha) {
		escrever(By.id("senha"), senha, true);
	}

	public void clicarEntrar() {
		clicarBotao(By.xpath("//button[contains(text(),'Entrar')]"));
	}

	public String getTextoPaginaInicial() {
		return driver.findElement(By.xpath("//div[.=contains(text(),'Bem vindo')]")).getText();
	}

	public void clicarContas() {
		clicarBotao(By.xpath("//a[.=contains(text(),'Contas')]"));
	}

	public void clicarAdicionar() {
		clicarBotao(By.xpath("//a[.=contains(text(),'Adicionar')]"));
	}

	public void informaConta(String conta) {
		escrever("nome", conta);
	}

	public void clicarSalvar() {
		clicarBotao(By.xpath("//button[.=contains(text(),'Salvar')]"));
	}

	public String getContaSalvaComSucesso() {
		return obterTexto(By.xpath("//div[.=contains(text(),'sucesso')]"));
	}

	public String getContaComMesmoNome() {
		return obterTexto(By.xpath("//div[contains(text(),'existe')]"));
	}

	public void clicarEmResetarDados() {
		clicarBotao(By.xpath("//a[contains(text(),'reset')]"));

	}

	public String getDadosResetadosComSucesso() {
		return obterTexto(By.xpath("//div[contains(text(),'resetados ')]"));
	}
}
