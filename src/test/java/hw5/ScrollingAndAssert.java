package hw5;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ScrollingAndAssert {
    private WebDriver driver;

    @BeforeMethod
    public void startUp() {
        //Arrange
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();

    }

    @Test
    void scrollingOnWeb() throws InterruptedException {
        //Act
        driver.get("http://automationpractice.com/");
        ((JavascriptExecutor) driver)
                .executeScript("window.scrollTo(0, document.body.scrollHeight)");
        WebElement womenLink = driver.findElement(By.xpath("(//*[@href=\"http://automationpractice.com/index.php?id_category=3&controller=category\"])[2]"));
        womenLink.click();

        //Assert
        Thread.sleep(2000);
        String categoryName = driver.findElement(By.xpath("//span[@class=\"navigation_page\" and contains(text(),'Women')]")).getText();
        Assert.assertEquals(categoryName, "Women");

    }
    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }


}

