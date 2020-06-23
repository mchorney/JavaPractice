package Koelapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class login {
    private WebDriver driver;

    @BeforeMethod
    public void strartUp() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test
    public void successfullLogin() throws InterruptedException {

        //Arrange
        driver.get("https://koelapp.testpro.io/");
        Thread.sleep(2000);

        //Act
        WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
        WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
        WebElement buttonLogin = driver.findElement(By.xpath("//button[@type='submit']"));

        email.sendKeys("koeluser66@testpro.io");
        password.sendKeys("te$t$tudent");
        buttonLogin.click();

        //Assert
        Thread.sleep(2000);
        WebElement userName = driver.findElement(By.xpath("//span[@class='name']"));
        String name = userName.getText();
        Assert.assertEquals(name, "koeluser66");
    }

    @Test
    public void successfullLogin_WrongName() throws InterruptedException {

        //Arrange
        driver.get("https://koelapp.testpro.io/");
        Thread.sleep(2000);

        //Act
        WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
        WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
        WebElement buttonLogin = driver.findElement(By.xpath("//button[@type='submit']"));

        email.sendKeys("koeluser66@testpro.io");
        password.sendKeys("te$t$tudent");
        buttonLogin.click();

        //Assert
        Thread.sleep(1000);

        WebElement userName = driver.findElement(By.xpath("//span[@class='name']"));
        String name = userName.getText();
        Assert.assertEquals(name, "koeluser6");
    }

    @Test
    public void unsuccessfullLogin_FormRed() throws InterruptedException {


        //Arrange
        driver.get("https://koelapp.testpro.io/");
        Thread.sleep(2000);

        //Act
        WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
        WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
        WebElement buttonLogin = driver.findElement(By.xpath("//button[@type='submit']"));

        email.sendKeys("koeluse66@testpro.io");
        password.sendKeys("te$t$tuden");
        buttonLogin.click();

        //Assert
        Thread.sleep(2000);
        WebElement formRed = driver.findElement(By.xpath("//form[@class='error']"));
        Assert.assertNotNull(formRed);
        String colorRed = formRed.getCssValue("border-color");
        Assert.assertEquals(colorRed, "rgb(142, 73, 71)");

    }

    @Test
    public void unsuccessfullLogin_FormRedDisplayed() throws InterruptedException {

        //Arrange
        driver.get("https://koelapp.testpro.io/");
        Thread.sleep(2000);

        //Act
        WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
        WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
        WebElement buttonLogin = driver.findElement(By.xpath("//button[@type='submit']"));

        email.sendKeys("koeluse66@testpro.io");
        password.sendKeys("te$t$tuden");
        buttonLogin.click();

        //Assert
        Thread.sleep(2000);
        WebElement formRed = driver.findElement(By.xpath("//form[@class='error']"));
        Assert.assertTrue(formRed.isDisplayed());
    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }
}

