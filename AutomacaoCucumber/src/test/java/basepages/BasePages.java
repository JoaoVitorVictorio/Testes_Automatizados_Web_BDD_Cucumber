package basepages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class BasePages extends DriverManager {
    
    public void escrever(By by, String texto, boolean apagar) {
        if (apagar) {
            int tamanho = driver.findElement(by).getAttribute("value").length();

            for (int i = 0; i < tamanho; i++) {
                driver.findElement(by).sendKeys(Keys.BACK_SPACE);
            }
            driver.findElement(by).sendKeys(Keys.BACK_SPACE);
            driver.findElement(by).sendKeys(Keys.HOME);
        }

        driver.findElement(by).sendKeys(texto);
    }

    public void escrever(By by, String texto) {
        escrever(by, texto, false);
    }

    public void escrever(String id_campo, String texto, boolean apagar) {
        escrever(By.id(id_campo), texto, apagar);
    }
    
    public void escrever(String id_campo, String texto) {
        escrever(By.id(id_campo), texto);
    }

    public void clicar(String id, String elemento) {
        driver.findElement(By.id(elemento)).click();
    }

    public void clicarBotao(String id) {
        driver.findElement(By.id(id)).click();
    }

    public void clicarBotao(By by) {
        driver.findElement(by).click();
    }
    
    public String obterTexto(By by) {
    	return driver.findElement(by).getText();
    }
}
