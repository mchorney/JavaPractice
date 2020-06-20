package simpleTestMy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class TryFindSelector {
    private WebDriver driver;
    @BeforeMethod
    public void startUp(){
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void tearDown() throws InterruptedException{
        Thread.sleep(2000);
        driver.quit();
    }

    @Test
    public void testOne() throws InterruptedException{
        Thread.sleep(3000);
        WebElement searchField = driver.findElement(By.xpath("//*[@placeholder=\"Search\"]"));

        searchField.click();
        searchField.sendKeys("dress");
        WebElement submitButton = driver.findElement(By.name("submit_search"));
        submitButton.click();


        List<WebElement> list = driver.findElements(By.xpath("//*[@class='lighter' and contains(text(),'dress')]"));
        Assert.assertTrue(list.size()==1);
    }

    @Test
    public  void clickOnSecondSlider() throws InterruptedException{
        var nextButton = driver.findElement(By.xpath("//*[@class='bx-next']"));
        var shopNow3 = driver.findElement(By.xpath("(//*[text()='Shop now !'])[3]"));
        nextButton.click();
        Thread.sleep(3000);
        shopNow3.click();

    }
    @Test
    public void test() throws InterruptedException{
        var product = driver.findElement(By.xpath("(//img[@alt = 'Faded Short Sleeve T-shirts' and @width='250'])[1]"));
        product.click();
        Thread.sleep(2000);
        var element = driver.findElement(By.xpath("//iframe[contains(@id,'fancybox-frame')]"));
        driver.switchTo().frame(element);
        var plus = driver.findElement(By.xpath("//*[@class='icon-plus']"));
        plus.click();
        var dropdown = driver.findElement(By.id("uniform-group_1"));
        dropdown.click();
        var sizeM = driver.findElement(By.xpath("//*[@value = '2']"));
        sizeM.click();

    }

}
