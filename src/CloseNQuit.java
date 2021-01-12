import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseNQuit {

    public static void main(String[] args) throws InterruptedException {

        // open a browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        // maximize browser
        driver.manage().window().maximize();

        // open url
        driver.get("http://naukri.com");

     //  driver.close();
        // closes the current window only

        Thread.sleep(2000);

        driver.quit();
        // closes all the windows opened by the driver



    }
}
