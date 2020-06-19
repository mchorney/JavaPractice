package hw;

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

public class ScrollDown {

    private WebDriver driver;

    @BeforeMethod
    public void startUp() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        this.driver = new ChromeDriver();
        driver.get("http://automationpractice.com/");
        Thread.sleep(2000);
    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }

    @Test
    public void selectWomanCategory() throws InterruptedException {
        By womenTitleElement = By.xpath("//*[@class='cat-name' and contains(text(),'Women')]");
        By linksElements = By.xpath("//a[@href='http://automationpractice.com/index.php?id_category=3&controller=category']");

        List<WebElement> links = driver.findElements(linksElements);
        WebElement womenCategory = links.get(1);

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");

        womenCategory.click();
        Thread.sleep(2000);
        WebElement womenTitle = driver.findElement(womenTitleElement);
        Assert.assertTrue(womenTitle.isDisplayed());
    }

}
