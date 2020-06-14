package hw1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class correctCredentials {
    @Test
    public void test_InsertCredentials_OpenedCabinet() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://koelapp.testpro.io/#!/home");
        Thread.sleep(2000);

        WebElement searchLogin = driver.findElement(By.xpath("//*[@type='email']"));
        searchLogin.sendKeys("testpro.user03@testpro.io");

        WebElement searchPassword = driver.findElement(By.xpath("//*[@type='password']"));
        searchPassword.sendKeys("te$t$tudent");

        WebElement searchButton = driver.findElement(By.xpath("//*[@type='submit']"));
        searchButton.click();
        Thread.sleep(3000);

        String name = driver.findElement(By.xpath("//*[@class='music']//h1")).getText();
        Assert.assertEquals(name,"YOUR MUSIC");

        Thread.sleep(5000);
        driver.quit();

    }
}
