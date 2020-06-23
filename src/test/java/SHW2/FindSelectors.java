package SHW2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class FindSelectors {
    private WebDriver driver;

    @BeforeMethod
    public void startUp() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://automationpractice.com/");
    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(6000);
        driver.quit();
    }

    @Test
    public void searchDress() throws InterruptedException {
        var searchDressButton = driver.findElement(By.xpath(".//div[@id='block_top_menu']/ul/li[2]/a"));
        searchDressButton.click();
        List<WebElement> list = driver.findElements(By.xpath("//div[@class='content_scene_cat_bg']"));
        Assert.assertTrue(list.size() == 0);
        Thread.sleep(3000);

        var searchCasualDresses = driver.findElement(By.xpath(".//div[@id='categories_block_left']/div/ul/li/a"));
        searchCasualDresses.click();
        Thread.sleep(4000);

        String url = driver.getCurrentUrl();
        Assert.assertTrue(url.equals("http://automationpractice.com/index.php?id_category=9&controller=category"));

        var serchChekboxS = driver.findElement(By.xpath("//*[@id='layered_id_attribute_group_1']"));
        serchChekboxS.click();

        var serchChekboxM = driver.findElement(By.xpath("//*[@id='layered_id_attribute_group_2']"));
        serchChekboxM.click();

        var serchChekboxL = driver.findElement(By.id("layered_id_attribute_group_3"));
        serchChekboxL.click();

        var searcAddtocart = driver.findElement(By.xpath("//*[@title='Add to cart']"));
        searcAddtocart.click();
        Thread.sleep(2000);
        List<WebElement> shoppingCart = driver.findElements(By.id("cart_title"));
        Assert.assertTrue(shoppingCart.size() == 0);

        var proceedToCheackout = driver.findElement(By.xpath("//*[@title='Proceed to checkout']"));
        proceedToCheackout.click();
        Thread.sleep(3000);

        var proccedToCheackoutCart = driver.findElement(By.xpath("//p[@class='cart_navigation clearfix']/a[1]"));
        proccedToCheackoutCart.click();
        Thread.sleep(3000);

        try {
            var authentication = driver.findElement(By.xpath("//h1[@class='page-heading' and text()='Authentication']"));
            Assert.assertTrue(authentication.isDisplayed());
        } catch (Exception e) {
            Assert.fail("Page is not displayed!");
        }
    }

}



