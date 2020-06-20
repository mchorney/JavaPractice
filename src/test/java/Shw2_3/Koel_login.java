package Shw2_3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class Koel_login {
    @Test
    public void Koel_Login() throws InterruptedException {
        //Arrange
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://koelapp.testpro.io/#!/home");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        //Act
        WebElement email = driver.findElement(By.xpath("//*[@type='email']"));
        email.sendKeys("testpro.user03@testpro.io");
        WebElement password = driver.findElement(By.xpath("//*[@type='password']"));
        password.sendKeys("te$t$tudent");

        WebElement loginBotton = driver.findElement(By.xpath("//*[@type='submit']"));

        loginBotton.click();

        String title = driver.getTitle();

        //Assert
        Assert.assertEquals(title, "Koel");

        Thread.sleep(5000);
        driver.quit();
    }


    @Test
    public void Koel__WrongCredantials_Login_() throws InterruptedException {
        //Arrange
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://koelapp.testpro.io/#!/home");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        //Act
        WebElement email = driver.findElement(By.xpath("//*[@id=\"app\"]/div/form/input[1]"));
        email.sendKeys("testpro.user03@testproi.io");
        WebElement password = driver.findElement(By.xpath("//*[@id=\"app\"]/div/form/input[2]"));
        password.sendKeys("te$t$tudent");

        WebElement loginBotton = driver.findElement(By.xpath("//*[@id=\"app\"]/div/form/button"));

        loginBotton.click();

        WebElement redSquare = driver.findElement(By.xpath("//*[@id=\"app\"]/div/form"));

        //Assert
        redSquare.isDisplayed();

        Thread.sleep(5000);
        driver.quit();
    }
}
