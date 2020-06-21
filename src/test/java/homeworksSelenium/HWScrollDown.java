package homeworksSelenium;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.*;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.List;

public class HWScrollDown {
    private WebDriver driver;

    @BeforeMethod
    public void startUp(){
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");
        driver.manage().window().maximize();
    }
    @AfterMethod
    public void end() throws InterruptedException{
        Thread.sleep(2000);
        driver.quit();
    }
    @Test
    public void scrollToTheBottom(){

        var js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        var categoriesWoman = driver.findElement(By.cssSelector("[title~='woman']"));
        categoriesWoman.click();
        List<WebElement> navigationPage = driver.findElements(By.className("navigation_page"));
        Assert.assertTrue(navigationPage.size()==1);

    }

    @Test
    public void scrollToTheElement(){

        var js = (JavascriptExecutor) driver;
        var categoriesWoman = driver.findElement(By.cssSelector("[title~='woman']"));
        js.executeScript("arguments[0].scrollIntoView();", categoriesWoman);
        categoriesWoman.click();
        var navigationPage = driver.findElement(By.className("navigation_page"));
        Assert.assertEquals(true, navigationPage.isDisplayed());

    }

    @Test
    public void scrollByPixel() {
        var js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)");
    }

    @Test
    public void addToCart_and_checkOut() throws InterruptedException {
        var js = (JavascriptExecutor) driver;
        var popularItems = driver.findElement(By.xpath("//*[@id='center_column']"));
        js.executeScript("arguments[0].scrollIntoView();", popularItems);
        var blouse = driver.findElement(By.xpath("//*[contains(@class,'last-item-of-mobile-line')]")); //span[contains(text(),'More')]"));

        blouse.click();
        var blouseMoreButton = driver.findElement(By.xpath("//*[contains(@class,'last-item-of-mobile-line')]//span[contains(text(),'More')]"));
        blouseMoreButton.click();
        var plusButton = driver.findElement(By.className("icon-plus"));
        plusButton.click();
        Thread.sleep(3000);
        var chooseSize = driver.findElement(By.className("selector"));
        chooseSize.click();
        Thread.sleep(3000);
     //                  |I DONT'T KNOW WHY BUT MY WAY OF CHOOSING THE SIZE IS NOT WORKING|
        Actions action = new Actions(driver); //_______________________
        action.sendKeys(Keys.ARROW_DOWN);//     | THIS IS NOT WORKING |
        action.sendKeys(Keys.ENTER);//          -----------------------

        var whiteColor = driver.findElement(By.cssSelector("[title='White']"));
        whiteColor.click();

        var addToCart = driver.findElement(By.xpath("//button[@name='Submit']//span"));
        addToCart.click();

        Thread.sleep(5000);

        var checkOutButton = driver.findElement(By.xpath("//*[@title='Proceed to checkout']//span"));
        checkOutButton.click();

        Thread.sleep(2000);

        var proceedToCheckOut = driver.findElement(By.xpath("//*[@class='button btn btn-default standard-checkout button-medium']//span"));
        js.executeScript("arguments[0].scrollIntoView();", proceedToCheckOut);
        proceedToCheckOut.click();

        Thread.sleep(2000);

        var signIn = driver.findElement(By.xpath("//*[@id='SubmitLogin']//span"));
        js.executeScript("arguments[0].scrollIntoView();", signIn);

//     I CREATED THE ACCOUNT BEFORE TESTING THE CHECK OUT FUNCTIONALITY

        var email = driver.findElement(By.id("email"));
        email.click();
        email.sendKeys("test555@tet.test");

        var password = driver.findElement(By.id("passwd"));
        password.click();
        password.sendKeys("testpassword");

        signIn.click();

        var proceedAddress = driver.findElement(By.xpath("//*[@name='processAddress']//span"));
        js.executeScript("arguments[0].scrollIntoView();",proceedAddress);
        proceedAddress.click();

        var shipping = driver.findElement(By.xpath("//*[@name='processCarrier']//span"));
        js.executeScript("arguments[0].scrollIntoView();",shipping);

        var checkbox = driver.findElement(By.cssSelector("[type = 'checkbox']"));
        checkbox.click();
        shipping.click();

        var payment = driver.findElement(By.className("bankwire"));
        payment.click();

        var confirm = driver.findElement(By.xpath("(//*[@type='submit'])[2]"));
        js.executeScript("arguments[0].scrollIntoView();",confirm);
        confirm.click();

    }

}
