import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownDemo {

    public static void main(String[] args) throws InterruptedException {

        // open a browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        // maximize browser
        driver.manage().window().maximize();

        // open url
        driver.get("http://lifepartner.in");


        WebElement drpMStatus = driver.findElement(By.name("ms"));

        Select selMStatus = new Select(drpMStatus);

       // selMStatus.selectByIndex(1);
        //selMStatus.selectByVisibleText("Married earlier");
        selMStatus.selectByValue("7");


    }
}
