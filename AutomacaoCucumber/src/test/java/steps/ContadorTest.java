package steps;

import org.junit.Assert;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;

public class ContadorTest {
	private int contador = 0;
	
	@Dado("que o valor do contador é {int}")
	public void queOValorDoContadorÉ(int int1) {
		contador = int1;
	}

	@Quando("eu adicionar + {int}")
	public void euAdicionar(int int1) {
		contador += int1;
	}

	@Então("o valor do contador deve ser {int}")
	public void oValorDoContadorDeveSer(int int1) {
		Assert.assertEquals(int1, contador);
	}
}