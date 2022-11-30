package WebsiteTesting;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
/**
 * Facebook profile and status update automation ...Durgesh_Mishra
 */

public class FacebookLogin {
    public static void main(String[] args) throws InterruptedException {
        ChromeOptions option=new ChromeOptions();
        option.addArguments("--disable-notifications");
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver(option);
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        driver.findElement(By.id("email")).sendKeys("durgeshmishra13@gmail.com");
        driver.findElement(By.id("pass")).sendKeys("Durgeshsonam1306**");
        driver.findElement(By.name("login")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//span[@class='x1lliihq x6ikm8r x10wlt62 x1n2onr6'][text()='Durgesh Mishra']")).click();
        Thread.sleep(3000);
        //javaScript
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,250)", "");
//        Thread.sleep(3000);
        driver.findElement(By.xpath("//span[@class='x1lliihq x6ikm8r x10wlt62 x1n2onr6 xlyipyv xuxw1ft'][text()='Edit bio']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//textarea[@placeholder='Describe who you are']")).sendKeys("!!");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//span[@class=\"x1lliihq x6ikm8r x10wlt62 x1n2onr6 xlyipyv xuxw1ft\"][text()='Save']")).click();
       Thread.sleep(3000);

        driver.close();
        driver.quit();

    }
}
