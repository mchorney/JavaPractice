package hw4;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class App {

    private WebDriver driver;

    @BeforeMethod
    public void first() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window();
    }
    @AfterMethod
    public void third() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }
    @Test
    public void secend() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        driver.get("http://automationpractice.com/index.php");
        driver.findElement(By.linkText("Women")).click();
        Thread.sleep(2000);
        String categoryName = driver.findElement(By.xpath("//span[@class='category-name']")).getText();
        Assert.assertEquals(categoryName, "Women");
    }
}