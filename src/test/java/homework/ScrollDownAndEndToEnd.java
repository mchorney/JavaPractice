package homework;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.JavascriptExecutor;
import java.util.List;
import static org.testng.Assert.*;

public class ScrollDownAndEndToEnd {
    private WebDriver driver;
    @BeforeMethod
    public void startUp() {
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        driver = new ChromeDriver();
        driver.get("http://automationpractice.com/");
        driver.manage().window().maximize();
    }
    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }
    @Test
    public void scrollDownAndClick() throws InterruptedException {
        //Scenario 1: To scroll down the web page by the visibility of the element
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement element = driver.findElement(By.className("icon-envelope-alt"));
        js.executeScript("arguments[0].scrollIntoView();", element);
        Thread.sleep(1000);
        List<WebElement> elements = driver.findElements(By.className("icon-envelope-alt"));
        Assert.assertTrue(element.isDisplayed());
        Assert.assertFalse(elements.size()== 0);
//        Assert.assertTrue(elements.size() > 0);
        // Scenario 2: To scroll down the web page by pixel.
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        WebElement element = driver.findElement(By.className("icon-envelope-alt"));
//        js.executeScript("window.scrollBy(0,2000)");
//        List<WebElement> elements = driver.findElements(By.className("icon-envelope-alt"));
//        Assert.assertTrue(elements.size() == 1);
    }
    @Test
    public void addDressFromBestSellersToCartAndCheckOut() throws InterruptedException {
        Thread.sleep(2000);
        WebElement bestSellers = driver.findElement(By.className("blockbestsellers"));
        bestSellers.click();
//      Scrolling down to access the second row of dresses
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement element = driver.findElement(By.xpath("(//*[@class=\"replace-2x img-responsive\"])[14]"));
        js.executeScript("arguments[0].scrollIntoView();", element);
        Thread.sleep(2000);
//      Mouse hover on the last dress element:
        Actions builder = new Actions(driver);
        WebElement lastDresseElement = driver.findElement(By.xpath("(//*[@class=\"replace-2x img-responsive\"])[14]"));
        Thread.sleep(1000);
        builder.moveToElement(lastDresseElement).build().perform();
        Thread.sleep(3000);
//      Click on Add button!!!!
        WebElement addDress = driver.findElement(By.xpath("(//span[text()=\"Quick view\"])[14]"));
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", addDress);
        Thread.sleep(4000);
//      Finding iframe and clickng on quantity, size ,  add to cart,
        WebElement frame = driver.findElement(By.className("fancybox-iframe"));
        driver.switchTo().frame(frame);
        WebElement plus = driver.findElement(By.xpath("//*[@class='icon-plus']"));
        plus.click();
        Select dropdown = new Select(driver.findElement(By.id("group_1")));
        dropdown.selectByVisibleText("M");
        WebElement addToCart = driver.findElement(By.name("Submit"));
        addToCart.click();
        Thread.sleep(3000);
        WebElement checkoutButton = driver.findElement(By.xpath("//*[contains(text(), 'Proceed to checkout')]"));
        checkoutButton.click();
        WebElement summary = driver.findElement(By.xpath("//*[contains(text(), 'Summary')]"));
        String actual_summary = summary.getText();
        System.out.println(actual_summary);
        Assert.assertEquals(actual_summary, "01. Summary");
    }
}

