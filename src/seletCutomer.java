import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class seletCutomer {


    public static void main(String[] args) {


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://stock.scriptinglogic.net");
        driver.manage().window().maximize();

        WebElement txtUser = driver.findElement(By.id("login-username"));
        txtUser.sendKeys("admin");

        WebElement txtPass = driver.findElement(By.id("login-password"));
        txtPass.sendKeys("admin");

        WebElement btnLogin = driver.findElement(By.name("submit"));
        btnLogin.click();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement lnkAddCustomer = driver.findElement(By.linkText("Add Customer"));
        lnkAddCustomer.click();

        driver.findElement(By.xpath("//a[text()='View Customers']")).click();

        String name= "Sandeep";

        driver.findElement(By.xpath("//tr[td[text()='"+name+"']]//input")).click();


    }
}
