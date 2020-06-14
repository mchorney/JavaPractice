package hw2_3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.List;


public class App {
    @Test
    public void AppValidCredentials() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //Arrange
        driver.get("https://koelapp.testpro.io/");
        driver.manage().window().maximize();
        Thread.sleep(9000);

        //Act
        WebElement emailField = driver.findElement(By.xpath("//input[@type=\"email\"]"));
        emailField.sendKeys("koeluser03@testpro.io");
        WebElement passwordField = driver.findElement(By.xpath("//input[@type=\"password\"]"));
        passwordField.sendKeys("te$t$tudent");
        WebElement submitButton = driver.findElement(By.xpath("//button[@type=\"submit\"]"));
        submitButton.click();

        String title = driver.getTitle();

        Assert.assertEquals(title, "Koel", "Hey, koeluser03!");
        Thread.sleep(11000);
        driver.quit();
    }

    @Test
    public void AppUnvalidCredentials() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://koelapp.testpro.io/");
        driver.manage().window().maximize();
        Thread.sleep(4000);

        WebElement emailField = driver.findElement(By.xpath("//input[@type=\"email\"]"));
        emailField.sendKeys("koeluser@testpro.io");
        WebElement passwordField = driver.findElement(By.xpath("//input[@type=\"password\"]"));
        passwordField.sendKeys("te$t$");
        WebElement submitButton = driver.findElement(By.xpath("//button[@type=\"submit\"]"));
        submitButton.click();
        Thread.sleep(9000);

        List<WebElement> errors = driver.findElements(By.xpath("//*[@class=\"error\"]"));

        Assert.assertEquals(errors.size(), 1, "Element is not present!");
        driver.quit();
    }
}
