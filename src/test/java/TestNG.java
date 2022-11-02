import io.github.bonigarcia.wdm.WebDriverManager;
import org.bouncycastle.est.ESTAuth;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.sql.SQLOutput;

public class TestNG {


    @Test
    public void basariliMailTesti(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.google.com");
        System.out.println("Basarili bir  mail testidir.");
        driver.close();
    }
    @Test
    public void basarilisizMailTesti(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.google.com");
        System.out.println("Basarisiz bir  mail testidir.");
        driver.close();
    }

}
