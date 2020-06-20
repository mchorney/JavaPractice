package homework;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.JavascriptExecutor;


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
        Thread.sleep(1000);
        builder.moveToElement(lastDresseElement).build().perform();
        Thread.sleep(3000);
        // Click on Add Button - не получается. Эта кнопка, видимо, вызывается with JS event
//        WebElement addButton = driver.findElement(By.xpath("//*[@title=\"Add to cart\"]"));
//        ((JavascriptExecutor) driver).
//                executeScript(String.valueOf(js), addButton);
//        addButton.click(); // не работает

//        new WebDriverWait(driver, 20).until(ExpectedConditions.
//        elementToBeClickable(By.xpath("//*[@title=\"Add to cart\"]"))).click(); // не работает
        //org.openqa.selenium.ElementClickInterceptedException: element click intercepted:
        // Element <a class="button ajax_add_to_cart_button btn btn-default"
        // href="http://automationpractice.com/index.php?controller=cart&amp;add=1&amp;id_product=1&amp;token=e817bb0705dd58da8db074c69f729fd8"
        // rel="nofollow" title="Add to cart" data-id-product="1">...</a>
        // is not clickable at point (60, 22).
//
//        WebDriverWait wait2 = new WebDriverWait(driver, 10);
//        wait2.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@title=\"Add to cart\"]")));
//        driver.findElement(By.xpath("//*[@title=\"Add to cart\"]")).click(); // org.openqa.selenium.ElementNotInteractableException:
//        element not interactable

        // Click on Add button!!!!
        WebElement ele = driver.findElement(By.xpath("//*[@title=\"Add to cart\"]"));
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", ele);
        Thread.sleep(4000);







    }
}

