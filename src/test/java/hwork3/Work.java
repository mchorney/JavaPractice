package hwork3;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.awt.*;
import java.net.URL;
import java.util.List;

public class Work {

    private WebDriver driver;

    @BeforeMethod
    public void begining() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
    }

    @AfterMethod
    public void ending() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }
    @Test

    public void scroll() throws InterruptedException {
        driver.get("http://automationpractice.com");
        driver.manage().window().maximize();
        Thread.sleep(2000);

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");

        WebElement wm = driver.findElement(By.xpath("//*[contains(@title, 'You will find here')]"));
        wm.click();

        List<WebElement> verf = driver.findElements(By.xpath("//*[@class='navigation_page' and contains(text(),'Women')]"));

        Assert.assertTrue(verf.size()!=0);

    }


}

