import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class FindElementDemo {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://stock.scriptinglogic.net");

        WebElement txtUser = driver.findElement(By.id("login-username"));
        txtUser.sendKeys("admin");

        WebElement txtPass = driver.findElement(By.id("login-password"));
        txtPass.sendKeys("admin");

        WebElement btnLogin = driver.findElement(By.name("submit"));
        btnLogin.click();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement lnkAddCustomer = driver.findElement(By.linkText("Add Customer"));
        lnkAddCustomer.click();


        WebElement txtName = driver.findElement(By.name("name"));
        txtName.sendKeys("amol12345");

        WebElement txtAddress = driver.findElement(By.name("address"));
        txtAddress.sendKeys("abcd,pune");

        WebElement contact1 = driver.findElement(By.name("contact1"));
        contact1.sendKeys("6956895");

        WebElement contact2 = driver.findElement(By.name("contact2"));
        contact2.sendKeys("6956895");

        WebElement btnAdd = driver.findElement(By.name("Submit"));
        btnAdd.click();
    }
}
