import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathContainsDemo {

    public static void main(String[] args) throws InterruptedException {

        // open a browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        // maximize browser
        driver.manage().window().maximize();

        // open url
        driver.get("https://www.amazon.in/s?k=amol+ujagare&crid=TGIO1QP1SZXK&sprefix=amol+uj%2Caps%2C335&ref=nb_sb_ss_ts-a-p_1_7");

    driver.findElement(By.xpath("//span[contains(text(),'Testing')]")).click();


    }
}
