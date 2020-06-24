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
    public void startUp() throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("http://automationpractice.com/");
        Thread.sleep(3000);


    }
    @AfterMethod
    public void tearDown() {
        System.out.println("Test is passed");
        driver.quit();
    }

    @Test
    public void maximiseAndClick() throws InterruptedException {

        driver.manage().window().maximize();
        driver.findElement(By.xpath("//li[@class='last']/*[contains(text(), 'Women')]")).click();
        Thread.sleep(3000);
        boolean assertion = driver.findElement(By.xpath("//*[@class='category-name']")).isDisplayed();
        Assert.assertTrue(assertion);
    }

    @Test
    public void scrollAndClick() throws InterruptedException {

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", driver.findElement(By.xpath("//*[contains(@title, 'wardrobe and')]")));
        Thread.sleep(10000);
        driver.findElement(By.xpath("//*[contains(@title, 'wardrobe and')]")).click();
        Assert.assertTrue(driver.findElement(By.xpath("//*[@class='category-name']")).isDisplayed());
    }
}
