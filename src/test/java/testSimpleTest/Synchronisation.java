package testSimpleTest;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Synchronisation {
    private WebDriver driver;
    private WebDriverWait wait;
    private FluentWait<WebDriver> fluentWait;

    @BeforeMethod
    public void startUp() {
        driver = new ChromeDriver();
        driver.get("https://koelapp.testpro.io/#!/home");
        wait = new WebDriverWait(driver,20);
        fluentWait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(20))
                .pollingEvery(Duration.ofMillis(100))
//                .ignoring(ElementClickInterceptedException.class)
//                .ignoring(StaleElementReferenceException.class)
                .ignoring(NoSuchElementException.class);

    }
    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void loginToKoelappSuccess() {

        //driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        By emailBy = By.xpath("//*[@type='email']");
        fluentWait.until(x->x.findElement(emailBy));

        WebElement emailAddress = driver.findElement(emailBy);
        emailAddress.sendKeys("koeluser03@testpro.io");
        WebElement password = driver.findElement(By.xpath("//*[@type='password']"));
        password.sendKeys("te$t$tudent");
        WebElement loginButton = driver.findElement(By.xpath("//*[contains(text(), 'Log In')]"));
        loginButton.click();
        String title = driver.getTitle();
        Assert.assertEquals(title, "Koel");
        System.out.println("Test is passed");
    }
    @Test
    public void loginToKoelappUnSuccessful() throws InterruptedException {

        By emailBy = By.xpath("//*[@type='email']");
        By passwordBy = By.xpath("//*[@type='password']");
        By clickBy = By.xpath("//*[contains(text(), 'Log In')]");
        By formBy = By.xpath("//form[@data-v-e0457900]");
        By errorBy = By.xpath("//*[@class='error']");

        //wait.until(ExpectedConditions.elementToBeClickable(clickBy));
        fluentWait.until(x->x.findElement(formBy));
        //driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        //Thread.sleep(3000);

        String loginFormFrame = driver.findElement(formBy).getAttribute("class");
        System.out.println(loginFormFrame + "First appearance.");

        driver.findElement(emailBy).sendKeys("koeluser03@testpro.io");
        driver.findElement(passwordBy).sendKeys("qwerty");
        driver.findElement(clickBy).click();

        //wait.until(ExpectedConditions.visibilityOfElementLocated(errorBy));
        fluentWait.until(x->x.findElement(errorBy));
        //driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        //Thread.sleep(3000);

        fluentWait.until(x->x.findElement(formBy).getAttribute("class"));
        String loginFormFrameRed = driver.findElement(formBy).getAttribute("class");
        System.out.println(loginFormFrameRed + "Second appearance.");

//        List<WebElement> listOfErrors = new ArrayList<>();
//        listOfErrors = driver.findElements(formBy);
//        Assert.assertEquals(listOfErrors.size(), 1);

        Assert.assertNotEquals(loginFormFrame, loginFormFrameRed);

        System.out.println("Test is passed");
    }
}
