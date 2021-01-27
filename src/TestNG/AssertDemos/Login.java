package TestNG.AssertDemos;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Login {

    @Test
    public void mytest()
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://stock.scriptinglogic.net");

        WebElement txtUser = driver.findElement(By.id("login-username"));
        txtUser.sendKeys("admin1");

        WebElement txtPass = driver.findElement(By.id("login-password"));
        txtPass.sendKeys("admin1");

        WebElement btnLogin = driver.findElement(By.name("submit"));
        btnLogin.click();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        /*String expected ="http://stock.scriptinglogic.net/dashboard.php";

        String actual = driver.getCurrentUrl();
        System.out.println("actual="+actual);

        Assert.assertEquals(actual,expected,"its different url");
*/
      /*  String expected = "POSNIC - Dashboard";

        String actual = driver.getTitle();
        System.out.println("actual="+actual);

        Assert.assertEquals(actual,expected,"its different page title");*/

        String expected = "Dashboard";

        String actual="";

        try {
            actual = driver.findElement(By.xpath("//a[contains(@class,'active')]")).getText();
            System.out.println("actual="+actual);
        }
        catch (Exception e)
        {

        }

        Assert.assertEquals(actual,expected,"its different text");
    }
}
