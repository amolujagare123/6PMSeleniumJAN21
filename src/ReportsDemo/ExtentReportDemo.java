package ReportsDemo;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import static ReportsDemo.util.ScreenShots.getScreenshot;

public class ExtentReportDemo {

    ExtentReports extent;

    @BeforeClass
    public void init()
    {
        ExtentSparkReporter reporter = new ExtentSparkReporter("Reports\\report.html");

        reporter.config().setDocumentTitle("My stock project");
        reporter.config().setReportName("Regression tests");

        extent=new ExtentReports();
        extent.attachReporter(reporter);

        extent.setSystemInfo("Project name","stock management");
        extent.setSystemInfo("Dev name","Amol");
        extent.setSystemInfo("Testers Name","Smita");
        extent.setSystemInfo("Start date","2-feb-2021");

    }


    @AfterClass
    public void writeReport()
    {
        extent.flush();
    }


    @Test
    public void validLoginTest() throws IOException {

        ExtentTest test = extent.createTest("validLoginTest");

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        test.info("browser is opened");


        driver.manage().window().maximize();

        test.info("browser is maximize");


        driver.get("http://stock.scriptinglogic.net");

        test.info("url is opened");

        WebElement txtUser = driver.findElement(By.id("login-username"));
        txtUser.sendKeys("admin");

        test.info("username is entered");

        WebElement txtPass = driver.findElement(By.id("login-password"));
        txtPass.sendKeys("admin");

        test.info("passswoed is entered");

        WebElement btnLogin = driver.findElement(By.name("submit"));
        btnLogin.click();

        test.info("login button is clicked");

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        String expected ="http://stock.scriptinglogic.net/dashboard.php1";
        String actual = driver.getCurrentUrl();
        try {
            Assert.assertEquals(actual, expected, "wrong url");
            test.pass("test is passed");
        }
        catch (AssertionError e)
        {
            test.fail(e.getMessage());

            test.addScreenCaptureFromPath("./screenshots/"+getScreenshot(driver));

            // "./screenshots/Imgae_20218898989.png"
        }
    }

    @Test
    public void invalidLoginTest() throws IOException {

        ExtentTest test = extent.createTest("invalidLoginTest");

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        test.info("browser is opened");


        driver.manage().window().maximize();

        test.info("browser is maximize");


        driver.get("http://stock.scriptinglogic.net");

        test.info("url is opened");

        WebElement txtUser = driver.findElement(By.id("login-username"));
        txtUser.sendKeys("sds");

        test.info("username is entered");

        WebElement txtPass = driver.findElement(By.id("login-password"));
        txtPass.sendKeys("dsd");

        test.info("passswoed is entered");

        WebElement btnLogin = driver.findElement(By.name("submit"));
        btnLogin.click();

        test.info("login button is clicked");

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        String expected ="http://stock.scriptinglogic.net/index.php?msg=Wrong%20Username%20or%20Password&type=error";
        String actual = driver.getCurrentUrl();

        try {
            Assert.assertEquals(actual, expected, "wrong url");
            test.pass("test is passed");
            }
        catch (AssertionError e)
        {
            test.fail(e.getMessage());
            test.addScreenCaptureFromPath("./screenshots/"+getScreenshot(driver));
        }

        }

    @Test
    public void blankLoginTest() throws IOException {

        ExtentTest test = extent.createTest("blankLoginTest");

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        test.info("browser is opened");


        driver.manage().window().maximize();

        test.info("browser is maximize");


        driver.get("http://stock.scriptinglogic.net");

        test.info("url is opened");

        WebElement txtUser = driver.findElement(By.id("login-username"));
        txtUser.sendKeys("");

        test.info("username is entered");

        WebElement txtPass = driver.findElement(By.id("login-password"));
        txtPass.sendKeys("");

        test.info("passswoed is entered");

        WebElement btnLogin = driver.findElement(By.name("submit"));
        btnLogin.click();

        test.info("login button is clicked");

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        String expected ="http://stock.scriptinglogic.net/";
        String actual = driver.getCurrentUrl();
        try {
            Assert.assertEquals(actual, expected, "wrong url");
            test.pass("test is passed");
        }
        catch (AssertionError e)
        {
            test.fail(e.getMessage());
            test.addScreenCaptureFromPath("./screenshots/"+getScreenshot(driver));
        }
    }
}
