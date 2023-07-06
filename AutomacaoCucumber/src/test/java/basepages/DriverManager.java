package basepages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverManager {
    protected static WebDriver driver;

    protected void abreNavegador() {
        driver = new ChromeDriver();
    }

    protected void quitDriver() {
        if (driver != null) {
            driver.quit();
        }
    }

    protected void acesseSite(String url) {
        driver.get(url);
    }
}
