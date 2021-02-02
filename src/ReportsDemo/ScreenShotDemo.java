package ReportsDemo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.apache.velocity.texen.util.FileUtil;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITest;
import org.testng.ITestResult;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ScreenShotDemo {

    @Test
    public void myScreenshot() throws IOException {
        // open a browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        // maximize browser
        driver.manage().window().maximize();

        // open url
        driver.get("http://facebook.com");

        // 1. create a reference object of TakesScreenshot (interface)
        // And assign the current driver to it

        TakesScreenshot ts = (TakesScreenshot) driver;

        // 2. create a file object and get the screenshot file in object format
        // using the method getScreenshotAs


        File scrFile = ts.getScreenshotAs(OutputType.FILE);

        // 3. convert (copy) this object into real imgae

   /*     Date date = new Date();
        SimpleDateFormat sd = new SimpleDateFormat("_yyyyMMdd_hhmmss");
        String dateStr = sd.format(date);

*/
        String timeStamp = new SimpleDateFormat("_yyyyMMdd_hhmmss").format(new Date());

        String imgName ="Image"+timeStamp+".png";

        FileUtils.copyFile(scrFile,new File("D:\\pallavi\\"+imgName));

    }

}
