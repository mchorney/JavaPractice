package shw2_3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstSeleniumTest {
    @Test
    public void loginToKoelSuccess() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://koelapp.testpro.io/#!/home");
        Thread.sleep(3000);
        WebElement emailAddress = driver.findElement(By.xpath("//*[@type='email']"));
        emailAddress.sendKeys("koeluser03@testpro.io");
        WebElement password = driver.findElement(By.xpath("//*[@type='password']"));
        password.sendKeys("te$t$tudent");
        WebElement loginButton = driver.findElement(By.xpath("//*[@type='submit']"));
        loginButton.click();
        Thread.sleep(3000);
        String title = driver.getTitle();
        Assert.assertEquals(title, "Koel");
        Thread.sleep(3000);
        driver.quit();
        System.out.println("Test is passed");
    }
    @Test
    public void loginToKoelWithInvalidCredentials() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://koelapp.testpro.io/#!/home");
        Thread.sleep(3000);

        String loginFormFrame = driver.findElement(By.xpath("//form[@data-v-e0457900]")).getAttribute("class");
        WebElement emailAddress = driver.findElement(By.xpath("//*[@type='email']"));
        emailAddress.sendKeys("koeluser03@testpro.io");
        WebElement password = driver.findElement(By.xpath("//*[@type='password']"));
        password.sendKeys("wrongPassword");
        Thread.sleep(3000);
        WebElement loginButton = driver.findElement(By.xpath("//*[@type='submit']"));
        loginButton.click();
        Thread.sleep(3000);

        String loginFormFrameRed = driver.findElement(By.xpath("//form[@data-v-e0457900]")).getAttribute("class");
        Assert.assertNotEquals(loginFormFrame, loginFormFrameRed);
        driver.quit();
        System.out.println("Test is passed");
    }
}
