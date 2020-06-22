import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class hw3scroll {

    private WebDriver driver;

    @BeforeMethod
    public void startUp() {
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
    public void scrollDown () throws InterruptedException {

        ((JavascriptExecutor) driver)
                .executeScript("window.scrollTo(0, document.body.scrollHeight)");


//        var women = driver.findElement(By.xpath("//*[@class = 'selected' and @title]"));
        var women = driver.findElement(By.xpath("//*[@href = 'http://automationpractice.com/index.php?id_category=3&controller=category']"));

        women.click();
        String title = driver.getTitle();
        Assert.assertEquals(title, "Women - My Store");













    }
}
