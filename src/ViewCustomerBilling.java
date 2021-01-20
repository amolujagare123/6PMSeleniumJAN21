import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ViewCustomerBilling {


    public static void main(String[] args) {


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://billing.scriptinglogic.net");
        driver.manage().window().maximize();

        WebElement txtUser = driver.findElement(By.xpath("//input[@type='email']"));
        txtUser.sendKeys("amolujagare@gmail.com");

        WebElement txtPass = driver.findElement(By.xpath("//input[@type='password']"));
        txtPass.sendKeys("admin123");

        WebElement btnLogin = driver.findElement(By.xpath("//input[@value='Login']"));
        btnLogin.click();

        WebElement client = driver.findElement(By.xpath("//span[text()='Clients']"));
        client.click();

        WebElement viewClient = driver.findElement(By.xpath("//a[text()='View Clients']"));
        viewClient.click();

        String name= "ABC1 Pvt Ltd";

        // 1. options
        driver.findElement(By.xpath("//tr[td/a[text()='"+name+"']]//div")).click();


        //2.edit
        driver.findElement(By.xpath("//tr[td/a[text()='"+name+"']]//i[contains(@class,'edit')]")).click();


    }
}
