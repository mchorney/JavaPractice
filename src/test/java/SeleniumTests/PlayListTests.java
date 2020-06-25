package SeleniumTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageObjects.LoginPage;
import pageObjects.MainPage;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjects.MainPageSelectors;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

public class PlayListTests {
    WebDriver driver;
    private WebDriverWait wait;
    private FluentWait<WebDriver> fluentWait;


    @BeforeMethod
    public void startUp(){
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://koelapp.testpro.io/");
        fluentWait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(20))
                .pollingEvery(Duration.ofMillis(100))
//                .ignoring(ElementClickInterceptedException.class)
//                .ignoring(StaleElementReferenceException.class)
                .ignoring(NoSuchElementException.class);
    }
    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(8000);
        driver.quit();
    }
    @Test
    public void createPlayList_PlayListCreated() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        MainPage mainPage = loginPage.loginToApp("koeluser21@testpro.io", "te$t$tudent");
        Assert.assertTrue(mainPage.isMain());
        Thread.sleep(3000);
        //fluentWait.until(x->x.findElement(By.xpath(MainPageSelectors.plusButtonPlayListCreation)));
        //fluentWait.until(x->x.findElement(By.xpath(MainPageSelectors.playListNameTextField)));
        mainPage.createPlayList("Playlist1");



    }

    // LoginToApp
    // mainPage.createPlaylist



}
