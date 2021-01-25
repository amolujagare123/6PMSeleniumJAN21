package TestNG;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class LoginDemoBeforeClass {

    WebDriver driver;

    @BeforeClass // method below this annotation will run before first test method of the class
    public void mymethod1()
    {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();

    }

    @AfterClass // method below this annotation will run After last test method of the class
    public void mymethod2() throws InterruptedException {
        Thread.sleep(4000);
        driver.close();
    }

    // ^ we dont need static keyword here (in testNG)

    @Test
    public void myTest1()
    {


        driver.get("http://stock.scriptinglogic.net");

        WebElement txtUser = driver.findElement(By.id("login-username"));
        txtUser.sendKeys("admin");

        WebElement txtPass = driver.findElement(By.id("login-password"));
        txtPass.sendKeys("admin");

        WebElement btnLogin = driver.findElement(By.name("submit"));
       // btnLogin.click();
    }

    @Test
    public void myTest2()
    {

        driver.get("http://stock.scriptinglogic.net");

        WebElement txtUser = driver.findElement(By.id("login-username"));
        txtUser.sendKeys("fdfdf");

        WebElement txtPass = driver.findElement(By.id("login-password"));
        txtPass.sendKeys("fd");

        WebElement btnLogin = driver.findElement(By.name("submit"));
       // btnLogin.click();
    }

    @Test
    public void myTest3()
    {

        driver.get("http://stock.scriptinglogic.net");

        WebElement txtUser = driver.findElement(By.id("login-username"));
        txtUser.sendKeys("");

        WebElement txtPass = driver.findElement(By.id("login-password"));
        txtPass.sendKeys("");

        WebElement btnLogin = driver.findElement(By.name("submit"));
        //btnLogin.click();
    }
}
