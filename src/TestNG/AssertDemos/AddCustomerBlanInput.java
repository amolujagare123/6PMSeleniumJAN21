package TestNG.AssertDemos;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class AddCustomerBlanInput {

    @Test
    public void addcustomerTest()
    {
        WebDriver driver;

        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();

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

        // do not enter any value

        WebElement btnAdd = driver.findElement(By.name("Submit"));
        btnAdd.click();

        String expected ="PLEASE ENTER A CUSTOMER NAME";

        //String exp = "[ AMOL321 ] Customer Details Added !";
        String actual="";

        try {
             actual = driver.findElement(By.xpath("//label[@for='name']")).getText();
        }
        catch (Exception e)
        {

        }

        Assert.assertEquals(actual,expected,"customer is not added");
    }

}
