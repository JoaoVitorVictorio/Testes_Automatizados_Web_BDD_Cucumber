package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;


public class PrimeiroTest {
	@Dado("que criei um arquivo corretamente")
	public void queCrieiUmArquivoCorretamente() {
		System.out.println("Passou o 1º teste");
	}

	@Quando("executá-lo")
	public void executáLo() {
		System.out.println("Passou o 2º teste");
	}

	@Então("a execução deve ser finalizada com sucesso")
	public void aExecuçãoDeveSerFinalizadaComSucesso() {
		System.out.println("Passou o 3º teste");
	}
	
}