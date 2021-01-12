import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class SeleniumDemo2 {

    public static void main(String[] args) {

        // open a browser

      /*  WebDriverManager.firefoxdriver().setup();

        WebDriver driver = new FirefoxDriver();*/

        /*WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();*/

        WebDriverManager.iedriver().setup();
        WebDriver driver = new InternetExplorerDriver();

        // maximize browser
        driver.manage().window().maximize();

        // open url
        driver.get("http://gmail.com");


    }
}
