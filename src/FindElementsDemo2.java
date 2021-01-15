import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FindElementsDemo2 {


    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://scriptinglogic.org");

        List<WebElement> btnList =  driver.findElements(By.className("elementor-button-text"));

        // element.getText()
        System.out.println("Total buttons="+btnList.size());

        for(int i=0;i<btnList.size();i++)
            System.out.println(btnList.get(i).getText());

    }
}
