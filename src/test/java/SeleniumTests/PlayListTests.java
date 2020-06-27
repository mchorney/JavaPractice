package SeleniumTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageObjects.LoginPage;
import pageObjects.MainPage;
import java.util.concurrent.TimeUnit;

public class PlayListTests {
    WebDriver driver;

    @BeforeMethod
    public void startUp() {
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://koelapp.testpro.io/");
    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }

    @Test
    public void createPlayList_PlayListCreated() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        MainPage mainPage = loginPage.loginToApp("koeluser21@testpro.io", "te$t$tudent");
        Assert.assertTrue(mainPage.isMain());
        String playlistId = mainPage.createPlayList("Playlist7");
        Assert.assertTrue(mainPage.checkPlayList(playlistId));
    }

    @Test
    public void replacePlayList_PlayListCreated() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        MainPage mainPage = loginPage.loginToApp("koeluser21@testpro.io", "te$t$tudent");
        Assert.assertTrue(mainPage.isMain());
        String playlistId = mainPage.createPlayList("Playlist34");
        Assert.assertTrue(mainPage.checkPlayList(playlistId));
        String renamedPlaylistName = mainPage.replacePlayList("Playlist34", "Replaced Playlist34");
        System.out.println(renamedPlaylistName);
        String replacedPlaylistID = "";


        Assert.assertNotEquals(playlistId, replacedPlaylistID);

    }
}

