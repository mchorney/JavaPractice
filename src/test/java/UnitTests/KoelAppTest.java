package UnitTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.Base64;

public class KoelAppTest {
    private WebDriver driver;

    @BeforeMethod
    public void startDriver() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
    }

    @AfterMethod
    public void endTest() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }

    @Test
    public void hwk1_CheckLogin() throws InterruptedException {
        driver.get("https://koelapp.testpro.io");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//input[@type='email']")).sendKeys("koeluser03@testpro.io");
        //driver.findElement(By.xpath("//input[@type='password']")).sendKeys("te$t$tudent");
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys(new String (Base64.getDecoder().decode("dGUkdCR0dWRlbnQ=")));
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(2000);

        Assert.assertEquals(driver.getCurrentUrl(), "https://koelapp.testpro.io/#!/home");
    }

    @Test
    public void hwk2_CheckLoginError() throws InterruptedException {

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
    }
}
