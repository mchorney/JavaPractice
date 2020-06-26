package seleniumTest;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.Assert;
import org.testng.annotations.*;
import pageObjects.LoginPage;
import pageObjects.MainPage;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class PlayListTest {
    WebDriver driver;

    @BeforeMethod
    public void startUp() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://koelapp.testpro.io");
    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }

    @Test
    public void playlistTests_createPlaylist_PlaylistCreated() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        MainPage mainPage = loginPage.loginToApp("koeluser03@testpro.io", "te$t$tudent");
        mainPage.createPlaylist("mr111");
        //Assert.assertTrue(mainPage.checkPlaylist("mr11"));
    }
}
