package homework_selenium_4;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
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
import java.util.List;
import java.util.concurrent.TimeUnit;

public class PlayList {
    WebDriver driver;
    private WebDriverWait wait;
    private FluentWait<WebDriver> fluentWait;

    @BeforeMethod
    public void startUp(){
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

        driver.get("https://koelapp.testpro.io");
    }
    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }

    @Test
    public void createPlayList() throws InterruptedException {

        LoginPage loginPage = new LoginPage(driver);
        MainPage mainPage = loginPage.loginToApp("testpro.user03@testpro.io","te$t$tudent");
        Thread.sleep(5000);
        mainPage.createPlaylist("qwerty");
        Assert.assertTrue(mainPage.checkPlaylist("qwerty"));

    }
}
