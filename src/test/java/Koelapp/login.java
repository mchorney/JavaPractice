package Koelapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class login {

    @Test
    public void successfulLogin() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver driver = new ChromeDriver();

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
        driver.quit();

    }

    @Test
    public void successfulLogin_WrongName() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver driver = new ChromeDriver();

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
            try {
                Assert.assertEquals(name, "koeluser");
            } catch (AssertionError e) {
                throw new AssertionError("Provided name doesn't match with expected. Test passed.");
            } finally {
                driver.quit();
            }
    }

    @Test
    public void unsuccessfulLogin_FormRed() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver driver = new ChromeDriver();

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
        driver.quit();
    }

    @Test
    public void unsuccessfulLogin_FormRedDisplayed() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver driver = new ChromeDriver();

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
        driver.quit();
    }
}

