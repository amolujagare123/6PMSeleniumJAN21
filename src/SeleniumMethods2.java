import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumMethods2 {

    public static void main(String[] args) {

        // open a browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        // maximize browser
        driver.manage().window().maximize();

        // open url
        driver.get("http://scriptinglogic.com");


        System.out.println(driver.getPageSource());


    }
}
