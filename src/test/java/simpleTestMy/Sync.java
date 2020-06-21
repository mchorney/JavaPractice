package simpleTestMy;

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

public class Sync {
    private WebDriver driver;
    private WebDriverWait wait;
    private FluentWait<WebDriver> fluentWait;

    @BeforeMethod
    public void startUp(){
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        driver = new ChromeDriver();
       // driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); //waits 0.5 seconds for every element
       // wait = new WebDriverWait(driver,20);
        fluentWait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(20))
                .pollingEvery(Duration.ofMillis(100))
//                .ignoring(ElementClickInterceptedException.class)
//                .ignoring(StaleElementReferenceException.class)
                .ignoring(NoSuchElementException.class);
    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
    @Test
    public void logInToApp(){
        driver.get("https://koelapp.testpro.io");

        By emailBy = By.xpath("//*[@type=\"email\"]");

        //wait.until(ExpectedConditions.elementToBeClickable(emailBy));
        fluentWait.until(x->x.findElement(emailBy));

        WebElement login = driver.findElement(emailBy);
        WebElement password = driver.findElement(By.xpath("//*[@type=\"password\"]"));
        WebElement logInButton = driver.findElement(By.xpath("//*[@type=\"submit\"]"));

        login.click();
        login.sendKeys("testpro.user03@testpro.io");

        password.click();
        password.sendKeys("te$t$tudent");

        logInButton.click();

        By signOutControl = By.xpath("//*[@class =\"fa fa-sign-out control\"]");

        //wait.until(ExpectedConditions.visibilityOfElementLocated(signOutControl));
        fluentWait.until(x->x.findElement(signOutControl));
        var signOutButton = driver.findElement(signOutControl);

        Assert.assertEquals(true,signOutButton.isDisplayed());
    }
}
