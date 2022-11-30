package WebsiteTesting;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class searchOnGoogle {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        driver.navigate().to("https://www.google.com/");
        driver.findElement(By.name("q")).sendKeys("Java");
        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
        
        //Validation{By title}
        String actualTitle= driver.getTitle();
        String expected="Java";
        Assert.assertEquals(actualTitle,expected);

        //print curreny url
        System.out.println(driver.getCurrentUrl());
        //print page source
        System.out.println(driver.getPageSource());
        driver.close();driver.quit();

    }
}
