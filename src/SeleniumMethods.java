import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumMethods {

    public static void main(String[] args) {

        // open a browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        // maximize browser
        driver.manage().window().maximize();

        // open url
        driver.get("http://gmail.com");

        driver.navigate().to("http://facebook.com");

        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();

    }
}
