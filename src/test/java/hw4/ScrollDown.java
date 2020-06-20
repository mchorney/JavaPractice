package hw4;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class ScrollDown {
    private WebDriver driver;
    @BeforeMethod
    public void startUp(){
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
    public void searchForADress() throws InterruptedException {
        ((JavascriptExecutor) driver)
                .executeScript("window.scrollTo(0, document.body.scrollHeight)");
        var womenButton=driver.findElement(By.xpath("//*[contains(@title,'You will find here all woman fashion collections')]"));
        womenButton.click();
        Thread.sleep(4000);

        List<WebElement> list=driver.findElements(By.xpath("//*[contains(@title,'women')]"));
        Assert.assertEquals(list.size(),1);

    }
}
