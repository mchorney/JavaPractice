package homework;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import sun.awt.windows.ThemeReader;

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
        Thread.sleep(3000);
        driver.quit();
    }

    @Test
     public void scrollDownAndClick() throws InterruptedException{
        //Scenario 1: To scroll down the web page by the visibility of the element
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement element = driver.findElement(By.className("icon-envelope-alt"));
        js.executeScript("arguments[0].scrollIntoView();", element);
        Thread.sleep(1000);
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
    @Test
    public void addDressFromBestSellersToCartAndCheckOut() throws InterruptedException{
        Thread.sleep(2000);
        WebElement bestSellers = driver.findElement(By.className("blockbestsellers"));
        // scrolling down to access the second row of dresses
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement element = driver.findElement(By.xpath("//*[@class=\"ajax_block_product col-xs-12 col-sm-4 col-md-3 last-item-of-mobile-line\"]"));
        js.executeScript("arguments[0].scrollIntoView();", element);
        // mouse hover on the last dress element:
        Actions builder = new Actions(driver);
        WebElement lastDresseElement = driver.findElement(By.xpath("//*[@title=\"Printed Chiffon Dress\"]"));
        Thread.sleep(4000);
        builder.moveToElement(lastDresseElement).build().perform();
        Thread.sleep(3000);
       // WebElement addButton = driver.findElement()
        //Assert.assertTrue();
        // Click on Add Button





    }
}

