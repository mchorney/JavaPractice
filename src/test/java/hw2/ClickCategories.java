package hw2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ClickCategories {
    private WebDriver driver;

    @BeforeMethod
    public void startUp() {
        System.setProperty("webriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");
    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }

    @Test
    public void clickCategories() throws InterruptedException {
        WebElement search = driver.findElement(By.xpath("//li[@class=\"last\"]/a[contains(text(), \"Women\")]"));
        search.click();

        Thread.sleep(5000);
        WebElement check = driver.findElement(By.xpath("//span[@class=\"category-name\"]"));
        Assert.assertTrue(check.isEnabled());
    }
}
