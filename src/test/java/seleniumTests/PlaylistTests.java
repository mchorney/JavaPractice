package seleniumTests;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageObjects.LoginPage;
import pageObjects.MainPage;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class PlaylistTests {
    WebDriver driver;
    private FluentWait<WebDriver> fluentWait;
    @BeforeMethod
    public void startUp(){
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        fluentWait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(20))
                .pollingEvery(Duration.ofMillis(100))
//                .ignoring(ElementClickInterceptedException.class)
//                .ignoring(StaleElementReferenceException.class)
                .ignoring(NoSuchElementException.class);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://koelapp.testpro.io");

    }
    @AfterMethod
    public void tearDown() throws InterruptedException {
          driver.quit();
    }
    @Test
    public void playlistTests_createPlaylist_PlaylistCreated()throws InterruptedException{
        LoginPage loginPage = new LoginPage(driver,fluentWait);
        MainPage mainPage = loginPage.loginToApp("testpro.user03@testpro.io","te$t$tudent");
        Thread.sleep(1000);
        var id=mainPage.createPlaylist("New");
        System.out.println("My list id="+id);
        Assert.assertTrue(mainPage.checkPlaylist(id));
    }
    @Test
    public void playListTests_renamePlayList() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver,fluentWait);
        MainPage mainPage = loginPage.loginToApp("testpro.user03@testpro.io","te$t$tudent");
        Thread.sleep(1000);
        var id=mainPage.createPlaylist("New");
        mainPage.renamePlaylist(id, "SuperNew");
        mainPage.checkPlaylistName(id,"SuperNew");
    }

}
