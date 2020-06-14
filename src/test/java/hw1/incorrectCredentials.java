package hw1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class incorrectCredentials {
    @Test
    public void test_InsertCredentials_RedBorder() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://koelapp.testpro.io/#!/home");
        Thread.sleep(2000);

        WebElement searchLogin = driver.findElement(By.xpath("//*[@type='email']"));
        searchLogin.sendKeys("testpro.user03@testpro5.io");

        WebElement searchPassword = driver.findElement(By.xpath("//*[@type='password']"));
        searchPassword.sendKeys("te$t$tudent");

        WebElement searchButton = driver.findElement(By.xpath("//*[@type='submit']"));
        searchButton.click();
        Thread.sleep(3000);

        WebElement check = driver.findElement(By.xpath("//*[@class='error']"));

        Assert.assertTrue(check.isEnabled());

        Thread.sleep(5000);
        driver.quit();

    }
}
