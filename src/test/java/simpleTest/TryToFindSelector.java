package simpleTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class TryToFindSelector {
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
    public void searchForADress(){
        WebElement searchBox = driver.findElement(By.name("search_query"));
        searchBox.sendKeys("dress");
        WebElement searchButton = driver.findElement(By.name("submit_search"));
        searchButton.click();

        List<WebElement> list = driver.findElements(By.xpath("//*[@class='lighter' and contains(text(),'dress')]"));
        Assert.assertTrue(list.size()==1);
    }

//    @Test
//    public void clickOnSecondSlider() throws InterruptedException {
//        var product = driver.findElement(By.xpath("(//img[@alt='Faded Short Sleeve T-shirts' and @width='250'])[1]"));
//        product.click();
//        Thread.sleep(4000);
//        var element = driver.findElement(By.xpath("//iframe[contains(@id,'fancybox-frame')]"));
//        driver.switchTo().frame(element);
//        var plus = driver.findElement(By.xpath("//*[@class='icon-plus']"));
//        plus.click();
//        Select dropdown = new Select(driver.findElement(By.id("group_1")));
//        dropdown.selectByVisibleText("M");
//        var addToCart = driver.findElement(By.name("Submit"));
//        addToCart.click();



//    }
}

