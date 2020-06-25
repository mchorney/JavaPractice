package seleniumTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageObjects.LoginPage;
import pageObjects.MainPage;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

public class PlaylistTest {
    WebDriver driver;
    private FluentWait<WebDriver> fluentWait;
    @BeforeMethod
    void startUp(){
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        driver = new ChromeDriver();
        fluentWait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(20))
                .pollingEvery(Duration.ofMillis(100))
//                .ignoring(ElementClickInterceptedException.class)
//                .ignoring(StaleElementReferenceException.class)
                .ignoring(NoSuchElementException.class);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://koelapp.testpro.io/");
    }
    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }
    @Test
    public void playlistTest_createplaylist() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        MainPage mainPage = loginPage.loginToApp("testpro.user03@testpro.io", "te$t$tudent");
        Assert.assertTrue(loginPage.isError());
        String plusX = "//*[@class='fa fa-plus-circle control create']";
        By plusBy = By.xpath(plusX);
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='fa fa-plus-circle control create']")));
        mainPage.createPlayList("newlist1");
        Assert.assertTrue(mainPage.checkPlaylist("newlist1"));

    }
}
