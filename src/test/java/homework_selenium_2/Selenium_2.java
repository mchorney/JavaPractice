package homework_selenium_2;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class Selenium_2 {
    private WebDriver driver;
    @BeforeMethod
    public void startUp(){
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://automationpractice.com/");
    }
    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }

    @Test
    public void scrollDownAndAddToCart() throws InterruptedException {
        //scroll the main page and click in the bottom Categories->Woman - Assert
        ((JavascriptExecutor) driver)
                .executeScript("window.scrollTo(0, document.body.scrollHeight)");
        Thread.sleep(4000);
        WebElement searchLink = driver.findElement(By.xpath("//*[contains(@title,'You will find here all woman fashion collections')]"));
        searchLink.click();

        List<WebElement> list = driver.findElements(By.xpath("//span[@class='category-name']"));
        Assert.assertEquals(list.size(), 1);

        //open the product1
        var product1 = driver.findElement(By.xpath("(//img[@alt='Faded Short Sleeve T-shirts' and @width='250'])[1]"));
        product1.click();
        Thread.sleep(4000);
        //chose the size
        Select dropdown = new Select(driver.findElement(By.id("group_1")));
        dropdown.selectByVisibleText("L");
        //chose color
        var color = driver.findElement(By.id("color_14"));
        color.click();
        //add to cart
        var addToCart = driver.findElement(By.name("Submit"));
        addToCart.click();
        Thread.sleep(4000);
        //Assert - checking for correct item in cart
        List<WebElement> itemSizeAndColor = driver.findElements(By.xpath("//*[@class='layer_cart_product col-xs-12 col-md-6']//*[text()='Blue, L']"));
        Assert.assertEquals(itemSizeAndColor.size(), 1);
        //click on proceed to checkout
        WebElement proceed = driver.findElement(By.xpath("//span[contains(text(),'Proceed to checkout')]"));
        proceed.click();
        Thread.sleep(4000);
        //trash button
        WebElement trash = driver.findElement(By.xpath("//*[@class='icon-trash']"));
        trash.click();
        //Assert shopping cart is empty
        List<WebElement> isEmpty = driver.findElements(By.xpath("//*[@class='alert alert-warning']"));
        Assert.assertEquals(isEmpty.size(), 1);

    }

}
