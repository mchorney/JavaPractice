package hw21;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SeleniumTestFirst {
    private WebDriver driver;

    @BeforeMethod
    public void startUp() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
    }
    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void loginToKoelappSuccess() throws InterruptedException {

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
    public void loginToKoelappUnSuccessful() throws InterruptedException {
        driver.get("https://koelapp.testpro.io/#!/home");
        Thread.sleep(3000);

        String loginFormFrame = driver.findElement(By.xpath("//form[@data-v-e0457900]")).getAttribute("class");

        WebElement emailAddress = driver.findElement(By.xpath("//*[@type='email']"));
        emailAddress.sendKeys("koeluser03@testpro.io");
        WebElement password = driver.findElement(By.xpath("//*[@type='password']"));
        password.sendKeys("qwerty");
        Thread.sleep(3000);
        WebElement loginButton = driver.findElement(By.xpath("//*[@type='submit']"));
        loginButton.click();
        Thread.sleep(3000);

        String loginFormFrameRed = driver.findElement(By.xpath("//form[@data-v-e0457900]")).getAttribute("class");

        Assert.assertNotEquals(loginFormFrame, loginFormFrameRed);


        System.out.println("Test is passed");
    }
}
