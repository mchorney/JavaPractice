package hw2_3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginRedFrame {
    @Test
    public void Test_EnterIncorrectPasswordAndLogin_RedFrame() throws InterruptedException {
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
        password.sendKeys("te$t$tudentt");

        WebElement loginButton = driver.findElement(By.xpath("//*[@type=\"submit\"]"));
        loginButton.click();


        //Assert
//        Positive - Pass
        Thread.sleep(5000);
        WebElement redFrame = driver.findElement(By.xpath("//*[@class=\"error\"]"));
        Assert.assertTrue(redFrame.isDisplayed());

        driver.quit();

    }

}
