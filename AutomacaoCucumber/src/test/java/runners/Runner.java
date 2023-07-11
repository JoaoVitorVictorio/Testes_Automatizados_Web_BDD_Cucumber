package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/features", // Define o caminho onde estão localizadas as features dos testes
		glue = "steps", // Define o pacote onde estão localizados os passos dos testes
		tags = "@execute", // Define que apenas os cenários com a tag "@execute" serão executados
		//tags = "@ignore", // Permite ignorar cenários com uma determinada tag
		//tags = {"@execute1", "@execute2"}, // Executa vários cenários de teste especificados pelas tags
		plugin = "pretty", // Formata a saída dos testes no console de maneira legível
		monochrome = false, // Adiciona cores à saída do teste no console
		snippets = SnippetType.CAMELCASE, // Formata os nomes dos passos dos testes em CamelCase
		dryRun = false, // Verifica se o mapeamento entre os passos dos testes e as definições dos cenários está correto
		strict = false // Define o comportamento do teste em caso de falhas na execução
)


public class Runner {
	
	
	
	

}
