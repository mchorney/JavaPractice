package Koelapp;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class scroll {

    private WebDriver driver;
    @BeforeMethod
    public void strartUp() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void bottomWomen() throws InterruptedException {
        //Arrange
        JavascriptExecutor js = (JavascriptExecutor) driver;
        //Act
        driver.get("http://automationpractice.com/index.php");
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        driver.findElement(By.linkText("Women")).click();
        //Assert
        Thread.sleep(2000);
        String categoryName = driver.findElement(By.xpath("//span[@class='category-name']")).getText();
        String catName = driver.findElement(By.className("cat-name")).getText();
        String titleBlock = driver.findElement(By.className("title_block")).getText();

        Assert.assertEquals(categoryName, "Women");
        Assert.assertEquals(catName, "WOMEN ");
        Assert.assertEquals(categoryName, "Women");

    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }
}
