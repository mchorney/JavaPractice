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

        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");

        driver.findElement(By.xpath("(//img[@alt='Blouse' and @width='250'])[1]")).click();
        Thread.sleep(4000);
        var addToCart = driver.findElement(By.name("Submit"));
        addToCart.click();
        Thread.sleep(4000);


    }
}