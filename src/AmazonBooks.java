import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonBooks {

    public static void main(String[] args) throws InterruptedException {

        // open a browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        // maximize browser
        driver.manage().window().maximize();

        // open url
        driver.get("https://www.amazon.in/s?k=amarendra+chitale&ref=nb_sb_noss_1");

//        driver.findElement(By.xpath("//img[@alt='NLP Life Transforming Neuro Magical Stories']")).click();
        driver.findElement(By.xpath("//img[contains(@alt,'NLP')]")).click();


    }
}
