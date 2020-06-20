package hwFindSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HwTestTryTofindSelector {
    private WebDriver driver;

    @BeforeMethod
    public void startUp() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://automationpractice.com");
    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }

    @Test
    public void testButtonWomen_Click_PageOpened() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://automationpractice.com");
        Thread.sleep(2000);

        JavascriptExecutor page = (JavascriptExecutor)driver;
        page.executeScript("window.scrollBy(0,250)", "button Women");


        WebElement buttonWomen = driver.findElement(By.xpath("(//*[@href=\"http://automationpractice.com/index.php?id_category=3&controller=category\"])[2]"));
        buttonWomen.click();



        Thread.sleep(2000);

        WebElement searchButton = driver.findElement(By.xpath("//*[@placeholder=\"Search\"]"));
        searchButton.click();

        Assert.assertTrue(true);

        Thread.sleep(2000);

    }

}
