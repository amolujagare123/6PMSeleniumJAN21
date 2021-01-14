import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectList {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();


        driver.get("file:///D:/Scriptinglogic%20docs/class%20Activities/Selenium/Mywebsite/amol.html");

        WebElement multiText = driver.findElement(By.id("multiSel"));

        Select selMultiText = new Select(multiText) ;

        Thread.sleep(2500);
        selMultiText.selectByVisibleText("text 1");

        Thread.sleep(2500);
        selMultiText.selectByVisibleText("text 3");

        Thread.sleep(2500);
        selMultiText.selectByVisibleText("text 4");

      /*  Thread.sleep(2500);
        selMultiText.deselectByVisibleText("text 3");

        Thread.sleep(2500);
        selMultiText.deselectByVisibleText("text 4");*/

        Thread.sleep(2500);
        selMultiText.deselectAll();

    }
}
