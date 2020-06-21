package koeltesting;

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

public class HW2 {
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
    public void searchForWomenClothes() throws InterruptedException {
        ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight)");
        WebElement womenButton = driver.findElement(By.xpath("(//*[contains(@href,\"id_category=3&controller\")])[2]"));
        womenButton.click();
        Thread.sleep(5000);

        List<WebElement> list = driver.findElements(By.xpath("//*[@class=\"cat_desc\"]"));
        Assert.assertFalse(list.size()==0);
    }
    @Test
    public void searchForADress() throws InterruptedException {
        var dressButton = driver.findElement(By.xpath("(//*[@title='Dresses'])[2]"));
        dressButton.click();
        Thread.sleep(5000);
        var casualDressButton = driver.findElement(By.xpath("(//*[contains(@title,\"You are looking for a dress for every day?\")])"));
        casualDressButton.click();
        var s = driver.findElement(By.name("layered_id_attribute_group_1"));
        s.click();
        var m = driver.findElement(By.xpath("//*[@name=\"layered_id_attribute_group_2\"]"));
        m.click();
        var l = driver.findElement(By.id("layered_id_attribute_group_3"));
        l.click();
        var addToCartButton = driver.findElement(By.xpath("//*[contains(text(),\"Add to cart\")]"));
        addToCartButton.click();

        List<WebElement> list = driver.findElements(By.xpath("//*[contains(text(),\"added\")]"));
        Assert.assertFalse(list.size()==0);
    }
}
