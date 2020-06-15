package SHW2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.sql.Driver;

public class LoginKoel {
    @Test
    public void loginKoel_enterCorrectCredentials_AppOpened() throws InterruptedException {
        //Arange
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Ilona\\IdeaProjects\\JavaCore3\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();

        driver.get("https://koelapp.testpro.io");
        Thread.sleep(2000);
        //Act

        WebElement inputEmailAddress= driver.findElement(By.xpath("//*[@ type=\"email\"]"));
//        inputEmailAddress.click();
        inputEmailAddress.sendKeys("koeluser03@testpro.io");

        WebElement inputPassword = driver.findElement(By.xpath("//*[@ type=\"password\"]"));
        inputPassword.sendKeys("te$t$tudent");

        WebElement loginButton=driver.findElement(By.xpath("//*[@ type=\"submit\"]"));
        loginButton.click();
        Thread.sleep(3000);

        WebElement search=driver.findElement(By.id("searchForm"));

        //Assert
        Assert.assertNotNull(search);

        Thread.sleep(3000);
        driver.quit();
    }
    @Test
    public void loginKoel_enterIncorrectCredentials_AppOpened() throws InterruptedException {
        //Arange
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Ilona\\IdeaProjects\\JavaCore3\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();

        driver.get("https://koelapp.testpro.io");
        Thread.sleep(2000);
        //Act

        WebElement inputEmailAddress= driver.findElement(By.xpath("//*[@ type=\"email\"]"));
//        inputEmailAddress.click();
        inputEmailAddress.sendKeys("koeluser03@testpro.io");

        WebElement inputPassword = driver.findElement(By.xpath("//*[@ type=\"password\"]"));
        inputPassword.sendKeys("1te$t$tudent");

        WebElement loginButton=driver.findElement(By.xpath("//*[@ type=\"submit\"]"));
        loginButton.click();
        Thread.sleep(3000);

        loginButton=driver.findElement(By.xpath("//*[@ type=\"submit\"]"));

        //Assert
        Assert.assertNotNull(loginButton);

        Thread.sleep(3000);
        driver.quit();
    }
}
