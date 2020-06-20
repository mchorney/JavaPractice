package hw22;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ScrollDownPage {
    private WebDriver driver;

    @BeforeMethod
    public void startUp() {
        driver = new ChromeDriver();
    }
    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }

    @Test
    public void maximiseAndClick() throws InterruptedException {

        driver.get("http://automationpractice.com/");
        Thread.sleep(3000);
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[contains(@title, 'wardrobe and')]")).click();
        Thread.sleep(3000);
        boolean assertion = driver.findElement(By.xpath("//*[@class='category-name']")).isDisplayed();
        Assert.assertTrue(assertion);
        Thread.sleep(3000);
        System.out.println("Test is passed");
    }

    @Test
    public void scrollAndClick() throws InterruptedException {

        driver.get("http://automationpractice.com/");
        Thread.sleep(3000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", driver.findElement(By.xpath("//*[contains(@title, 'wardrobe and')]")));
        Thread.sleep(10000);
        driver.findElement(By.xpath("//*[contains(@title, 'wardrobe and')]")).click();
        Assert.assertTrue(driver.findElement(By.xpath("//*[@class='category-name']")).isDisplayed());
        Thread.sleep(3000);
        System.out.println("Test is passed");
    }
}
