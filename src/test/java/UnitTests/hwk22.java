package UnitTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class hwk22 {
    @Test
    public void hwk22_CheckError() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://koelapp.testpro.io");
        Thread.sleep(2000);
        WebElement klass = driver.findElement(By.xpath("//div[@class='login-wrapper']/form"));

        Assert.assertNotEquals(klass.getCssValue("border-color"), "rgb(142, 73, 71)");
        Assert.assertNotEquals(klass.getAttribute("class"), "error");

        driver.findElement(By.xpath("//input[@type='email']")).sendKeys("koeluser03@testpro.io");
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("te$t1ng$tudent");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(2000);

        Assert.assertEquals(klass.getCssValue("border-color"), "rgb(142, 73, 71)");
        Assert.assertEquals(klass.getAttribute("class"), "error");
        Thread.sleep(2000);

        driver.quit();
    }
}
