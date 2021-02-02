package TestNG.Real;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class socialSites {

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
    public void facebook() {

        driver.get("http://facebook.com");
    }

    @Test
    public void instagram() {

        driver.get("https://www.instagram.com");
    }
    @Test
    public void twitter() {

        driver.get("https://www.twitter.com/");
    }



}
