import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenClinicDemo {

    public static void main(String[] args) throws InterruptedException {

        // open a browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        // maximize browser
        driver.manage().window().maximize();

        // open url
        driver.get("http://openclinic.sourceforge.net/openclinic/admin/staff_list.php");

        // xpath of the edit icon of 'Galaxy'

  driver.findElement(By.xpath("//tr[ td[text()='Galaxy'] ]//img[@title='edit']")).click();


    }
}
