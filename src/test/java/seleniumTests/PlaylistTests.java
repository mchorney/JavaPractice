package seleniumTests;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageObjects.LogInPage;
import pageObjects.MainPage;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class PlaylistTests {

        private WebDriver driver;
        private FluentWait<WebDriver> fluentWait;
        //private String playlistId;

        @BeforeMethod
        public void startUp(){
            System.setProperty("webdriver.chrome.driver", "chromedriver");
            driver = new ChromeDriver();
            driver.get("https://koelapp.testpro.io");
            driver.manage().window().maximize();
        }
        @AfterMethod
        public void tearDown(){
            driver.quit();
        }

        @Test
        public void playlistTests_createPlaylist_playlistCreated(){
            LogInPage logInPage = new LogInPage(driver);
            MainPage mainPage = logInPage.logInToApp("testpro.user03@testpro.io","te$t$tudent");
            var playlistId = mainPage.createPlaylist("Playlist TEST");
            Assert.assertTrue(mainPage.checkByUrl(playlistId));
        }

        @Test
        public void playlistTests_renamePlaylist_playlistRenamed(){
            LogInPage logInPage = new LogInPage(driver);
            MainPage mainPage = logInPage.logInToApp("testpro.user03@testpro.io","te$t$tudent");
            mainPage.renamePlaylist("Playlist TEST","Renamed Playlist");
            Assert.assertTrue(mainPage.checkNewName("Renamed Playlist"));
        }


    }


