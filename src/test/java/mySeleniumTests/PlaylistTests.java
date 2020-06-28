package mySeleniumTests;

import myPageObjects.LoginPageMy;
import myPageObjects.MainPageMy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import java.util.concurrent.TimeUnit;

public class PlaylistTests {
    WebDriver driver;
    @BeforeMethod
    public void startUp(){
        System.setProperty("webdriver.chrome.driver", "chromedriver");
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
    public void playlistTests_createPlaylist_PlaylistCreated() {
        LoginPageMy loginPage = new LoginPageMy(driver);
        MainPageMy mainPage = loginPage.loginToApp("testpro.user03@testpro.io","te$t$tudent");
        mainPage.createPlaylist("Ha-Ha");
        mainPage.checkPlaylist("Ha-Ha");
//        Assert.assertTrue(mainPage.checkPlaylist("Ha-Ha"));
    }
}
