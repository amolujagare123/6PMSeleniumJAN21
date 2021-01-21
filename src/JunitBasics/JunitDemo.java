package JunitBasics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JunitDemo {

    @Test
    public void myTest1()
    {
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
    }

    @Test
    public void myTest2()
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://stock.scriptinglogic.net");

        WebElement txtUser = driver.findElement(By.id("login-username"));
        txtUser.sendKeys("fdfdf");

        WebElement txtPass = driver.findElement(By.id("login-password"));
        txtPass.sendKeys("fd");

        WebElement btnLogin = driver.findElement(By.name("submit"));
        btnLogin.click();
    }

    @Test
    public void myTest3()
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://stock.scriptinglogic.net");

        WebElement txtUser = driver.findElement(By.id("login-username"));
        txtUser.sendKeys("");

        WebElement txtPass = driver.findElement(By.id("login-password"));
        txtPass.sendKeys("");

        WebElement btnLogin = driver.findElement(By.name("submit"));
        btnLogin.click();
    }

}
