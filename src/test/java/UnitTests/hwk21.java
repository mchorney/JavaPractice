package UnitTests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Base64;

public class hwk21 {
    @Test
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\Program Files\\Selenium\\browser drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://koelapp.testpro.io");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//input[@type='email']")).sendKeys("koeluser03@testpro.io");
        //driver.findElement(By.xpath("//input[@type='password']")).sendKeys("te$t$tudent");
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys(new String (Base64.getDecoder().decode("dGUkdCR0dWRlbnQ=")));
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(2000);

        Assert.assertEquals(driver.getCurrentUrl(), "https://koelapp.testpro.io/#!/home");
        driver.quit();
    }
}
