import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumDemo1 {

    public static void main(String[] args) {

        // open a browser
        System.setProperty("webdriver.gecko.driver","Drivers\\geckodriver.exe");

        WebDriver driver = new FirefoxDriver();

        // maximize browser
        driver.manage().window().maximize();

        // open url
        driver.get("http://gmail.com");


    }
}
