package googleTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.sql.Driver;

public class Main {
    public static void main(String[] args) {
        //Ne conectam la driverul de Chrome descarcat mai devreme
        System.setProperty("webdriver.chrome.driver", "C://Program Files//chromedriver extracted//chromedriver extracted");
        System.setProperty("webdriver.http.factory", "jdk-http-client");
        //Facem un obiect de tip ChromeDriver
        WebDriver chromedriver = new ChromeDriver();

        chromedriver.manage().window().maximize();

        chromedriver.get("https://www.emag.ro/");
    }
}