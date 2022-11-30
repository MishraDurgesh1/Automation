package WebsiteTesting;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

public class openFacebook {
    public static void main(String[] args) {

        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.facebook.com/");
        Assert.assertEquals("Facebook – log in or sign up",driver.getTitle());
        System.out.println(driver.getTitle().contains("log"));

        driver.close();
    }
}
