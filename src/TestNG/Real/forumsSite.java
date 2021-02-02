package TestNG.Real;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class forumsSite {

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
    public void stackoverflow() {

        driver.get("http://stackoverflow.com");

        Assert.assertTrue(false,"wrong site");
    }

    @Test
    public void sqaforums() {

        driver.get("http://www.sqaforums.com/");
    }
    @Test
    public void quora() {

        driver.get("https://www.quora.com/");
    }



}
