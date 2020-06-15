package hw2_3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class KoelLogin {
    @Test
    public void Test_EnterPasswordAndLogin_PageOpened() throws InterruptedException {
        //Arrange
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        WebDriver driver = new ChromeDriver();


        driver.get("https://koelapp.testpro.io");
//        driver.manage().window().maximize();
        Thread.sleep(2000);
        //Act
        WebElement email = driver.findElement(By.xpath("//*[@type=\"email\"]"));
        email.sendKeys("koeluser03@testpro.io");
        WebElement password = driver.findElement(By.xpath("//*[@type=\"password\"]"));
        password.sendKeys("te$t$tudent");
        WebElement loginButton = driver.findElement(By.xpath("//*[@type=\"submit\"]"));
        loginButton.click();


        String title = driver.getTitle();

        //Assert
//        Positive - Pass
        Assert.assertEquals(title, "Koel");

//        Negative - Fail
//        Assert.assertEquals(title, "no-touchevents mac with-extra-panel");

        Thread.sleep(5000);
        driver.quit();
    }
}
