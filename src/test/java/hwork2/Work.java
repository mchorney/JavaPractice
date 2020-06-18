package hwork2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class Work {
    @Test
    public void log() throws InterruptedException {

        //Arrange
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://koelapp.testpro.io/");
        driver.manage().window().maximize();
        Thread.sleep(2000);

        //Act
        WebElement emailField = driver.findElement(By.xpath("//input[@type=\"email\"]"));
        emailField.sendKeys("koeluser03@testpro.io");
        WebElement passwordField = driver.findElement(By.xpath("//input[@type=\"password\"]"));
        passwordField.sendKeys("te$t$tudent");
        WebElement submitButton = driver.findElement(By.xpath("//button[@type=\"submit\"]"));
        submitButton.click();

        String title = driver.getTitle();

        //Assert
        Assert.assertEquals(title, "Koel", "Title not match expected!");
        Thread.sleep(2000);
        driver.quit();
    }

    @Test
    public void logerror() throws InterruptedException {
        //Arrange
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://koelapp.testpro.io/");
        driver.manage().window().maximize();
        Thread.sleep(2000);

        //Act
        WebElement emailField = driver.findElement(By.xpath("//input[@type=\"email\"]"));
        emailField.sendKeys("koeluser03@testpro.io");
        WebElement passwordField = driver.findElement(By.xpath("//input[@type=\"password\"]"));
        passwordField.sendKeys("te$t$tudent4");
        WebElement submitButton = driver.findElement(By.xpath("//button[@type=\"submit\"]"));
        submitButton.click();
        Thread.sleep(2000);

        List<WebElement> errs = driver.findElements(By.xpath("//*[@class=\"error\"]"));

        //Assert
        Assert.assertTrue(errs.size() != 0, "Element is not present!");
        driver.quit();
    }
}