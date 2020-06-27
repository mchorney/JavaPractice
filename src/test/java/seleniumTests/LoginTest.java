package seleniumTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageObjects.LoginPage;
import pageObjects.MainPage;

import java.util.concurrent.TimeUnit;

public class LoginTest {
    WebDriver driver;

    @BeforeMethod
    public void strartUp() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
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
    public void loginTest_CorrectCredentials_loggedToApp() {
        LoginPage loginPage = new LoginPage(driver);
        MainPage mainPage = loginPage.loginToApp("testpro.user03@testpro.io", "te$t$tudent");
        Assert.assertTrue(mainPage.isMain());
    }
    @Test
    public void loginTest_IncorrectCredentials_loggedToApp() {
        LoginPage loginPage = new LoginPage(driver);
        boolean check = loginPage.isError("testpro.user03@testpro.io", "wrongPassword");
        Assert.assertTrue(check);
    }

    @Test
    public void playlistTests_createPlaylist_PlaylistCreated() {
        LoginPage loginPage = new LoginPage(driver);
        MainPage mainPage = loginPage.loginToApp("testpro.user03@testpro.io","te$t$tudent");
        mainPage.createPlaylist("new new playlist");
        Assert.assertTrue(mainPage.checkPlaylist("new new playlist"));
    }

    @Test
    public void playlistTest_renamePlaylist_playlistRenamed() {
        LoginPage loginPage = new LoginPage(driver);
        MainPage mainPage = loginPage.loginToApp("testpro.user03@testpro.io","te$t$tudent");
        mainPage.renamePlaylist("new new playlist", "NEW playlist ");
        Assert.assertTrue(mainPage.checkPlaylist("NEW playlist"));
    }

}
