package hw2_3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HW {
    @Test
    public void HW_logIn_with_correct_credentials() throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.get("https://koelapp.testpro.io");
        driver.manage().window().maximize();
        Thread.sleep(3000);

        WebElement email = driver.findElement(By.xpath("//*[@type=\"email\"]"));
        email.click();
        email.sendKeys("testpro.user03@testpro.io");
        WebElement password = driver.findElement(By.xpath("//*[@type=\"password\"]"));
        password.click();
        password.sendKeys("te$t$tudent");
        WebElement logInButton = driver.findElement(By.xpath("//*[@type=\"submit\"]"));
        logInButton.click();
        Thread.sleep(3000);
        WebElement exitButton = driver.findElement(By.xpath("//*[@class=\"fa fa-sign-out control\"]"));
        driver.quit();
    }
    @Test
    public void HW_verify_signOut() throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.get("https://koelapp.testpro.io");
        driver.manage().window().maximize();
        Thread.sleep(1000);

        WebElement email = driver.findElement(By.xpath("//*[@type=\"email\"]"));
        email.click();
        email.sendKeys("testpro.user03@testpro.io");
        WebElement password = driver.findElement(By.xpath("//*[@type=\"password\"]"));
        password.click();
        password.sendKeys("te$t$tudent");
        WebElement logInButton = driver.findElement(By.xpath("//*[@type=\"submit\"]"));
        logInButton.click();
        Thread.sleep(2000);
        WebElement exitButton = driver.findElement(By.xpath("//*[@class=\"fa fa-sign-out control\"]"));
        exitButton.click();
        Thread.sleep(3000);

        WebElement firstPage = driver.findElement(By.xpath("//*[@class=\"login-wrapper\"]"));
        Assert.assertEquals(true,firstPage.isDisplayed()); 
        driver.quit();
    }
    @Test
    public void HW_not_able_to_LogIn_with_incorrect_email() throws InterruptedException{
        WebDriver driver = new ChromeDriver();

        driver.get("https://koelapp.testpro.io");
        driver.manage().window().maximize();
        Thread.sleep(1000);

        WebElement email = driver.findElement(By.xpath("//*[@type=\"email\"]"));
        email.click();
        email.sendKeys("test.user03@testpro.com");
        WebElement password = driver.findElement(By.xpath("//*[@type=\"password\"]"));
        password.click();
        password.sendKeys("te$t$tudent");
        WebElement logInButton = driver.findElement(By.xpath("//*[@type=\"submit\"]"));
        logInButton.click();

        Thread.sleep(3000);

        WebElement errorFrame = driver.findElement(By.xpath("//*[@class=\"error\"]"));

        Assert.assertEquals(true,errorFrame.isDisplayed());
        driver.quit();

    }

}
