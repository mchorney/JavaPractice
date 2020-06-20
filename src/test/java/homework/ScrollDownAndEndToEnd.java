package homework;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class ScrollDownAndEndToEnd {
    private WebDriver driver;
    @BeforeMethod
    public void startUp(){
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        driver = new ChromeDriver();
        driver.get("http://automationpractice.com/");
    }
    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }

    @Test
     public void scrollDownAndClick(){
        //Scenario 1: To scroll down the web page by the visibility of the element
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement element = driver.findElement(By.className("icon-envelope-alt"));
        js.executeScript("arguments[0].scrollIntoView();", element);
        List<WebElement> elements = driver.findElements(By.className("icon-envelope-alt"));
        Assert.assertTrue(elements.size() == 1);
//        Assert.assertTrue(elements.size() > 0);
//        Assert.assertTrue(element.isDisplayed());

        //Scenario 2: To scroll down the web page by pixel.

//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        WebElement element = driver.findElement(By.className("icon-envelope-alt"));
//        js.executeScript("window.scrollBy(0,2000)");
//        List<WebElement> elements = driver.findElements(By.className("icon-envelope-alt"));
//        Assert.assertTrue(elements.size() == 1);
    }
}

