package hm_simpleTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HW_Login {
    @Test
    public void test_LogIn() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://koelapp.testpro.io");
        driver.manage().window().maximize();
        Thread.sleep(2000);

        WebElement userName = driver.findElement(By.xpath("//*[contains(@type,'email')]"));
        userName.sendKeys("koeluser03@testpro.io");
        WebElement password = driver.findElement(By.xpath("//*[contains(@type,'password')]"));
        password.sendKeys("te$t$tudent");
        WebElement login = driver.findElement(By.xpath("//*[contains(@type,'submit')]"));
        login.click();

        String title = driver.getTitle();
        Assert.assertEquals(title, "Koel");

//        String actualUrl="https://koelapp.testpro.io/#!/profile";
//        String expectedUrl= driver.getCurrentUrl();
//        Assert.assertEquals(expectedUrl,actualUrl);
        Thread.sleep(6000);
        driver.quit();


    }
}

//    @Test
//    public void incorrectLogIn() throws InterruptedException {
//        //Arrange
//        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
//        WebDriver driver = new ChromeDriver();
//
//        driver.get("https://koelapp.testpro.io");
//        Thread.sleep(2000);
//
//        //Act
//        WebElement userName = driver.findElement(By.xpath("//*[contains(@type,'email')]"));
//        userName.sendKeys("1111@gamil.com");
//        WebElement password = driver.findElement(By.xpath("//*[contains(@type,'password')]"));
//        password.sendKeys("111111");
//        WebElement login = driver.findElement(By.xpath("//*[contains(@type,'submit')]"));
//        login.click();
//
//        String error = driver.findElement(By.xpath("//*[contains(@class,'error')]")).getCssValue("border-color: #8e4947");
//        Assert.assertTrue(error.contains("border-color: #8e4947"));
//
////        String actualUrl="https://koelapp.testpro.io/#!/profile";
////        String expectedUrl= driver.getCurrentUrl();
////        Assert.assertEquals(expectedUrl,actualUrl
//        Thread.sleep(6000);
//        driver.quit();
//
//
//
//    }
//
//}
