package SHW2;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class ScrollingDown {
    @Test
    public void scrollDown() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.navigate().to("http://automationpractice.com");
         //to perform scroll on an application using Selenium
        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        driver.findElement(By.linkText("Women")).click();

        Thread.sleep(2000);

        var searchButtonWomen =driver.findElement(By.xpath("//*[@class='last']/*[contains(text(),'Women')]"));
        searchButtonWomen.click();

        String url = driver.getCurrentUrl();
        Assert.assertTrue(url.equals("http://automationpractice.com/index.php?id_category=3&controller=category"));


        Thread.sleep(3000);
        driver.quit();
    }

}
