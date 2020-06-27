package UnitTests.tests;

import UnitTests.pageObjects.LoginPage;
import UnitTests.pageObjects.MainPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Playlist {
    WebDriver driver;

    @BeforeMethod
    public void startDriver(){
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://koelapp.testpro.io");
    }

    @AfterMethod
    public void endTest(){
        driver.quit();
    }

    @Test
    public void createPlaylist(){
        LoginPage login = new LoginPage(driver);
        MainPage main = login.login("koeluser03@testpro.io", "dGUkdCR0dWRlbnQ=");
        String playlist = main.createPlaylist("RV_Playlist4");
        Assert.assertTrue(main.checkPlaylistByURL(playlist));
    }

    @Test
    public void renamePlaylist(){
        LoginPage login = new LoginPage(driver);
        MainPage main = login.login("koeluser03@testpro.io", "dGUkdCR0dWRlbnQ=");
        String playlist = main.createPlaylist("RV_Playlist4");
        Assert.assertEquals(main.renamePlaylist(playlist, "Test"), "Test");
    }
}
