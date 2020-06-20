package S5_hw;

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

public class Automation_Practice_Scroll {
    private WebDriver driver;

    @BeforeMethod
    public void startUp() {
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        driver = new ChromeDriver();
        driver.get("http://automationpractice.com/");
    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }

    @Test
    public void homePageScroolDown() {
        ((JavascriptExecutor) driver)
                .executeScript("window.scrollTo(0, document.body.scrollHeight)");
        WebElement categoriesWomen = driver.findElement(By.xpath("//*[@id=\"footer\"]/div/section[2]/div/div/ul/li/a"));
        categoriesWomen.click();


        String categoryName = driver.findElement(By.xpath("(//*[@title='Women'])[1]")).getText();
        Assert.assertEquals(categoryName, "WOMEN");

    }
}

