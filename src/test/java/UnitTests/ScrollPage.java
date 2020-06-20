package UnitTests;

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

public class ScrollPage {
    private WebDriver driver;
    JavascriptExecutor je;

    @BeforeMethod
    public void startDriver() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        je = (JavascriptExecutor) driver;
        driver.get("http://automationpractice.com/index.php");
        Thread.sleep(2000);

    }

    @AfterMethod
    public void endTest() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }

    @Test
    public void scrollPage_toWomen() throws InterruptedException{
        Assert.assertEquals(driver.getCurrentUrl(), "http://automationpractice.com/index.php" );
        WebElement women = driver.findElement(By.xpath("//*[@id='footer']//a[contains(text(), 'Women')]"));
        Assert.assertTrue(women.isDisplayed());

        je.executeScript("arguments[0].scrollIntoView(true);", women);
        women.click();
        Thread.sleep(2000);
        Assert.assertEquals(driver.getCurrentUrl(),"http://automationpractice.com/index.php?id_category=3&controller=category");
    }

    @Test
    public void scrollPage_toCategories(){
        WebElement categories = driver.findElement(By.xpath("//h4[contains(text(), 'Categories')]"));
        je.executeScript("arguments[0].scrollIntoView(true);", categories);
        Assert.assertTrue(categories.isDisplayed());

        List<WebElement> list = driver.findElements(By.xpath("//div[@class='category_footer toggle-footer']//ul[@class='tree dynamized']/li"));
        Assert.assertTrue(list.size()>0 );
        for (WebElement item:list) {
            String itemText = item.getText();
            if (itemText.contains("Women")){
                item.findElement(By.linkText(itemText)).click();
            }
        }
        Assert.assertEquals(driver.getCurrentUrl(),"http://automationpractice.com/index.php?id_category=3&controller=category");

    }
}
